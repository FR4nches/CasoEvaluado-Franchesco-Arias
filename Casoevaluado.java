/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.casoevaluado;

import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Casoevaluado {
        
    

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Nombre del agente:");
        String apellidos = JOptionPane.showInputDialog("Apellidos del agente:");
        String codigo = JOptionPane.showInputDialog("Codigo del agente:");
        String sucursal = JOptionPane.showInputDialog("Sucursal:");
        String respuestaVehiculo = JOptionPane.showInputDialog("¿Tiene vehiculo propio? (S/N):");
        boolean vehiculoPropio = respuestaVehiculo.equalsIgnoreCase("S");
        
        
        int seleccion;
        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("Selecione una opcion: " + "\n1. Registrar datos" + "\n2. Calificacion de facturas" + "\n3.Salir del programa"));
            if (seleccion >= 1 && seleccion <= 3) {
              
            }
                switch (seleccion) {
                    case 1:
                        registro();
                        break;  
                    case 2:
                        factura();
                    default:
                        JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
                        break;
                    
        }
        
        }while(seleccion != 3);
        
       
    }

}




