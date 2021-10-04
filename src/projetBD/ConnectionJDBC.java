package projetBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Base sur le design pattern 'Singleton', cette classe permet
 * d'avoir une instance unique de connexion avec la bd
 */
public class ConnectionJDBC {
	   static final String DB_URL = "jdbc:mysql://localhost:3307/test";
	   static final String USER = "manaaf";
	   static final String PASS = "MAN17,ouro";
	   
       public static Connection conn;

   public ConnectionJDBC() {
        try {
            conn= DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connexion OK");
        } 
        
        catch (SQLException e) {
            System.out.println("Connexion FAILED");
            // TODO Auto-generated catch block
            e.getLocalizedMessage();
        }
    }

    public static Connection getConnection() {
        if(conn == null) {
            new ConnectionJDBC();
        }
        return conn;
    }
}