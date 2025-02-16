/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos el método "print"
import static domain.Print.print;

// Importamos la clase de la cual hereda esta clase
import domain.Padre; 

public class Hija extends Padre{
    @Override // Esta anotación ayuda a la legibilidad del código y también ayuda a el compilador a cachar errores al momento de compilar
    // El método que sobreescribe no puede ser más restrictivo que el método sobreescrito
    // Lista de restrictividad (de menor a mayor):
    /*
       public 
       default
       protected
       private
    */
    public void mensaje(){
        print("Mensaje desde la clase Hija. "); 
    }
}
