/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.poo.unidad01.cgmm.cvlga;

/**
 *
 * @author HP USER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clase Cliente
        var cliente = new Cliente();
        cliente.nombres= "Rosa Flores";
        cliente.direccion="General Torres y Santa Teresita";
        
        System.out.println("Los nombres del Cliente son: "+cliente.nombres);
        System.out.println("La direccion del cliente es: "+cliente.direccion);
        System.out.println("");
        
        //Clase Electrodomesticos
        var electrodomesticos = new Electrodomesticos();
        electrodomesticos.marca="Indurama";
        electrodomesticos.modelo="Regrigeradora RI-385/12 pies ";
        
        System.out.println("La marca del electrodomestico es : "+electrodomesticos.marca);
        System.out.println("El modelo del electrodomestico es : "+electrodomesticos.modelo);
        System.out.println("");
        
        //Clase Productos
        var productos = new Productos();
        productos.cantidadproducto="2 productos";
        productos.nombrepoducto="Juego de Sala y centro de mesa";
        
        System.out.println("La cantidad de productos son :"+productos.cantidadproducto);
        System.out.println("El nombre de productos son :"+productos.nombrepoducto);
        System.out.println("");
        
        //Clase Proveedor
        var proveedor = new Proveedor();
        proveedor.nombreproveedor="Anabel Tenesaca";
        proveedor.direccion="Turi Centro";
        
        System.out.println("Nombre de proveedor :"+proveedor.nombreproveedor);
        System.out.println("Direccion de proveedor :"+proveedor.direccion);
        System.out.println("");
        
        //Clase Transporte
        var transporte = new Transporte();
        transporte.nombreconductor=" Kevin Mejia";
        transporte.marcavehiculo="Chevrolet Aveo";
        
        System.out.println("El nombre del conductor es :"+transporte.nombreconductor);
        System.out.println("La marca del vehiculo es : "+transporte.marcavehiculo);
    }
    
}
