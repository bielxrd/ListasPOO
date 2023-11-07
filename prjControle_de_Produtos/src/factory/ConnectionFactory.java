/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabriel.dramos1
 */
public class ConnectionFactory {
    
    public Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/projetofinaljava?useTimezone=true&serverTimezone=UTC", "root", "");
            
            
        } catch(SQLException excecao) {
            throw new RuntimeException(excecao);
            
        }
        
        
    }
    
    
    
    
}
