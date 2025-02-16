/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Realizamos un import static del paquete
// Un import static nos permite importar métodos o atributos estáticos de una clase
import static paquete.domain.clases.Utileria.print; 

public class Pruebas {
    public static void main(String args[]){
        print("Imprimiendo desde la clase impresora");
        // Llamar un método con su Nombre totalmente calificado:
        // paquete.domain.clases.Utileria.print("Prueba");
    }
}
