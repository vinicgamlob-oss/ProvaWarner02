/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.*;
/**
 *
 * @author vinicius
 */
public class moduloConexao {
    
    
    
    public static Connection connector() {
        
       
    java.sql.Connection conexao = null;
    String driver = "com.mysql.cj.jdbc.Driver";
    // Verifique se o nome do banco 'AulaDia2904' está idêntico no MySQL
    String url = "jdbc:mysql://localhost:3306/clinica_medica";
    
    String user = "root";
    String password = "admin123";
    
    try {
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, user, password);
        return conexao; // Retorna a conexão se der certo
    } catch (ClassNotFoundException | SQLException e) {
        // Log do erro para você saber o que aconteceu se falhar
        System.out.println("Erro na conexão: " + e);
        return null; // Retorna null se der erro
    }
}

    }

    
    
    
    

