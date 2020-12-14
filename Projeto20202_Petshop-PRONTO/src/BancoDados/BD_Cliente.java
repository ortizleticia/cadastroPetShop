
package BancoDados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DAO.conexao;
import Objetos.Objeto_Cliente;
import Objetos.Objeto_Sexo;

import java.util.ArrayList;

public class BD_Cliente {
    
    private conexao cnx;
    private Objeto_Cliente Registro_Cliente;
    private ArrayList<Objeto_Cliente> Lista;

    public  ArrayList<Objeto_Cliente>   CarregarListaCliente () throws Exception {
        Lista = new  ArrayList();
        cnx = new conexao();
        
        String SQL = "SELECT T1.cd_cliente, T1.nm_cliente, T1.nr_cpf, T1.dt_nascimento, T1.cd_sexo, T2.ds_sexo"
                   + " FROM cliente AS T1"
                   + " INNER JOIN sexo AS T2 ON T1.cd_sexo = T2.cd_sexo" ;
        
        PreparedStatement ps = cnx.getConexao().prepareStatement(SQL);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Registro_Cliente = new Objeto_Cliente ();
            Registro_Cliente.setCd_cliente(rs.getInt("cd_cliente"));
            Registro_Cliente.setNm_cliente(rs.getString("nm_cliente"));
            Registro_Cliente.setNr_cpf(rs.getString("nr_cpf"));
            Registro_Cliente.setDt_nascimento(rs.getString("dt_nascimento"));
            Registro_Cliente.setCd_sexo(rs.getInt("cd_sexo"));
            Registro_Cliente.setDs_sexo(rs.getString("ds_sexo"));
            Lista.add(Registro_Cliente);
        }
        
        return Lista;
    } 
    
     public boolean ExcluiCliente (int cd_cliente) throws Exception {
        boolean saida=false;
        cnx = new conexao();
     
        String SQL = "DELETE FROM cliente  WHERE cd_cliente =  ?";
        
        PreparedStatement ps = cnx.getConexao().prepareStatement(SQL);
        
        ps.setInt(1, cd_cliente);
        
        if(ps.executeUpdate() > 0) {
           saida=true; 
        }
        
        return saida;
     }
     
     
     public boolean InserirCliente (Objeto_Cliente registro)  throws Exception {
        boolean saida=false;
        cnx = new conexao();
        
        String SQL = "INSERT INTO cliente (nm_cliente, dt_nascimento, nr_cpf, cd_sexo) VALUES (?,?,?,?)";
        
         PreparedStatement ps = cnx.getConexao().prepareStatement(SQL);
         ps.setString(1, registro.getNm_cliente());
         ps.setString(2,registro.getDt_nascimento());
         ps.setString(3,registro.getNr_cpf());
         ps.setInt(4,registro.getCd_sexo());
         
         if (ps.executeUpdate()>0) {
             saida=true;
         }
         
         return saida;
     }
    
     public boolean AlterarCliente (Objeto_Cliente registro)  throws Exception {
        boolean saida=false;
        cnx = new conexao();
        
        String SQL = "UPDATE  cliente SET nm_cliente = ?, dt_nascimento = ?, nr_cpf = ? WHERE cd_cliente = ?";
        
         PreparedStatement ps = cnx.getConexao().prepareStatement(SQL);
         ps.setString(1, registro.getNm_cliente());
         ps.setString(2,registro.getDt_nascimento());
         ps.setString(3,registro.getNr_cpf());
         ps.setInt(4,registro.getCd_cliente());
         
         if (ps.executeUpdate()>0) {
             saida=true;
         }
         
         return saida;
     }
    
    
    

    
}
