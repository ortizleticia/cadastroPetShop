
package Frames;

import javax.swing.JOptionPane;
import Objetos.Objeto_Usuario;
import BancoDados.BD_Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;


public class fr_CadastroUsuario extends javax.swing.JFrame {

    Objeto_Usuario RegUsuario = new Objeto_Usuario ();
    BD_Usuario bdUsuario = new BD_Usuario ();
    
    
    public fr_CadastroUsuario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lb_Codigo = new javax.swing.JLabel();
        lb_Nome = new javax.swing.JLabel();
        lb_Login = new javax.swing.JLabel();
        lb_Senha = new javax.swing.JLabel();
        tf_Codigo = new javax.swing.JTextField();
        tf_Login = new javax.swing.JTextField();
        tf_Senha = new javax.swing.JTextField();
        tf_Nome = new javax.swing.JTextField();
        bt_Incluir = new javax.swing.JButton();
        bt_Limpar = new javax.swing.JButton();
        bt_consultar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuarios");

        lb_Codigo.setText("Código:");

        lb_Nome.setText("Nome:");

        lb_Login.setText("Login:");

        lb_Senha.setText("Senha:");

        tf_Codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_CodigoFocusLost(evt);
            }
        });

        bt_Incluir.setText("Incluir");
        bt_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_IncluirActionPerformed(evt);
            }
        });

        bt_Limpar.setText("Limpar");
        bt_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LimparActionPerformed(evt);
            }
        });

        bt_consultar.setText("Consultar");
        bt_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Incluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_consultar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Codigo)
                            .addComponent(lb_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Login)
                            .addComponent(lb_Senha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 69, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Codigo)
                    .addComponent(tf_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Login)
                    .addComponent(tf_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Incluir)
                    .addComponent(bt_consultar)
                    .addComponent(bt_Limpar))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LimparActionPerformed
        Limpar();
    }//GEN-LAST:event_bt_LimparActionPerformed

    private void bt_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_IncluirActionPerformed
        if(isCamposPreenchidos()){
            
            carregaRegistroUsuario ();
            
            try {
                bdUsuario.IncluirUsuario(RegUsuario);
            } 
            
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de Dados \n" +ex.getMessage(), "Erro ao incluir", JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, por favor!", "Erro ao incluir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_IncluirActionPerformed

    private void bt_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultarActionPerformed
        
        habilitaConsulta ();
        
    }//GEN-LAST:event_bt_consultarActionPerformed

    private void tf_CodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_CodigoFocusLost
         if (tf_Codigo.getText().trim ().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha o código do usuário para consultar", "Erro consultar", JOptionPane.ERROR_MESSAGE);
        } 
        
        else{
            
            try{
                
                int codigo = Integer.parseInt(tf_Codigo.getText().trim ());
                
                RegUsuario = bdUsuario.ConsultarUsuario(codigo);
                
                if (RegUsuario.getCd_Usuario()== 0){
                    
                  JOptionPane.showMessageDialog(null, "Código não encontrado", "Erro ao consultar", JOptionPane.ERROR_MESSAGE);
                    
                } 
                
                MontaTela();
                
            }
            
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de Dados \n" +ex.getMessage(), "Erro ao incluir", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_tf_CodigoFocusLost


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
            java.util.logging.Logger.getLogger(fr_CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Incluir;
    private javax.swing.JButton bt_Limpar;
    private javax.swing.JButton bt_consultar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_Codigo;
    private javax.swing.JLabel lb_Login;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_Senha;
    private javax.swing.JTextField tf_Codigo;
    private javax.swing.JTextField tf_Login;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_Senha;
    // End of variables declaration//GEN-END:variables

   private void Limpar(){
       tf_Codigo.setText(null);
       tf_Login.setText (null);
       tf_Nome.setText  (null);
       tf_Senha.setText (null);
       
   }
   
   private boolean isCamposPreenchidos (){
    
    boolean saida=false;
    
    if((!tf_Login.getText().trim().isEmpty())&&
        (!tf_Senha.getText().trim().isEmpty())&&
            (!tf_Nome.getText().trim().isEmpty())){
        
        saida=true;
    }
    return saida;
    
}
   
   private void carregaRegistroUsuario () { 
   
    RegUsuario.setDs_Login(tf_Login.getText().trim());
    RegUsuario.setNm_Usuario(tf_Nome.getText().trim());
    RegUsuario.setDs_Senha(tf_Senha.getText().trim());
   }

   private void habilitaConsulta () {
       
       tf_Codigo.setEditable(true);
       tf_Login.setEditable (false);
       tf_Nome.setEditable  (false);
       tf_Senha.setEditable (false);
       
   }
   
   private void MontaTela() {
       
       tf_Login.setText(RegUsuario.getDs_Login());
       tf_Nome.setText(RegUsuario.getNm_Usuario());
       tf_Senha.setText(RegUsuario.getDs_Senha());
       tf_Codigo.setText(String.valueOf(RegUsuario.getCd_Usuario()));
   }
   
   
} ///////////////// Fim do mundo

