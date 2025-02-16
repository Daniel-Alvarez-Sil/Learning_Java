/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos el método "print"
import static domain.Print.print; 

// Importamos las clases de las cuales vamos ejecutar pruebas 
import domain.Padre; 
import domain.Hija; 


public class PruebaDeSobreescritura {
    public static void main(String args[]){
        var prueba1 = new Padre();
        var prueba2 = new Hija(); 
        
        print("Mensaje desde la superclase: "); 
        prueba1.mensaje();
        
        print("Mensaje sobreescrito en la subclase: ");
        prueba2.mensaje();
    }
}
