/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase para hacer pruebas
import domain.Empleado; 

// Importamos el método "print"
import static domain.Print.print; 


public class PruebasConLaClaseObject {
    public static void main(String args[]){
        // En la clase domain.Empleado, hemos sobreescrito 3 métodos de la clase object
        // Dichos métodos fueron: 
        /*
           hashCode
           equals
           toString
        */
        // Estos métodos es importante que los sobreescribamos cuando nuestras clases son usadas en un framework o junto con una clase para ordenar
        // Como comparar 2 instancias de una clase
            var prueba1 = new Empleado("Daniel", 3000);
            var prueba2 = new Empleado("Mariana", 3000);
                prueba2 = new Empleado("Daniel", 3000); 
            // Usando el operador '=='
            // Compara las direcciones de memoria, no el contenido
            if (prueba1 == prueba1)
                print("Las dos instancias tienen distintas direcciones de memoria. ");
            if (prueba1.equals(prueba2))
                print("Las dos clases son iguales en contenido. "); 
            if (prueba1.hashCode() == prueba2.hashCode())
                print("Las dos clases son iguales en contenido. ");
    }
}
