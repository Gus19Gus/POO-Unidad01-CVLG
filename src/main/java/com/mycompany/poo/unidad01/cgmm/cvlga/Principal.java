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
        
        System.out.println("Los nombres del Cliente son: "+cliente1.nombres);
        System.out.println("La direccion del cliente es: "+cliente1.direccion);
        System.out.println("El numero de cedula es :"+cliente1.numeroCedula);
        System.out.println("La fecha de compra es :"+cliente1.fechaCompra);
        System.out.println("");
        
        var cliente2 = new Cliente();
        cliente2.nombres= "Jorge Ayora";
        cliente2.direccion="Entique Segobiano";
        cliente2.numeroCedula="0132569845";
        cliente2.fechaCompra="21/08/2020";
        
        System.out.println("Los nombres del Cliente son: "+cliente2.nombres);
        System.out.println("La direccion del cliente es: "+cliente2.direccion);
        System.out.println("El numero de cedula es :"+cliente2.numeroCedula);
        System.out.println("La fecha de compra es :"+cliente2.fechaCompra);
        System.out.println("");
        
        //Clase Electrodomestico
        var electrodomestico1 = new Electrodomestico();
        electrodomestico1.marca="Indurama";
        electrodomestico1.modelo="Regrigeradora RI-385/12 pies ";
        electrodomestico1.color="Gris";
        electrodomestico1.fechaFabricacion="02/03/2020";
        
        System.out.println("La marca del electrodomestico es : "+electrodomestico1.marca);
        System.out.println("El modelo del electrodomestico es : "+electrodomestico1.modelo);
        System.out.println("El color del elctrodomestico es :"+electrodomestico1.color);
        System.out.println("La fecha de fabricacion del electrodomestico es :"+electrodomestico1.fechaFabricacion);
        System.out.println("");
        
        var electrodomestico2 = new Electrodomestico();
        electrodomestico2.marca="Mabe";
        electrodomestico2.modelo="Cocina 4 quemandores";
        electrodomestico2.color="Blanco";
        electrodomestico2.fechaFabricacion="29/09/2020";
        
        System.out.println("La marca del electrodomestico es : "+electrodomestico2.marca);
        System.out.println("El modelo del electrodomestico es : "+electrodomestico2.modelo);
        System.out.println("El color del elctrodomestico es :"+electrodomestico2.color);
        System.out.println("La fecha de fabricacion del electrodomestico es :"+electrodomestico2.fechaFabricacion);
        System.out.println("");
        
        //Clase Producto
        var producto1 = new Producto();
        producto1.cantidadProducto="2 productos";
        producto1.nombreProducto="Juego de Sala y centro de mesa";
        producto1.fechaEntrega="22/06/2020";
        producto1.numeroSerie="235694556---- otro ---2568984568";
        
        System.out.println("La cantidad de productos son :"+producto1.cantidadProducto);
        System.out.println("El nombre de productos son :"+producto1.nombreProducto);
        System.out.println("La fecha de entrega es :"+producto1.fechaEntrega);
        System.out.println("El numero de serie es :"+producto1.numeroSerie);
        System.out.println("");
        
        var producto2 = new Producto();
        producto2.cantidadProducto="1 productos";
        producto2.nombreProducto="Tv 50 pulgadas";
        producto2.fechaEntrega="22/02/2022";
        producto2.numeroSerie="453256985";
        
        System.out.println("La cantidad de productos son :"+producto2.cantidadProducto);
        System.out.println("El nombre de productos son :"+producto2.nombreProducto);
        System.out.println("La fecha de entrega es :"+producto2.fechaEntrega);
        System.out.println("El numero de serie es :"+producto2.numeroSerie);
        System.out.println("");
        
        //Clase Proveedor
        var proveedor1 = new Proveedor();
        proveedor1.nombreProveedor="Anabel Tenesaca";
        proveedor1.direccion="Turi Centro";
        proveedor1.pecioEnvio="$ 50";
        proveedor1.transporteProveedor="Camion hino";
        
        System.out.println("Nombre de proveedor :"+proveedor1.nombreProveedor);
        System.out.println("Direccion de proveedor :"+proveedor1.direccion);
        System.out.println("El precio del envio es :"+proveedor1.pecioEnvio);
        System.out.println("El transporte del proveedor es :"+proveedor1.transporteProveedor);
        System.out.println("");
        
        var proveedor2 = new Proveedor();
        proveedor2.nombreProveedor="Angel Patiño";
        proveedor2.direccion="Elia Liut y Calle Vieja";
        proveedor2.pecioEnvio="$ 20";
        proveedor2.transporteProveedor="Moto Honda";
        
        System.out.println("Nombre de proveedor :"+proveedor2.nombreProveedor);
        System.out.println("Direccion de proveedor :"+proveedor2.direccion);
        System.out.println("El precio del envio es :"+proveedor2.pecioEnvio);
        System.out.println("El transporte del proveedor es :"+proveedor2.transporteProveedor);
        System.out.println("");
        
        //Clase Transporte
        var transporte1 = new Transporte();
        transporte1.nombreConductor=" Kevin Mejia";
        transporte1.marcaVehiculo="Chevrolet Aveo";
        transporte1.horaLlegada="10:10";
        transporte1.valoracionConductor="4 estrellas";
        
        System.out.println("El nombre del conductor es :"+transporte1.nombreConductor);
        System.out.println("La marca del vehiculo es : "+transporte1.marcaVehiculo);
        System.out.println("La hora de llegada del vehiculo es :"+transporte1.horaLlegada);
        System.out.println("La valoracion del conductor es :"+transporte1.valoracionConductor);
        System.out.println("");
        
        var transporte2 = new Transporte();
        transporte2.nombreConductor="Juan Alvarez";
        transporte2.marcaVehiculo="Chevrolet Camaro";
        transporte2.horaLlegada="13:00";
        transporte2.valoracionConductor="5 estrellas";
        
        System.out.println("El nombre del conductor es :"+transporte2.nombreConductor);
        System.out.println("La marca del vehiculo es : "+transporte2.marcaVehiculo);
        System.out.println("La hora de llegada del vehiculo es :"+transporte2.horaLlegada);
        System.out.println("La valoracion del conductor es :"+transporte2.valoracionConductor);
        System.out.println("");
    }
    
}
