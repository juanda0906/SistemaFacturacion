/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafacturacion.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class Factura {
       private int sigId = 1;
    private static final int IVA = 18;
    private String fecha;
    private int id;
    private Cliente cliente;
    private List<Linea> lineas;
    
    // Constructor
    public Factura(Cliente cliente, String fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.id = getSigId();
        this.lineas = new ArrayList<>();
    }
    
    
    private int getSigId() {
        return sigId++;
    }
    
    
    public void anadirLinea(int cantidad, String descripcion, float precio) {
        Linea nuevaLinea = new Linea(cantidad, precio, descripcion);
        lineas.add(nuevaLinea);
    }
    
    
    public float calcularSubtotal() {
        float subtotal = 0;
        for (Linea linea : lineas) {
            subtotal += linea.getSubtotal();
        }
        return subtotal;
    }
    
   
    public float calcularIVA() {
        return calcularSubtotal() * IVA / 100.0f;
    }
    
    // Método para calcular total
    public float calcularTotal() {
        return calcularSubtotal() + calcularIVA();
    }
    
    // Método para imprimir factura
    public void imprimirFactura() {
        System.out.println("Factura n: " + id);
        System.out.println("Fecha: " + fecha);
        System.out.println();
        
        System.out.println("Datos del cliente");
        System.out.println("=================");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println();
        
        System.out.println("Detalle de la factura");
        System.out.println("====================");
        System.out.println("Línea;Producto;Cantidad;Precio ud.;Precio total");
        System.out.println("--");
        
        for (int i = 0; i < lineas.size(); i++) {
            Linea linea = lineas.get(i);
            System.out.println((i + 1) + ";" + linea.getDescripcion() + ";" + 
                             linea.getCantidad() + ";" + linea.getPrecio() + ";" + 
                             linea.getSubtotal());
        }
        
        System.out.println();
        System.out.printf("Subtotal: %.2f P%n", calcularSubtotal());
        System.out.println();
        System.out.printf("IVA (%d%%): %.2f P%n", IVA, calcularIVA());
        System.out.printf("TOTAL: %.2f P%n", calcularTotal());
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public List<Linea> getLineas() {
        return lineas;
    }
} 

