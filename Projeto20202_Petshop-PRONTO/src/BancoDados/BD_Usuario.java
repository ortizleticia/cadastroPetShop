
package BancoDados;

import DAO.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import Objetos.Objeto_Usuario;
import DAO.conexao;

public class BD_Usuario {
    
    conexao cnx;
    
    Objeto_Usuario RegistroUsuario;
    
    public boolean IncluirUsuario (Objeto_Usuario RegUsuario) throws Exception {
        
        boolean saida = false;
        
        cnx = new conexao();
        
        String SQL = "INSERT INTO USERS (nm_USUARIO,ds_LOGIN,ds_SENHA) \n" + "VALUES (?,?,?)";
        
       PreparedStatement ps = cnx.getConexao() .prepareStatement(SQL);
       
       ps.setString(1,RegUsuario.getNm_Usuario());
       ps.setString(2,RegUsuario.getDs_Login());
       ps.setString(3,RegUsuario.getDs_Senha());
       
       if (ps.executeUpdate() > 0) {
           saida= true;
       }   
        
        return saida;
    }
    
    public  Objeto_Usuario ConsultarUsuario (int codigo) throws Exception {
        
        RegistroUsuario = new Objeto_Usuario ();
        
        cnx = new conexao();
        
        String SQL = "SELECT * FROM USERS WHERE cd_USUARIO = ?";
        
        PreparedStatement ps = cnx.getConexao() .prepareStatement(SQL);
        ps.setInt(1, codigo);
       
        ResultSet rs = ps.executeQuery();
        
            while (rs.next ()) {
            
                RegistroUsuario.setCd_Usuario(rs.getInt("cd_USUARIO"));
                RegistroUsuario.setNm_Usuario(rs.getString("nm_USUARIO"));
                RegistroUsuario.setDs_Login(rs.getString("ds_LOGIN"));
                RegistroUsuario.setDs_Senha(rs.getString("ds_SENHA"));
             }
        return RegistroUsuario;
        
    }
}
