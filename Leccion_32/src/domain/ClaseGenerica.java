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

// Los tipos genéricos en Java son útiles para definir el tipo de dato atributos, elementos, etc... directamente al momento de compilar
// Cuando una clase contiene alguna sección que sea genérica, ésto se debe indicar en la firma de la clase
public class ClaseGenerica<T> { // <-- Esta notación indica que la clase tendrá atributos de tipo objeto indefinido
    // Atributos
        // Genéricos
        // La clase de estos objetos es definida hasta el momento de compilación
        public T var1; 
        public T var2; 
        
    // Constructor
        // Con argumentos
        public ClaseGenerica(T argVar1, T argVar2){
             print("El constructor con argumentos de la clase ClaseGenerica se esta ejecutando. ");
             this.var1 = argVar1; 
             this.var2 = argVar2; 
        }
        // Sin argumentos
        // public ClaseGenerica(){
        //     print("El constructor sin argumentos de la clase ClaseGenerica se esta ejecutando. ");
        // }
        
    // Métodos
        // Método para obtener el tipo de clase T
        public void obtenerClase(){
            print("El tipo de clase utilizado en esta clase generica es: " + this.var1.getClass().getSimpleName() + " y " + this.var2.getClass().getSimpleName());
        }
    
}
