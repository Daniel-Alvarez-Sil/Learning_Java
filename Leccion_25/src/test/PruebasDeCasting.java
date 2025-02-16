/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos las clases que usaremos para las pruebas
import domain.Padre; 
import domain.Hija; 


// El concepto de casting consiste en convertir el tipo de un objeto
// Hay 2 tipos de casting
// Downcasting - el concepto de convertir una clase Padre a una Clase Hija
// Upcasting   - el concepto de convertir una Clase Hija a una Clase Padre (este proceso es automático)
public class PruebasDeCasting {
    public static void main(String args[]){
        // Upcasting 
        Padre pruebaUpcast = new Hija();
        // Con el uso de upcasting, tenemos acceso a lo siguiente
            // Métodos exclusivos de la clase Padre
            pruebaUpcast.mensajePadre();
            // Métodos de la clase Hija que sobreescribe métodos de su superclase
            pruebaUpcast.mensaje();
            System.out.println("");
        // Con el uso de upcasting, NO tenemos acceso a lo siguiente:
            // Métodos exclusivos de la clase Hija
            /* pruebaUpcast.mensajeHija(); */
            // Para usar estos métodos, debemos usar el concepto de downcasting:
                // Downcasting
                Hija pruebaDowncast = (Hija) pruebaUpcast; 
                // Con el uso de downcasting, tenemos acceso a lo siguiente: 
                    // Métodos exclusivos de la clase Padre
                    pruebaDowncast.mensajePadre();
                    // Métodos de la clase Hija que sobreescriben métodos de su superclase
                    pruebaDowncast.mensaje();
                    // Métodos exclusivos de la clase Hija
                    pruebaDowncast.mensajeHija();
    }
}
