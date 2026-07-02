/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoevaluado;

import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class registro {
    String nombreCliente ;
    int cedulaCliente;
    int facturaCliente ;
    int codigoCliente ;
    int numeroMes ,Electricos,Automotrices,Construccion;
    String nombre;
   
   
   
    
    
    public void Registrarusuario() {
        JOptionPane.showMessageDialog(null, "Registro de libros");
        this.nombreCliente = nombreCliente = JOptionPane.showInputDialog("Escriba el titulo del libro: ");
         cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula del cliente"));
         facturaCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese factura del cliente"));
        codigoCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo del cliente"));
         numeroMes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del mes (sea especifico) "));
          Electricos = Integer.parseInt(JOptionPane.showInputDialog("Cuenta con productos electricos(si/no)"));
          Automotrices = Integer.parseInt(JOptionPane.showInputDialog("Cuenta con productos automotrices(si/no)"));
          Construccion = Integer.parseInt(JOptionPane.showInputDialog("Cuenta con productos de construccion (si/no)"));

        
         
        
    }  
    
    
    
    
     public void MostrarDatos() {
      JOptionPane.showMessageDialog(null, "==============================="+
                                        "\nUsuario registrado con exito: " + "\nnombreCliente: " 
              + nombreCliente + "\ncedula del cliente: " + cedulaCliente + "\nfactura del cliente: " + facturaCliente  + "\ncodigo del cliente: " + codigoCliente +"\n numero del mes"+numeroMes
              +"\n===============================");
    }
     
     
     
     
     public void calificacionFacturas(){
     
     double porcentajeBono = 0;
            int puntos = 0;

            if (facturaCliente.tieneLosTresTipos()) {
               
                porcentajeBono = porcentajeBono + 0.10;
                puntos = puntos + 3;
            } else {
                
                if (facturaCliente.getElectricos() >= 3) {
                    porcentajeBono = porcentajeBono + 0.04;
                    puntos = puntos + 1;
                } else if (facturaCliente.getElectricos() > 0) {
                    porcentajeBono = porcentajeBono + 0.02;
                    puntos = puntos + 1;
                }

                
                if (facturaCliente.getAutomotrices() > 4) {
                    porcentajeBono = porcentajeBono + 0.04;
                    puntos = puntos + 1;
                } else if (facturaCliente.getAutomotrices() > 0) {
                    porcentajeBono = porcentajeBono + 0.02;
                    puntos = puntos + 1;
                }

                
                if (facturaCliente.getConstruccion() > 0) {
                    porcentajeBono = porcentajeBono + 0.08;
                    puntos = puntos + 2;
                }
            }

            
            if (facturaCliente.getMonto() > 50000) {
                porcentajeBono = porcentajeBono + 0.05;
                puntos = puntos + 1;
            }
     
     
     }

}






