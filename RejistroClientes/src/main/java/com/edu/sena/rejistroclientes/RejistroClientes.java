/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edu.sena.rejistroclientes;

import com.edu.sena.rejistroclientes.controlador.conexion;
import com.edu.sena.rejistroclientes.vista.Manejadorpantallas;

/**
 *
 * @author EQUIPO
 */
public class RejistroClientes {

    public static void main(String[] args) {
        conexion.conectar();
        Manejadorpantallas.abrirpantallaclientes();
        
        
    }
}
