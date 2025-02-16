/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase de Persona
import Clases.Persona; 

// Paso por Valor
// El paso por valor se refiere al uso de una variable primitiva como parametro para una segunda función
// Durante este uso, el argumento de la segunda función recibe una copia de la variable original, pero NO su referencia en memoria
// Debido a esto, no podemos modificar el contenido de la variable de la función original desde la segunda función

// Paso por Referencia
// El paso por referencia se refiere al uso de una variable de tipo objeto como parametro para una segunda función
// Durante este uso, el argumento de la segunda función recibe la referencia de la variable original
// Debido a esto, podemos modificar el contenido de este objeto de la función original desde la segunda función

public class PasoPorValorOReferencia {
    public static void main(String args[]){
        // Paso por Valor
        int iVar1 = 10; 
        print("Valor de la variable primitiva: " + iVar1);
        intentoModificarPrimitivo(iVar1);
        print("Valor de la variable primitiva despues de modificarla: " + iVar1);
        
        print("");
        
        // Paso por Referencia (o Paso por Valor por Referencia)
        var persona1 = new Persona("Daniel", "Alvarez");
        persona1.printAtributos(); 
        intentoModificarObjeto(persona1);
        persona1.printAtributos();
    }
    
    public static void intentoModificarPrimitivo(int iArg1){
        iArg1 = 11; 
        print("Intentamos modificar el contenido de la variable primitiva... ");
    }
    
    public static void intentoModificarObjeto(Persona pArg1){
        pArg1.cNombre = "Mariana"; 
        pArg1.cApellido = "Sil";
        print("Intentamos modificar el contenido del objeto... ");
    }
    
    public static void print(String cVar){
        System.out.println(cVar);
    }
            
}
