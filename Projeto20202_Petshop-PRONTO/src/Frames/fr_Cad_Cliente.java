
package Frames;

import Objetos.Objeto_Cliente;
import Objetos.Objeto_Sexo;

import BancoDados.BD_Cliente;
import BancoDados.BD_Sexo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fr_Cad_Cliente extends javax.swing.JFrame {

    private BD_Cliente bd_cli = new BD_Cliente();
    private BD_Sexo bd_sx = new BD_Sexo();
    private Objeto_Cliente RegistroCliente= new Objeto_Cliente ();
    
    private ArrayList<Objeto_Sexo> ListaSexo = new ArrayList();
    
    private String Operacao;
    
       
    public fr_Cad_Cliente() {
       initComponents();
        
        try {
            CargaTabela ();
            CargaListaSexo();
            CargaComboBox ();
            Desabilita ();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        Operacao="";
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lb_nome = new javax.swing.JLabel();
        lb_dt_nascimento = new javax.swing.JLabel();
        lb_cpf = new javax.swing.JLabel();
        lb_sexo = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        tf_dt_nascimento = new javax.swing.JTextField();
        tf_cpf = new javax.swing.JTextField();
        cb_sexo = new javax.swing.JComboBox<>();
        bt_limpar = new javax.swing.JToggleButton();
        bt_incluir = new javax.swing.JToggleButton();
        bt_excluir = new javax.swing.JToggleButton();
        bt_alterar = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_cad_cliente = new javax.swing.JTable();
        lb_cd_cliente = new javax.swing.JLabel();
        tf_cd_cliente = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Cliente");

        lb_nome.setText("Nome");

        lb_dt_nascimento.setText("Data de nascimento");

        lb_cpf.setText("CPF");

        lb_sexo.setText("Sexo");

        bt_limpar.setText("Limpar");
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });

        bt_incluir.setSelected(true);
        bt_incluir.setText("Incluir");
        bt_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_incluirActionPerformed(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_alterar.setText("Alterar");
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        tb_cad_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data de Nascimento", "CPF", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_cad_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_cad_clienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_cad_cliente);

        lb_cd_cliente.setText("Código");
        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nome)
                        .addGap(28, 28, 28)
                        .addComponent(bt_incluir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_cd_cliente)
                        .addGap(18, 18, 18)
                        .addComponent(tf_cd_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_limpar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_sexo)
                            .addComponent(lb_cpf))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_excluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_alterar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lb_dt_nascimento)
                        .addGap(18, 18, 18)
                        .addComponent(tf_dt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(bt_incluir))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_cd_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_cd_cliente))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb_nome)
                                .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_limpar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bt_excluir)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_dt_nascimento)
                            .addComponent(tf_dt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_cpf))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_alterar)
                    .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sexo))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_cad_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_cad_clienteMouseClicked
        CarregaTabela_TextFileld();
        MontaTela();
    }//GEN-LAST:event_tb_cad_clienteMouseClicked

    private void bt_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_incluirActionPerformed
        int cd_sexo = 0;
         
        if(Operacao.equals("Incluir")) 
        {
        
            if(isCamposPreenchidos ()) 
            {

                carregaRegCliente ();
                
                if(isCamposValidos()) {
                
                    try {
                        cd_sexo = bd_sx.busca_ds_sexo(RegistroCliente.getDs_sexo());
                        RegistroCliente.setCd_sexo(cd_sexo);
                        
                    } 
                    catch (Exception ex) {
                        
                       JOptionPane.showMessageDialog(null,"Erro ao buscar Sexo\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                    }
                    
                    try {
                    
                        if(bd_cli.InserirCliente(RegistroCliente)) {
                            
                            JOptionPane.showMessageDialog(null,"Cliente incluído com Sucesso","MENSAGEM",JOptionPane.INFORMATION_MESSAGE);     
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,"Erro ao incluir Cliente. Erro de Dados","ERRO BD",JOptionPane.ERROR_MESSAGE);     
                        }
                        
                    }  
                    catch (Exception ex) {
                        
                       JOptionPane.showMessageDialog(null,"Erro ao incluir Cliente\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                       
                    } 
                    finally {
                        
                        try {
                            
                            CargaTabela ();
                            CargaListaSexo();
                            CargaComboBox ();
                            Desabilita ();
                            
                            } 
                            catch (Exception ex) {
                                
                                JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                            }
                        
                        Operacao="";
                        
                    } // finally 
                    
                    
                } 
                else { //  if(isCamposValidos()) {
                    
                   JOptionPane.showMessageDialog(null, "Preencha Corretamente:\n Nome cliente com até 100 caracteres;\n Data de nascimento com até 15 caracteres;\n CPF com até 30 caracteres","ERRO",JOptionPane.ERROR_MESSAGE);
                }
                
                
            } 
            else { // if(isCamposPreenchidos ()) {
           
               JOptionPane.showMessageDialog(null, "Preencha todos os campos!","ERRO",JOptionPane.ERROR_MESSAGE);
            }


            
        }
        else { // if(Operacao.equals("Incluir")) {
            
            Operacao="Incluir"; 
            Limpar();
            habilitaEdicao ();
        }
        
    }//GEN-LAST:event_bt_incluirActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        
        int resp=0;
        
        if(ClienteSelecionado()) {
           
           resp=JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           
           if(resp==0) {
             
               try {
                   if (bd_cli.ExcluiCliente(Integer.parseInt(tf_cd_cliente.getText().trim()))) {
               
                       JOptionPane.showMessageDialog(null,"Cliente excluído com sucesso.","Mensagem",JOptionPane.INFORMATION_MESSAGE); 
                   } 
                   else {
                       
                       JOptionPane.showMessageDialog(null,"Erro ao excluir cliente. Erro Dados.","ERRO BD",JOptionPane.ERROR_MESSAGE);
                   }
                   
               }  
               
               catch (Exception ex) {
                   
                       JOptionPane.showMessageDialog(null,"Erro ao excluir cliente\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
               }
               finally {
                   
                   try {
                            CargaTabela ();
                            CargaListaSexo();
                            CargaComboBox ();
                            Desabilita ();
                            
                        } 
                   
                        catch (Exception ex) {
                            
                            JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                   
                        Operacao="";
                        
               }
               
           } 
           
       } 
        
       else {
            
           JOptionPane.showMessageDialog(null, "Selecione o Cliente a excluir","ERRO",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        Limpar();
    }//GEN-LAST:event_bt_limparActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        int cd_sexo = 0;
         
        if(Operacao.equals("Alterar")) 
        {
        
            if(isCamposPreenchidos ()) 
            {

                carregaRegCliente ();
                
                if(isCamposValidos()) {
                
                    try {
                        cd_sexo = bd_sx.busca_ds_sexo(RegistroCliente.getDs_sexo());
                        RegistroCliente.setCd_sexo(cd_sexo);
                        
                    } 
                    catch (Exception ex) {
                        
                       JOptionPane.showMessageDialog(null,"Erro ao buscar Sexo\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                    }
                    
                    try {
                    
                        if(bd_cli.AlterarCliente(RegistroCliente)) {
                            
                            JOptionPane.showMessageDialog(null,"Cliente alterado com Sucesso","MENSAGEM",JOptionPane.INFORMATION_MESSAGE);     
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,"Erro ao alterar Cliente. Erro de Dados","ERRO BD",JOptionPane.ERROR_MESSAGE);     
                        }
                        
                    }  
                    catch (Exception ex) {
                        
                       JOptionPane.showMessageDialog(null,"Erro ao alterar Cliente\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                       
                    } 
                    finally {
                        
                        try {
                            
                            CargaTabela ();
                            CargaListaSexo();
                            CargaComboBox ();
                            Desabilita ();
                            
                            } 
                            catch (Exception ex) {
                                
                                JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                            }
                        
                        Operacao="";
                        
                    } // finally 
                    
                    
                } 
                else { //  if(isCamposValidos()) {
                    
                   JOptionPane.showMessageDialog(null, "Preencha Corretamente:\n Nome cliente com até 100 caracteres;\n Data de nascimento com até 15 caracteres;\n CPF com até 30 caracteres","ERRO",JOptionPane.ERROR_MESSAGE);
                }
                
                
            } 
            else { // if(isCamposPreenchidos ()) {
           
               JOptionPane.showMessageDialog(null, "Preencha todos os campos!","ERRO",JOptionPane.ERROR_MESSAGE);
            }


            
        }
        else { // if(Operacao.equals("Alterar")) {
            
            Operacao="Alterar"; 
     
            habilitaEdicao ();
        }
        
                             
    }//GEN-LAST:event_bt_alterarActionPerformed

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Cad_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bt_alterar;
    private javax.swing.JToggleButton bt_excluir;
    private javax.swing.JToggleButton bt_incluir;
    private javax.swing.JToggleButton bt_limpar;
    private javax.swing.JComboBox<String> cb_sexo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_cd_cliente;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_dt_nascimento;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_sexo;
    private javax.swing.JTable tb_cad_cliente;
    private javax.swing.JTextField tf_cd_cliente;
    private javax.swing.JTextField tf_cpf;
    private javax.swing.JTextField tf_dt_nascimento;
    private javax.swing.JTextField tf_nome;
    // End of variables declaration//GEN-END:variables

    private void carregaRegCliente () {
        int sx = 0;
        
              
        if(Operacao.equals("Alterar")) {
        RegistroCliente.setCd_cliente(Integer.parseInt(tf_cd_cliente.getText().trim()));
        }
        RegistroCliente.setNm_cliente(tf_nome.getText().trim());        
        RegistroCliente.setDt_nascimento(tf_dt_nascimento.getText().trim()); 
        RegistroCliente.setNr_cpf(tf_cpf.getText().trim());
        
        sx = cb_sexo.getSelectedIndex();
        RegistroCliente.setCd_sexo(ListaSexo.get(sx).getCd_sexo());
        
        RegistroCliente.setDs_sexo(cb_sexo.getSelectedItem().toString());
        
    }
    
  private void Desabilita () {  
        Limpar();
        tf_cd_cliente.setEditable(false);
        tf_nome.setEditable(false);
        tf_dt_nascimento.setEditable(false);
        tf_cpf.setEditable(false);
  }  
    
  private void habilitaConsulta () {
        Limpar();
        tf_cd_cliente.setEditable(true);
        tf_nome.setEditable(false);
        tf_dt_nascimento.setEditable(false);
        tf_cpf.setEditable(false);
       // cb_sexo.setEditable(false);
    }
    
    private void habilitaEdicao () {
        
        tf_cd_cliente.setEditable(false);
        tf_nome.setEditable(true);
        tf_dt_nascimento.setEditable(true);
        tf_cpf.setEditable(true);
       // cb_sexo.setEditable(true);
    }

    private void MontaTela() {
     
        tf_nome.setText(RegistroCliente.getNm_cliente());        
        tf_dt_nascimento.setText(RegistroCliente.getDt_nascimento());  
        tf_cpf.setText(RegistroCliente.getNr_cpf());  
        tf_cd_cliente.setText(String.valueOf(RegistroCliente.getCd_cliente()));
        
        cb_sexo.setSelectedItem(RegistroCliente.getDs_sexo());
    }
    
    private void Limpar() {
         tf_cd_cliente.setText(null);      
         tf_nome.setText(null);
         tf_dt_nascimento.setText(null);
         tf_cpf.setText(null);
         cb_sexo.setSelectedIndex(-1);
        
    }
    
    private  boolean isCamposPreenchidos () {
       boolean saida=false;
       
       if((!tf_nome.getText().trim().isEmpty())&&(!tf_dt_nascimento.getText().trim().isEmpty()) &&
          (!tf_cpf.getText().trim().isEmpty()) &&(cb_sexo.getSelectedIndex()!=-1))
       {  
           saida=true;
       }
       
       return saida;
    }
    
    public void CargaTabela () throws Exception {
        try {
            
        
           DefaultTableModel modelo = (DefaultTableModel) tb_cad_cliente.getModel();
           modelo.setNumRows(0);  // zera qtde de linhas tabela 
           modelo.setRowCount(0);
           
           for(Objeto_Cliente registro: bd_cli.CarregarListaCliente()) {
               modelo.addRow( new Object [] 
                            {
                               registro.getCd_cliente(),
                               registro.getNm_cliente(),
                               registro.getDt_nascimento(),
                               registro.getNr_cpf(),
                               registro.getDs_sexo()
                               
                            }
                            );
           }
           
        } catch (Exception ex)   {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Cadastrar Cliente\n"+ex.getMessage(), "ERRO GRID", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void CarregaTabela_TextFileld() {
        
         RegistroCliente.setCd_cliente((int) tb_cad_cliente.getValueAt(tb_cad_cliente.getSelectedRow(),0));
         RegistroCliente.setNm_cliente((String) tb_cad_cliente.getValueAt(tb_cad_cliente.getSelectedRow(),1));
         RegistroCliente.setDt_nascimento((String) tb_cad_cliente.getValueAt(tb_cad_cliente.getSelectedRow(),2));
         RegistroCliente.setNr_cpf((String) tb_cad_cliente.getValueAt(tb_cad_cliente.getSelectedRow(),3));
         RegistroCliente.setDs_sexo(((String) tb_cad_cliente.getValueAt(tb_cad_cliente.getSelectedRow(),4)));
         
         
    }   
    
    public boolean isCamposValidos(){
         boolean saida=false;
         if ((RegistroCliente.is_Nm_Cliente_Valido()) &&
             (RegistroCliente.is_Nasc_Cliente_Valido()) &&
             (RegistroCliente.is_CPF_Cliente_Valido())) {
             saida=true;
         }
         return saida;
     }
    
     
      private void CargaListaSexo() throws Exception {
 
      
            ListaSexo  = bd_sx.CarregaListaSexo();
     
     
      }
      
      private void CargaComboBox () {
 
        Iterator<Objeto_Sexo> it = ListaSexo.iterator();
       
        while(it.hasNext()) {
           Objeto_Sexo  reg = it.next();
           String sexo = reg.getDs_sexo();
           
           cb_sexo.addItem(sexo);
        }
           
        cb_sexo.setSelectedIndex(-1); // volta indice do combo para não selecionado
     
 }
      
      
  private boolean ClienteSelecionado() {
      
     boolean saida= false;
     
     if((!tf_nome.getText().trim().isEmpty()) && 
        (!tf_dt_nascimento.getText().trim().isEmpty()) &&
        (!tf_cpf.getText().trim().isEmpty())){
         saida= true;
     }
     return saida;
  }
  

}//////////////////////////FIM DO MUNDO
