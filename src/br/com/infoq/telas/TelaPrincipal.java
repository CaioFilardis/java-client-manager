/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.infoq.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dektop = new javax.swing.JDesktopPane();
        lblData = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuCad = new javax.swing.JMenu();
        menuCadCli = new javax.swing.JMenuItem();
        menuCadUsu = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        dektop.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout dektopLayout = new javax.swing.GroupLayout(dektop);
        dektop.setLayout(dektopLayout);
        dektopLayout.setHorizontalGroup(
            dektopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        dektopLayout.setVerticalGroup(
            dektopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(102, 102, 102));
        lblData.setText("Data");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuario.setText("Usuário");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoq/icones/LogoUSer.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoq/icones/dateCalendar.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoq/icones/Logo(350x350).png"))); // NOI18N

        menuCad.setText("Cadastro");

        menuCadCli.setText("Clientes");
        menuCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadCliActionPerformed(evt);
            }
        });
        menuCad.add(menuCadCli);

        menuCadUsu.setText("Usuários");
        menuCadUsu.setEnabled(false);
        menuCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadUsuActionPerformed(evt);
            }
        });
        menuCad.add(menuCadUsu);

        menu.add(menuCad);

        menuAjuda.setText("Ajuda");

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        menu.add(menuAjuda);

        menuSair.setText("Opções");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSair.add(jMenuItem1);

        jMenuItem2.setText("Fale Conosco");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuSair.add(jMenuItem2);

        menu.add(menuSair);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dektop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dektop)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblData)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadCliActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT); // somente a data
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        
    }//GEN-LAST:event_menuSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Atenção!", JOptionPane.YES_NO_OPTION);
        
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // exibe a tela ao clicar no 'sobre'
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadUsuActionPerformed
       
        // chamar tela de usuários
        TelaUsuarios usuarios = new TelaUsuarios();
        usuarios.setVisible(true);
        dektop.add(usuarios);
        
    }//GEN-LAST:event_menuCadUsuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dektop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCad;
    private javax.swing.JMenuItem menuCadCli;
    public static javax.swing.JMenuItem menuCadUsu;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables
}
