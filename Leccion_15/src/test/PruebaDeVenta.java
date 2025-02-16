/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clases necesarias para realizar la venta
import domain.Raton;
import domain.Teclado; 
import domain.Monitor; 
import domain.Computadora; 
import domain.Orden; 

// Importamos el método "print"
import static domain.Print.print; 

public class PruebaDeVenta {
    public static void main(String cArg[]){
        // Creación de objetos
            // Ratones
            var raton1      = new Raton("Bluetooth", "HP");
            var raton2      = new Raton("USB-A", "HP"); 
            // Teclados
            var teclado1    = new Teclado("Bluetooth", "HP"); 
            var teclado2    = new Teclado("USB-A", "HP");
            // Monitores
            var monitor1    = new Monitor("Samsung", 32.5); 
            var monitor2    = new Monitor("DELL", 16.8);
            // Computadoras 
            var compu1      = new Computadora("DAS", monitor1, teclado1, raton1); 
            var compu2      = new Computadora("SUMAN", monitor2, teclado2, raton2);
            // Orden
            var orden1      = new Orden(); 
            orden1.addComputadora(compu1);
            orden1.addComputadora(compu2);
            orden1.addComputadora(compu1);
            print(orden1.toString()); 
//            print(compu1.toString()); 
//            print(raton1.toString());
//            print(teclado1.toString());
    }
}
