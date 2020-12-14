
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
    
    private Connection conexao;
    
    public conexao() throws Exception{ // gravando um exceção
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433; databaseName = PetShop";
        conexao = DriverManager.getConnection(url, "PetShop", "Petfofo123");     
    }
    
    public Connection getConexao() {
        return conexao;
    }
    
}
