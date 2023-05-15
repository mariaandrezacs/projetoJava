/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andreza
 
public class ConnectionFactory {
    public Connection getConnection() {
    try {
    return DriverManager.getConnection(
    "jdbc:mariadb://localhost/fj21", "root", "<SENHA DO BANCO AQUI>");
    } catch (SQLException e) {
    throw new RuntimeException(e);
 }
 }
}
package testeDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
*/
public class ConnectionFactory {
    public static void main(String[] args) throws SQLException {
        
        String strCon = "jdbc:mysql://localhost:3306/bancotestesjava?autoReconnect=true&useSSL=false";
        try{
            System.out.println("Testando driver...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver ok!");
            
            
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancotestesjava",
                    "root", "andreza");
            System.out.println("Conectado");
            
            
        }catch(ClassNotFoundException ex){
            System.out.println("Driver bichado >>>");
        }catch(SQLException e){
            throw new RuntimeException(e);
            //e.setNextException(e);
            //System.out.println("String de coneccao bixada");
        }
    }
}

