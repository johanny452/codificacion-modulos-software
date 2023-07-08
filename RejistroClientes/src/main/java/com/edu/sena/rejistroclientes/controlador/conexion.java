
package com.edu.sena.rejistroclientes.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class conexion {
    
      private static Connection conect;
    public static void conectar (){
        
        String url = "jdbc:mysql://localhost:3306/clientes?serverTimeZone=UTC";
        String usr = "root";
        String ctr = "54321";
        
        try {
            conect=DriverManager.getConnection(url,usr,ctr);
            JOptionPane.showMessageDialog(null,"SI CONECTO");
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"NOO CONECTO");
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          
} 

    public static Connection getConect() {
        return conect;
    }
    
}
