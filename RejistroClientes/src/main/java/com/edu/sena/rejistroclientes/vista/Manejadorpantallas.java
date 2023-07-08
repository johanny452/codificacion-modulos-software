
package com.edu.sena.rejistroclientes.vista;


public class Manejadorpantallas {
    
   private static VClientes pantallaClientes;
   
    public static void abrirpantallaclientes() {
        
        pantallaClientes = new VClientes();
        pantallaClientes.setVisible(true);
        pantallaClientes.setLocationRelativeTo(null);
        
        
    }
   public static void cerrarpantallaclientes() {
        
        pantallaClientes = new VClientes();
        pantallaClientes.setVisible(false);
        pantallaClientes = null;
        
        
        
    }
    
}
