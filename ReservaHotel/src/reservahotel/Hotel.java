/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservahotel;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author maria
 */
public class Hotel {

    private Habitaciones[][] habitaciones;

    public Hotel(int pisos, int habitacionesPorPiso) {
        habitaciones = new Habitaciones[pisos][habitacionesPorPiso];
        precargarHabitaciones();
    }

    private void precargarHabitaciones() {
        int numero = 100;
        boolean Simple = true;

        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                String tipo;
                double precio;

                if (Simple) {
                    tipo = "Simple";
                    precio = 50.0;
                } else {
                    tipo = "Doble";
                    precio = 60.0;
                }

                habitaciones[i][j] = new Habitaciones(numero, tipo, precio, "libre");
                numero++;
                Simple = !Simple;
            }
        }

    }

    public String mostrarHabitaciones() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                sb.append(habitaciones[i][j].getInfo()).append("\n");
            }
        }
        return sb.toString();
    }
     
}
