/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservahotel;

import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class ReservaHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel(2, 3);
         String nombre;
         int Cedula;
         int NumeroHabitacion;
             

        int opcion;

        do {
            String menu = "1. Ver habitaciones\n "
                    + "2. Reservar \n"
                    + "3. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, hotel.mostrarHabitaciones());
                    break;
                case 2:
                       Cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cedula"));
                       nombre = JOptionPane.showInputDialog("ingrese su nombre");
                       NumeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitación que desea reservar"));
                       JOptionPane.showMessageDialog(null, "Nombre:"+ nombre + "\n" + "Cedula:" + Cedula + "\n"+ "Numero de Habitación reservado:"+ NumeroHabitacion);
                       JOptionPane.showMessageDialog(null, "¡Gracias por su reserva lo esperamos!");
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "¡Gracias por usar el sistema!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion !=3 );
        
             
    }

    
    }

        
        
    
    

