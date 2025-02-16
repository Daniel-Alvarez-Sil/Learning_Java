/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Daniel Alvarez Sil
 */

// La palabra final nos ayuda a proteger la informacion de una variable, clase o método

// Declaramos una clase de la cual no se podrán crear subclases
public /*final*/ class PalabraFinal {
    
    // Declaramos una constante de la clase
    public final static double IPI = 3.14; 
    
    public static void main(String args[]){
        // Declaramos una variable que no se va a poder modificar
        final int IVARIABLE = 0; 
        // No podemos modificar esta variable
        // IVARIABLE = 10; 
        
        // Declaramos un objeto que no se puede modificar
        final var sbPrueba = new StringBuilder().append("");
        // Podemos modificar el contenido del objeto
        sbPrueba.append("Modificacion");
        // No podemos cambiar la referencia del objeto
        // sbPrueba = new StrinfBuilder();
    }
           
    // Declaramos un método que no podrá ser sobreescrito en clases hijas
    public final static void print(String cArg1, String cArg2){
        System.out.println(cArg1 + cArg2);
    }
    
    public  static void print(String cArg){
        System.out.println(cArg);
    }
}
