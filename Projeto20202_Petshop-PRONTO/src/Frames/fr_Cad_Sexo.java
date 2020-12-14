
package Frames;

import BancoDados.BD_Sexo;
import Objetos.Objeto_Sexo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class fr_Cad_Sexo extends javax.swing.JFrame {

    private String Operacao;
    private Objeto_Sexo RegistroSexo = new Objeto_Sexo();
    private BD_Sexo bd_sexo = new BD_Sexo();
    
    public fr_Cad_Sexo() {
        initComponents();
        
        try {
            
        CargaTabela();
        
        } 
        
        catch (Exception ex) {
                
        JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Cadastro Sexo \n" +ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        
    }
        
        Operacao= "";
        
        DesabilitarEdicao();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_codigo = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        bt_limpar = new javax.swing.JButton();
        bt_incluir = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Cad_Sexo = new javax.swing.JTable();
        lb_sexo = new javax.swing.JLabel();
        tf_sexo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Sexo");

        lb_codigo.setText("Código");

        bt_limpar.setText("Limpar");
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });

        bt_incluir.setText("Incluir");
        bt_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_incluirActionPerformed(evt);
            }
        });

        bt_alterar.setText("Alterar");
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        tb_Cad_Sexo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Cad_Sexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_Cad_SexoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Cad_Sexo);

        lb_sexo.setText("Sexo");

        tf_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_codigo)
                            .addComponent(lb_sexo)
                            .addComponent(bt_limpar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_codigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(tf_sexo, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(bt_alterar)
                                .addGap(39, 39, 39)
                                .addComponent(bt_incluir)
                                .addGap(39, 39, 39)
                                .addComponent(bt_excluir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_sexo)
                    .addComponent(tf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_limpar)
                    .addComponent(bt_alterar)
                    .addComponent(bt_incluir)
                    .addComponent(bt_excluir))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_Cad_SexoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_Cad_SexoMouseClicked
        
        CarregaTabela_TextField ();
        MontaTela ();
    }//GEN-LAST:event_tb_Cad_SexoMouseClicked

    private void tf_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_sexoActionPerformed

    private void bt_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_incluirActionPerformed
        
        if(Operacao.equals("Incluir")){
            
            if(isCamposPreenchidos ()) {
                
                carrega_RegistroSexo ();
                
                if(isCamposOk()){
                    
                    //INICIO inclusão
                    
                    try{
                        
                        if(bd_sexo.IncluirSexo(RegistroSexo)){
                            
                            JOptionPane.showMessageDialog(null, "Incluído com sucesso", "MENSAGEM", JOptionPane.ERROR_MESSAGE);
                            
                        }
                        else{
                            
                            JOptionPane.showMessageDialog(null, "Erro ao incluir sexo\n", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    }
                    catch (Exception ex){
                        
                        JOptionPane.showMessageDialog(null, "Erro ao incluir sexo\n"+ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                        
                    }
                    
                    finally{
                        
                        Operacao = "";
                        limpar();
                        DesabilitarEdicao();
                        
                        try {
                            CargaTabela();
                        } 
                        catch (Exception ex) {
                            
                            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Cadastro sexo\n"+ex.getMessage(), "ERRO Incluir", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    }
                    
                    //FIM INCLUSÃO
                }
                else{
                    
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente: \n - Sexo até 200 caracteres", "ERRO", JOptionPane.ERROR_MESSAGE);  
                }
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Preencha todos os campos \n", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            
            Operacao = "Incluir";
            limpar ();
            HabilitarEdicao();
            
        }
    }//GEN-LAST:event_bt_incluirActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        limpar ();
    }//GEN-LAST:event_bt_limparActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        int resp=0;
        
        if(SexoSelecionado()) {
           
           resp=JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           
           if(resp==0) {
             
               try {
                   if (bd_sexo.ExcluiSexo(Integer.parseInt(tf_codigo.getText().trim()))) {
               
                       JOptionPane.showMessageDialog(null,"Sexo excluído com sucesso.","Mensagem",JOptionPane.INFORMATION_MESSAGE); 
                   } 
                   else {
                       
                       JOptionPane.showMessageDialog(null,"Erro ao excluir sexo. Erro Dados.","ERRO BD",JOptionPane.ERROR_MESSAGE);
                   }
                   
               }  
               
               catch (Exception ex) {
                   
                       JOptionPane.showMessageDialog(null,"Erro ao excluir sexo\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
               }
               finally {
                   
                   try {
                            CargaTabela ();
                            desabilita ();
                            
                        } 
                   
                        catch (Exception ex) {
                            
                            JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                   
                        Operacao="";
                        
               }
               
           } 
           
       } 
        
       else {
            
           JOptionPane.showMessageDialog(null, "Selecione o sexo a excluir","ERRO",JOptionPane.ERROR_MESSAGE);
       }
    
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        
        if(Operacao.equals("Alterar")){
            
            if(isCamposPreenchidos ()) {
                
                carrega_RegistroSexo ();
                
                if(isCamposOk()){
                    
                                       
                    try{
                        
                        if(bd_sexo.AlteraSexo(RegistroSexo)){
                            
                            JOptionPane.showMessageDialog(null, "Alterado com sucesso", "MENSAGEM", JOptionPane.ERROR_MESSAGE);
                            
                        }
                        else{
                            
                            JOptionPane.showMessageDialog(null, "Erro ao alterar sexo\n", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    }
                    catch (Exception ex){
                        
                        JOptionPane.showMessageDialog(null, "Erro ao alterar sexo\n"+ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                        
                    }
                    
                    finally{
                        
                        Operacao = "";
                        limpar();
                        DesabilitarEdicao();
                        
                        try {
                            CargaTabela();
                        } 
                        catch (Exception ex) {
                            
                            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Cadastro sexo\n"+ex.getMessage(), "ERRO Incluir", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    }
                    
                    
                }
                else{
                    
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente: \n - Sexo até 200 caracteres", "ERRO", JOptionPane.ERROR_MESSAGE);  
                }
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Preencha todos os campos \n", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            
            Operacao = "Alterar";
            
            HabilitarEdicao();
            
        }
    }//GEN-LAST:event_bt_alterarActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(fr_Cad_Sexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Sexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Sexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Sexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Cad_Sexo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_incluir;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_sexo;
    private javax.swing.JTable tb_Cad_Sexo;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_sexo;
    // End of variables declaration//GEN-END:variables

private boolean isCamposOk () {
    
    boolean saida= false;
    
    if((RegistroSexo.is_sexo_animal_VALIDO())){
        
        saida=true;
    }
    
    return saida;
    
}

private void carrega_RegistroSexo () {
    
    if(Operacao.equals("Alterar")) {
        RegistroSexo.setCd_sexo(Integer.parseInt(tf_codigo.getText().trim()));
        }
    
        RegistroSexo.setDs_sexo(tf_sexo.getText().trim());      
       
       
}

private boolean isCamposPreenchidos () {
    
    boolean saida = false;
    
    if((!tf_sexo.getText().trim().isEmpty())){   
       saida = true;
    }
        
    return saida;
}

public void limpar (){
    
    tf_codigo.setText(null);
    tf_sexo.setText(null);
      
}

public void HabilitarEdicao(){
    
    limpar ();
    
    tf_codigo.setEditable(false);
    tf_sexo.setEditable(true);
        
}

public void desabilita () {
        limpar();
        tf_codigo.setEditable(false);
        tf_sexo.setEditable(false);
        
    }

public void DesabilitarEdicao(){
    
    limpar ();
    
    tf_codigo.setEditable(false);
    tf_sexo.setEditable(false);
    
    
}

private void MontaTela() {
       
       tf_sexo.setText(RegistroSexo.getDs_sexo());
       tf_codigo.setText(String.valueOf(RegistroSexo.getCd_sexo()));
       
   }

private void CarregaTabela_TextField (){
    
    RegistroSexo.setCd_sexo((int) tb_Cad_Sexo.getValueAt(tb_Cad_Sexo.getSelectedRow(),0));
    RegistroSexo.setDs_sexo((String) tb_Cad_Sexo.getValueAt(tb_Cad_Sexo.getSelectedRow(),1));
    
}

public void CargaTabela() throws Exception{
    
    try{
    
    DefaultTableModel modelo = (DefaultTableModel) tb_Cad_Sexo.getModel();
    modelo.setNumRows(0);
    modelo.setRowCount(0);
    
    for (Objeto_Sexo reg : bd_sexo.CarregaListaSexo()) {
        modelo.addRow( new Object [] {
            reg.getCd_sexo(),
            reg.getDs_sexo(),
            
        }
        );
    }
    }// fim try// fim try
    catch (Exception ex)   {
        
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Cadastrar Sexo\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }  
    
}
    
    private boolean SexoSelecionado() {
      
     boolean saida= false;
     
     if((!tf_sexo.getText().trim().isEmpty())){
         saida= true;
     }
     return saida;
  }
    

















}/////////////////////////fim do mundo

