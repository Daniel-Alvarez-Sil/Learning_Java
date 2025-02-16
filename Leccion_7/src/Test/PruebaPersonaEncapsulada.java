/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase de PersonaEncapsulada
// Si nunca se usa la importación en el programa, la clase no se carga en la memoria
import Dominio.PersonaEncapsulada; 

public class PruebaPersonaEncapsulada {
    // Prueba de la clase de PersonaEncapsulada
    public static void main(String args[]){
        var prueba1 = new PersonaEncapsulada("Daniel", 3000, true);
        prueba1.printAtributos();
        // Utilizamos los métodos setters para cambiar los valores de nuestro objeto
        prueba1.setCNombre("Mariana"); 
        // prueba1.printAtributos();
        // Impresión del método toString del objeto (como el método __str__ de  Python)
        System.out.println(prueba1);
    }
}
