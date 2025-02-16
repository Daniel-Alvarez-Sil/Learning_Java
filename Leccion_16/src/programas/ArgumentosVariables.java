/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programas;

/**
 *
 * @author Daniel Alvarez Sil
 */


// Clase para revisar el uso de parámetros y argumentos variables
public class ArgumentosVariables {

    public static void main(String[] args) {
        argVariables("Lista de Numeros", 1,2,3,4,5,6,7);
    }
    
    // Los argumentos variables se usan cuando no se sabe cuanta información el método va a recibir
    // Fuera de esto, los argumentos variables tienen la misma funcionalidad y comandos que un array
    public static void argVariables(String cNombre, int...iArgVariables){ // <-- Cuando un método recibe argumentos variables, éstos deben ser definidos al final
        print("Impresion - " + cNombre + ": "); 
        for (int i = 0; i < iArgVariables.length; i++) {
            print("Valor: " + iArgVariables[i]); 
        }
        
    }
    
    // Método para facilitar la impresión de cadenas
    public static void print(String cArg){
        System.out.println(cArg);
    }
    
}
