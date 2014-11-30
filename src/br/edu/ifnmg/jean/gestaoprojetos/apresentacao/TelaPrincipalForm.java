/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.jean.gestaoprojetos.apresentacao;

import br.edu.ifnmg.jean.gestaoprojetos.entidades.Departamento;
import br.edu.ifnmg.jean.gestaoprojetos.entidades.Usuario;
import br.edu.ifnmg.jean.gestaoprojetos.negocio.DepartamentoBO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class TelaPrincipalForm extends javax.swing.JFrame {

    Usuario userLogado = new Usuario();

    /**
     * Creates new form TelaPrincipalForm
     */
    public TelaPrincipalForm(Usuario usuarioLogado) {
        initComponents();
        this.userLogado = usuarioLogado;
        this.dataHora();
        this.tipoUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastar = new javax.swing.JMenu();
        mnuCadDepartamento = new javax.swing.JMenuItem();
        mnuCadGerente = new javax.swing.JMenuItem();
        mnuCadEncarregado = new javax.swing.JMenuItem();
        mnuConsultar = new javax.swing.JMenu();
        mnuConsDepartamento = new javax.swing.JMenuItem();
        mnuConsGerente = new javax.swing.JMenuItem();
        mnuConsEncarregado = new javax.swing.JMenuItem();
        mnuProjeto = new javax.swing.JMenu();
        mnuProjetoProjeto = new javax.swing.JMenuItem();
        mnuProjetoAtividade = new javax.swing.JMenuItem();
        mnuAtividadesAtraso = new javax.swing.JMenuItem();
        mnuLancarHora = new javax.swing.JMenuItem();
        mnuRelatorios = new javax.swing.JMenu();
        mnuOpcoes = new javax.swing.JMenu();
        mnuEditarPerfil = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão de Projetos");
        setExtendedState(6);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/calendar-icon-black.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/cronometro--quarto-de-hora--logistica_318-36128.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/kuser.png"))); // NOI18N
        jLabel3.setText("Usuário: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/PNG/logo.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenuBar1.setAlignmentY(0.0F);
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setMaximumSize(new java.awt.Dimension(629, 32769));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(0, 2));
        jMenuBar1.setName(""); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(271, 40));

        mnuCadastar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/easymoblog.png"))); // NOI18N
        mnuCadastar.setText("Cadastrar    ");
        mnuCadastar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mnuCadDepartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        mnuCadDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/PNG/folder_blue.png"))); // NOI18N
        mnuCadDepartamento.setText("Departamento");
        mnuCadDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadDepartamentoActionPerformed(evt);
            }
        });
        mnuCadastar.add(mnuCadDepartamento);

        mnuCadGerente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_MASK));
        mnuCadGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/PNG/kuser.png"))); // NOI18N
        mnuCadGerente.setText("Gerente");
        mnuCadGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadGerenteActionPerformed(evt);
            }
        });
        mnuCadastar.add(mnuCadGerente);

        mnuCadEncarregado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_MASK));
        mnuCadEncarregado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/PNG/Login Manager.png"))); // NOI18N
        mnuCadEncarregado.setText("Encarregado");
        mnuCadEncarregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadEncarregadoActionPerformed(evt);
            }
        });
        mnuCadastar.add(mnuCadEncarregado);

        jMenuBar1.add(mnuCadastar);

        mnuConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/kfilereplace.png"))); // NOI18N
        mnuConsultar.setText("Consultar     ");

        mnuConsDepartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        mnuConsDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/PNG/folder_blue.png"))); // NOI18N
        mnuConsDepartamento.setText("Departamentos");
        mnuConsDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsDepartamentoActionPerformed(evt);
            }
        });
        mnuConsultar.add(mnuConsDepartamento);

        mnuConsGerente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        mnuConsGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/PNG/kuser.png"))); // NOI18N
        mnuConsGerente.setText("Gerente");
        mnuConsultar.add(mnuConsGerente);

        mnuConsEncarregado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        mnuConsEncarregado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/PNG/Login Manager.png"))); // NOI18N
        mnuConsEncarregado.setText("Encarregado");
        mnuConsultar.add(mnuConsEncarregado);

        jMenuBar1.add(mnuConsultar);

        mnuProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/knotes.png"))); // NOI18N
        mnuProjeto.setText("Projeto        ");

        mnuProjetoProjeto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        mnuProjetoProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/PNG/Linspire Quickstart Guide.png"))); // NOI18N
        mnuProjetoProjeto.setText("Projetos");
        mnuProjeto.add(mnuProjetoProjeto);

        mnuProjetoAtividade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        mnuProjetoAtividade.setText("Atividades");
        mnuProjeto.add(mnuProjetoAtividade);

        mnuAtividadesAtraso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        mnuAtividadesAtraso.setText("Atividades em Atraso");
        mnuProjeto.add(mnuAtividadesAtraso);

        mnuLancarHora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        mnuLancarHora.setText("Lançar Horas");
        mnuProjeto.add(mnuLancarHora);

        jMenuBar1.add(mnuProjeto);

        mnuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/Volume Manager.png"))); // NOI18N
        mnuRelatorios.setText("Relatórios    ");
        jMenuBar1.add(mnuRelatorios);

        mnuOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/configure.png"))); // NOI18N
        mnuOpcoes.setText("Opções     ");

        mnuEditarPerfil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        mnuEditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/PNG/aim.png"))); // NOI18N
        mnuEditarPerfil.setText("Editar perfil");
        mnuOpcoes.add(mnuEditarPerfil);

        jMenuBar1.add(mnuOpcoes);

        mnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/jean/gestaoprojetos/icones/shutdown.png"))); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadGerenteActionPerformed
        this.cadastrarUsuario("Gerente");
    }//GEN-LAST:event_mnuCadGerenteActionPerformed

    private void mnuCadDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadDepartamentoActionPerformed
        try {
            CadastroDepartamentoForm consDep = new CadastroDepartamentoForm();
            consDep.setVisible(true);
        } catch (IOException es) {

        }
    }//GEN-LAST:event_mnuCadDepartamentoActionPerformed

    private void mnuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSairMouseClicked
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnuSairMouseClicked

    private void mnuConsDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsDepartamentoActionPerformed
        try {
            ConsultarDepartamentoForm consDep = new ConsultarDepartamentoForm();
            consDep.setVisible(true);
        } catch (IOException es) {

        }
    }//GEN-LAST:event_mnuConsDepartamentoActionPerformed

    private void mnuCadEncarregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadEncarregadoActionPerformed
        this.cadastrarUsuario("Encarregado");
    }//GEN-LAST:event_mnuCadEncarregadoActionPerformed

    public void cadastrarUsuario(String tipo) {
        Departamento departamentoexiste = new Departamento();

        DepartamentoBO departamentoBO = new DepartamentoBO();
        try {
            departamentoexiste = departamentoBO.selecionarTodosDepratamentos();

            if (departamentoexiste == null) {
                JOptionPane.showMessageDialog(null, "É necessário cadastrar um departamento primeiro!!", "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {

                CadastroUsuarioForm cadUserForm = new CadastroUsuarioForm(tipo, userLogado);
                cadUserForm.setVisible(true);
            }
        } catch (SQLException ex) {

        }
    }

    public void dataHora() {
        txtUsuario.setText(userLogado.getNome());
        Date DataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data.setText(formato.format(DataSistema));

        Timer timer = new Timer(1000, new hora());
        timer.start();
    }

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            hora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }

    //FUnção para ocultar itens da tela de acordo com o tipo de usuário cadastrado
    public void tipoUsuario() {
        String cargo = this.userLogado.getCargo();

        if (cargo.equals("Diretor")) {
            this.mnuLancarHora.setVisible(false);
            this.mnuAtividadesAtraso.setVisible(false);
            this.mnuProjetoAtividade.setVisible(false);
        } else if (cargo.equals("Gerente")) {
            this.mnuCadGerente.setVisible(false);
            this.mnuCadDepartamento.setVisible(false);
            this.mnuConsDepartamento.setVisible(false);
            this.mnuConsGerente.setVisible(false);
            this.mnuLancarHora.setVisible(false);
        }else{
            this.mnuCadastar.setVisible(false);
            this.mnuConsultar.setVisible(false);
            this.mnuProjetoProjeto.setVisible(false);
            this.mnuAtividadesAtraso.setVisible(false);
            this.mnuRelatorios.setVisible(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnuAtividadesAtraso;
    private javax.swing.JMenuItem mnuCadDepartamento;
    private javax.swing.JMenuItem mnuCadEncarregado;
    private javax.swing.JMenuItem mnuCadGerente;
    private javax.swing.JMenu mnuCadastar;
    private javax.swing.JMenuItem mnuConsDepartamento;
    private javax.swing.JMenuItem mnuConsEncarregado;
    private javax.swing.JMenuItem mnuConsGerente;
    private javax.swing.JMenu mnuConsultar;
    private javax.swing.JMenuItem mnuEditarPerfil;
    private javax.swing.JMenuItem mnuLancarHora;
    private javax.swing.JMenu mnuOpcoes;
    private javax.swing.JMenu mnuProjeto;
    private javax.swing.JMenuItem mnuProjetoAtividade;
    private javax.swing.JMenuItem mnuProjetoProjeto;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
