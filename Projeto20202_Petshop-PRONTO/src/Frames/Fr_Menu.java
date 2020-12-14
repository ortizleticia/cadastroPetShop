
package Frames;


public class Fr_Menu extends javax.swing.JFrame {

    
    public Fr_Menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Mn_MenuPrincipal = new javax.swing.JMenu();
        Menu_Cadastro_Client = new javax.swing.JMenuItem();
        Menu_Cadastro_Sexo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU");

        Mn_MenuPrincipal.setText("Menu Principal");

        Menu_Cadastro_Client.setText("Cadastro Cliente");
        Menu_Cadastro_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Cadastro_ClientActionPerformed(evt);
            }
        });
        Mn_MenuPrincipal.add(Menu_Cadastro_Client);

        Menu_Cadastro_Sexo.setText("Cadastro Sexo");
        Menu_Cadastro_Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Cadastro_SexoActionPerformed(evt);
            }
        });
        Mn_MenuPrincipal.add(Menu_Cadastro_Sexo);

        jMenuItem1.setText("Cadastro Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Mn_MenuPrincipal.add(jMenuItem1);

        jMenuBar1.add(Mn_MenuPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_Cadastro_SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Cadastro_SexoActionPerformed
        fr_Cad_Sexo myTela = new fr_Cad_Sexo ();

        myTela.setVisible(true);
    }//GEN-LAST:event_Menu_Cadastro_SexoActionPerformed

    private void Menu_Cadastro_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Cadastro_ClientActionPerformed
        fr_Cad_Cliente myTela = new fr_Cad_Cliente ();

        myTela.setVisible(true);
    }//GEN-LAST:event_Menu_Cadastro_ClientActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       fr_CadastroUsuario myTela = new fr_CadastroUsuario ();

        myTela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Fr_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu_Cadastro_Client;
    private javax.swing.JMenuItem Menu_Cadastro_Sexo;
    private javax.swing.JMenu Mn_MenuPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
