/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafacturacion.pkg1;

/**
 *
 * @author Aprendiz
 */
public class Linea {
    private int cantidad;
    private float precio;
    private String descripcion;
    
    // Constructor con parámetros
    public Linea(int cantidad, float precio, String descripcion) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    // Métodos getter
    public float getSubtotal() {
        return cantidad * precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    // Métodos setter
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

