/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemafacturacion;

/**
 *
 * @author USER
 */
public class Sistemafacturacion {

    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Agapito Piedralisa", "c/ Río Seco, 2", "123456789");
        
        // Crear factura
        Factura factura = new Factura(cliente, "18/4/2011");
        
        // Añadir productos
        factura.anadirLinea(1, "Ratón USB", 8.43f);
        factura.anadirLinea(2, "Memoria RAM 2GB", 21.15f);
        factura.anadirLinea(3, "Altavoces", 12.66f);
        
        // Imprimir factura
        factura.imprimirFactura();
    }
}
    

