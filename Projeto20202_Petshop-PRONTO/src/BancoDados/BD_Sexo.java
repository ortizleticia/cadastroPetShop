
package BancoDados;

import DAO.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import Objetos.Objeto_Sexo;


public class BD_Sexo {
    
    conexao cnx;
    
    Objeto_Sexo RegistroSexo;
    
    private ArrayList<Objeto_Sexo> Lista;
    
    public ArrayList<Objeto_Sexo> CarregaListaSexo () throws Exception {
        
        Lista = new ArrayList ();
        
        cnx = new conexao ();
        
        String SQL = "SELECT cd_sexo, ds_sexo FROM sexo";
        
        PreparedStatement ps = cnx.getConexao().prepareStatement(SQL);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            
            RegistroSexo = new Objeto_Sexo ();
            
            RegistroSexo.setCd_sexo(rs.getInt("cd_sexo"));
            RegistroSexo.setDs_sexo(rs.getString("ds_sexo"));
           
            Lista.add(RegistroSexo);
                
        }
        return Lista;
    }
    
    public boolean IncluirSexo (Objeto_Sexo registro) throws Exception {
        boolean saida = false;
        
        cnx = new conexao ();
        
        String SQL = "INSERT INTO sexo (ds_sexo) VALUES (?)";
        
        PreparedStatement ps = cnx.getConexao() .prepareStatement(SQL);
        ps.setString(1,registro.getDs_sexo());
       
        
        
        if(ps.executeUpdate()>0){
            saida = true;
        }
        
        return saida;
       
    }
    
    public int busca_ds_sexo (String ds) throws Exception {
        int saida=0;
        cnx = new conexao();
        
        String SQL = "SELECT cd_sexo FROM sexo WHERE ds_sexo = ?";
        PreparedStatement ps = cnx.getConexao().prepareStatement(SQL);
        ps.setString(1, ds);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            saida=rs.getInt("cd_sexo");
        }
        return saida;
    }
    
    public boolean ExcluiSexo (int cd_sexo) throws Exception {
        boolean saida=false;
        cnx = new conexao();
     
        String SQL = "DELETE FROM sexo  WHERE cd_sexo =  ?";
        
        PreparedStatement ps = cnx.getConexao().prepareStatement(SQL);
        
        ps.setInt(1, cd_sexo);
        
        if(ps.executeUpdate() > 0) {
           saida=true; 
        }
        
        return saida;
     }


public boolean AlteraSexo (Objeto_Sexo registro) throws Exception {
        boolean saida=false;
        cnx = new conexao();
     
        String SQL = "UPDATE  sexo SET ds_sexo = ? WHERE cd_sexo = ?";
        
        PreparedStatement ps = cnx.getConexao().prepareStatement(SQL);
        ps.setString(1,registro.getDs_sexo());
        ps.setInt(2,registro.getCd_sexo());
       
        
        
        if(ps.executeUpdate()>0){
            saida = true;
        }
        
        return saida;
       
    }

}
