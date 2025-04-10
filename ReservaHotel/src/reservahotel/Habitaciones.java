/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservahotel;

/**
 *
 * @author maria
 */
public class Habitaciones {
    private int numero;
    private String tipo;
    private double precio;
    private String EstadoHabitacion;

    public Habitaciones(int numero, String tipo, double precio, String EstadoHabitacion) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.EstadoHabitacion = EstadoHabitacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstadoHabitacion() {
        return EstadoHabitacion;
    }

    public void setEstadoHabitacion(String EstadoHabitacion) {
        this.EstadoHabitacion = EstadoHabitacion;
    }

    public String getInfo() {
        return "Habitación " + numero + " | Tipo: " + tipo + " | Precio: $" + precio + " | Estado: " + EstadoHabitacion;
    }
}
