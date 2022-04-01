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
        var cliente1 = new Cliente();
        cliente1.nombres= "Rosa Flores";
        cliente1.direccion="General Torres y Santa Teresita";
        cliente1.numeroCedula="0110256489";
        cliente1.fechaCompra="01/04/2022";
        
        var cliente2 = new Cliente();
        cliente2.nombres= "Jorge Ayora";
        cliente2.direccion="Entique Segobiano";
        cliente2.numeroCedula="0132569845";
        cliente2.fechaCompra="21/08/2020";
        
        System.out.println("Los nombres del Cliente son: "+cliente1.nombres);
        System.out.println("La direccion del cliente es: "+cliente1.direccion);
        System.out.println("El numero de cedula es :"+cliente1.numeroCedula);
        System.out.println("La fecha de compra es :"+cliente1.fechaCompra);
        System.out.println("");
        
        System.out.println("Los nombres del Cliente son: "+cliente2.nombres);
        System.out.println("La direccion del cliente es: "+cliente2.direccion);
        System.out.println("El numero de cedula es :"+cliente2.numeroCedula);
        System.out.println("La fecha de compra es :"+cliente2.fechaCompra);
        System.out.println("");
        
        //Clase Electrodomestico
        var electrodomesticos = new Electrodomestico();
        electrodomesticos.marca="Indurama";
        electrodomesticos.modelo="Regrigeradora RI-385/12 pies ";
        
        System.out.println("La marca del electrodomestico es : "+electrodomesticos.marca);
        System.out.println("El modelo del electrodomestico es : "+electrodomesticos.modelo);
        System.out.println("");
        
        //Clase Producto
        var productos = new Producto();
        productos.cantidadProducto="2 productos";
        productos.nombreProducto="Juego de Sala y centro de mesa";
        
        
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
