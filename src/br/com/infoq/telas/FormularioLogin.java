/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.infoq.telas;
import br.com.infoq.dal.Conexao;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class FormularioLogin extends javax.swing.JFrame {
        
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    
    
    public void logar() {
        // verifica se existe usuário
        String sql = "SELECT * FROM tbusuario WHERE login = ? AND senha = ?";
        
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_usuario.getText());
            pst.setString(2, txt_senha.getText());
            
            // executa a query (consulta)
            result = pst.executeQuery();
            
            if (result.next()) {
                // pegar o campo de valor 6 (sexto campo do banco de dados coluna 'perfil')
                String perfil = result.getString(6);
                
                // define se é admin ou não
                if (perfil.equals("admin")) {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.menuCadUsu.setEnabled(true); // habilitando aba de usuários
                    TelaPrincipal.lblUsuario.setText(result.getString(2)); // retornando o nome do usuário
                    TelaPrincipal.lblUsuario.setForeground(Color.blue);
                    this.dispose();
                    conexao.close();
                } else {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.lblUsuario.setText(result.getString(2));
                    this.dispose();
                    conexao.close();
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválido");
            }
        } catch(Exception e) {
            
        }
    }
    
    /**
     * Creates new form FormularioLogin
     */
    public FormularioLogin() {
        initComponents();
        //setSize(736, 650);
        conexao = Conexao.conector();
        
        if (conexao != null) {
            lblstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoq/icones/dataBaseAccept.png")));
        } else {
            lblstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoq/icones/dataBaseError.png")));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_usuario = new javax.swing.JTextField();
        txt_senha = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        lblstatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        txt_usuario.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        txt_usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usuario);
        txt_usuario.setBounds(270, 260, 380, 60);

        txt_senha.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        getContentPane().add(txt_senha);
        txt_senha.setBounds(270, 370, 380, 60);

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infoq/img/Cadeado.png"))); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(470, 450, 180, 60);

        lblstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblstatus.setForeground(new java.awt.Color(255, 255, 255));
        lblstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoq/icones/dataBaseError.png"))); // NOI18N
        lblstatus.setText("jLabel1");
        getContentPane().add(lblstatus);
        lblstatus.setBounds(10, 10, 70, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infoq/img/teste.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -310, 736, 1277);

        setSize(new java.awt.Dimension(752, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    // btn login
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
          logar();
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
