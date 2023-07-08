
package com.edu.sena.rejistroclientes.controlador;

import com.edu.sena.rejistroclientes.modelo.clientes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CClientes {
    
    
     
     public void crearclientes(clientes e){
         
         try {
             Statement st= conexion.getConect().createStatement();
             st.execute("insert into clientes values ('"+e.getCedula()+"','"+e.getNombres()+"','"+e.getApellidos()+"','"+e.getDireccion()+"','"+e.getCorreo()+"','"+e.getTelefono()+"') ");
             JOptionPane.showMessageDialog(null, "CREADO");
             
             
         } catch (SQLException ex) {
             Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
             
             JOptionPane.showMessageDialog(null, "ERROR NOO CREADO");
         }
     
     }
     public ResultSet consultarClientes(){
         ResultSet rs=null;
         
         
         try {
             Statement st= conexion.getConect().createStatement();
              rs=st.executeQuery("select * from clientes ");
         } catch (SQLException ex) {
             Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
         }
          
    return rs;
     }
     
      public ResultSet consultarClientesporced(int cedula){
          
         ResultSet rs=null;
         
         try {
             Statement st= conexion.getConect().createStatement();
              rs=st.executeQuery("select * from clientes where ced_cli= '"+cedula+"' ");
              
         } catch (SQLException ex) {
             Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
         }
          
    return rs;
     }
      
      
     public void modificarClientes(clientes e ){
         
         
         try {
             Statement st= conexion.getConect().createStatement();
             st.execute("update clientes set nom_cli='"+e.getNombres()+"',ape_cli='"+e.getApellidos()+"',dir_cli='"+e.getDireccion()+"',corr_cli='"+e.getCorreo()+"',tel_cli='"+e.getTelefono()+"'where ced_cli='"+e.getCedula()+"'");
             JOptionPane.showMessageDialog(null, "ACTUALIZADO");
             
             
         } catch (SQLException ex) {
             Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     
     
     }
     
     
     
     public void eliminarclientes(int cedula){
         
     try {
             Statement st= conexion.getConect().createStatement();
             st.execute("delete from clientes where ced_cli= '"+cedula+"'");
             JOptionPane.showMessageDialog(null, "ELIMINADO");
             
             
         } catch (SQLException ex) {
             Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
             
             JOptionPane.showMessageDialog(null, "ERROR NOO ELIMINO");
         }
     }
     
     public static void pintartabla(JTable tabla, ResultSet rs) {
         
         DefaultTableModel modelo =  new DefaultTableModel();
         modelo.addColumn("cedula");
         modelo.addColumn("nombres");
         modelo.addColumn("apellidos");
         modelo.addColumn("direccion");
         modelo.addColumn("correo");
         modelo.addColumn("telefono");
         
         
         try {
             while (rs.next ()) {
                 String[]fila ={rs.getString("ced_cli"),rs.getString("nom_cli"),rs.getString("ape_cli"),rs.getString("dir_cli"),rs.getString("corr_cli"),rs.getString("tel_cli")};
                 modelo.addRow(fila);
                 
             }
             
             tabla.setModel(modelo);
             
         } catch (SQLException ex) {
             Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
        
    }
}
