/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */


// Importamos las enumeraciones
import domain.Enumeraciones; 
import domain.EnumeracionAvanzada;

// Importamos el método print
import static domain.Print.print; 

public class PruebaEnumeraciones {
    public static void main(String args[]){
        // Ejecutamos un método con un parámetro que es un elemento de la enumeración
        indicarDiaSemana(Enumeraciones.A); 
        // Probamos utilizar la enumeración más avanzada
        print("Continente 4: " + EnumeracionAvanzada.AMERICA);
        print("# de Paises: " + EnumeracionAvanzada.AMERICA.getFPaises());
    }
    
    // Este método recibe como argumento un elemento de la enumeracion Enumeraciones
    private static void indicarDiaSemana(Enumeraciones argEnum){
        String cLetra = ""; 
        switch(argEnum){
            case A:
                cLetra = "Letra " + argEnum; 
                break;
            case B:
                cLetra = "Letra " + argEnum; 
                break; 
            case C: 
                cLetra = "Letra " + argEnum; 
                break; 
            case D:
                cLetra = "Letra " + argEnum; 
                break; 
            case E:
                cLetra = "Letra " + argEnum; 
                break; 
            case F: 
                cLetra = "Letra " + argEnum; 
                break; 
        }
        print(cLetra); 
    }
}
