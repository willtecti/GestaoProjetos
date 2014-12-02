/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.jean.gestaoprojetos.dados;

import br.edu.ifnmg.jean.gestaoprojetos.entidades.Projeto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JEAN CARLOS
 */
public class ProjetoDAO {
    
    //Inserir projeto
    private static final String SQL_INSERT_PROJETO = "INSERT INTO PROJETO(NOME, DESCRICAO, DATA_INICIO, DATA_TERMINIO, ID_DEPARTAMENTO) VALUES (?,?,?,?,?)";
    public void cadastrarProjeto(Projeto projeto) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;
        
        int id_departamento = selecionarIdDepartamento(projeto.getDepartamento().getCodigo());
        
        try {

            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_INSERT_PROJETO);

            comando.setString(1, projeto.getNome());
            comando.setString(2, projeto.getDescricao());
            comando.setDate(3, (Date) projeto.getDataInicio());
            comando.setDate(4, (Date) projeto.getDataTerminio());
            comando.setInt(5, id_departamento);

            comando.execute();
            conexao.commit();

        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }

        } finally {
            if (comando != null && !comando.isClosed()) {
                comando.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }
    
    //Selecionar Id do departamento
    private static final String SQL_SELECT_ID_DEPARTAMENTO_CODIGO = "SELECT ID_DEPARTAMENTO FROM DEPARTAMENTOS WHERE CODIGO = ?";

    private int selecionarIdDepartamento(String codigo) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        int id_departamento = -1;

        try {

            conexao = BancoDadosUtil.getConnection();

            comando = conexao.prepareStatement(SQL_SELECT_ID_DEPARTAMENTO_CODIGO);

            comando.setString(1, codigo);

            resultado = comando.executeQuery();

            if (resultado.next()) {
                id_departamento = resultado.getInt("ID_DEPARTAMENTO");
            }

            conexao.commit();

        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
        } finally {
            if (comando != null && !comando.isClosed()) {
                comando.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
        return id_departamento;
    }
    
    //Selecionar se não existe nenhum projeto cadastrado no departamento com o mesmo nome
    
    private static final String SQL_SELECT_PROJETO_POR_NOME = "SELECT  NOME, DESCRICAO, DATA_INICIO, DATA_TERMINIO, ID_DEPARTAMENTO FROM PROJETO WHERE NOME = ? AND ID_DEPARTAMENTO = ? ";

    public Projeto selecionarNomeprojeto(Projeto proj) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        Projeto projeto = null;
        
        int id_departamento = this.selecionarIdDepartamento(proj.getDepartamento().getCodigo());
        
        try {

            conexao = BancoDadosUtil.getConnection();

            comando = conexao.prepareStatement(SQL_SELECT_PROJETO_POR_NOME);
            comando.setString(1, proj.getNome());
            comando.setInt(1, id_departamento);
            resultado = comando.executeQuery();

            if (resultado.next()) {
                projeto = new Projeto();
                projeto.setNome(resultado.getString("NOME"));
                projeto.setDescricao(resultado.getString("DESCRICAO"));
                projeto.setDataInicio(resultado.getDate("DATA_INICIO"));
                projeto.setDataTerminio(resultado.getDate("DATA_TERMINIO"));

                DepartamentoDAO depDAO = new DepartamentoDAO();
                projeto.setDepartamento(depDAO.selecionarDepartamentoPorCodigo(resultado.getString("ID_DEPARTAMENTO")));

            }

            conexao.commit();

        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
        } finally {
            if (comando != null && !comando.isClosed()) {
                comando.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
        return projeto;
    }
    // Preencher tabela projetos
    private static final String SQL_TODOS_PROJETOS_TABELA = "SELECT ID_PROJETO AS CÓDIGO ,  NOME  , DESCRICAO as DESCRIÇÃO ,DATE_FORMAT(DATA_INICIO, '%d-%m-%Y') as INÍCIO , DATE_FORMAT(DATA_TERMINIO, '%d-%m-%Y') as TÉRMINIO , DEPARTAMENTOS.NOME AS DEPARTAMENTO FROM PROJETO JOIN DEPARTAMENTOS ON (PROJETO.ID_DEPARTAMENTO =  DEPARTAMENTOS.ID_DEPARTAMENTO)"
            + " WHERE DEPARTAMENTOS.NOME = ? ";
    public ResultSet preencherTabela(String Departamento) throws SQLException {

        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {

            conexao = BancoDadosUtil.getConnection();

            comando = conexao.prepareStatement(SQL_TODOS_PROJETOS_TABELA);
            comando.setString(1, Departamento);

            resultado = comando.executeQuery();

            conexao.commit();

        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }

        } finally {
            if (comando != null && !comando.isClosed()) {
                comando.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }

        return resultado;

    }
}
