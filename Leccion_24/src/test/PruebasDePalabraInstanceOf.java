/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */


// Importamos las clases que usaremos para realizar pruebas
import domain.Padre; 
import domain.Hija; 

// La palabra "instanceof" nos ayuda a validar que un objeto sea una instancia de cierta clase
// Notas: "instanceof" retorna true si el objeto es una instancia de una subclase de la clase a validar
public class PruebasDePalabraInstanceOf {
    public static void main(String args[]){
        var prueba1 = new Padre();
        var prueba2 = new Hija();
                
        // Establecemos una cadena de condiciones que van de más específico a menos específico
        if (prueba2 instanceof Hija)
            prueba2.mensajeHija();
        else if (prueba2 instanceof Padre)
            prueba2.mensajePadre();
        else if (prueba2 instanceof Object)
            System.out.println("Todos los objetos heredan de la clase Object. ");
            
        System.out.println("");
        
        // Establecemos una cadena de condiciones individuales, nótese la diferencia
        if (prueba2 instanceof Hija)
            prueba2.mensajeHija();
        if (prueba2 instanceof Padre)
            prueba2.mensajePadre();
        if (prueba2 instanceof Object)
            System.out.println("Todos los objetos heredan de la clase Object. ");
        
    }
}
