/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos el método "print"
import static domain.Print.print; 

// Importamos la clase de PersonaParaIterar
import domain.PersonaParaIterar; 

// For each es un for mejorado

// Pruebas con el concepto de For Each
// Sirve para iterar colecciones, arreglos, etc...
public class PruebaConForEach {
    public static void main(String arg[]){
        int iNumeros[] = {1,2,3,4,5};
        print("Impresion de Array con un For Each: ");
        for(int iNumero: iNumeros){ // <-- Con el uso de For Each,  no podemos llevar un registro del índice de los elementos de la colección
            print("Valor: " + iNumero);
        }
        
        print("");
        
        // Iteración de arrays de objetos con For Each
        PersonaParaIterar prueba[] = {new PersonaParaIterar("Daniel"), new PersonaParaIterar("Mariana"), new PersonaParaIterar("Andres"), new PersonaParaIterar("Gaby")};
        print("Impresion de array de objetos con un For Each: ");
        for (PersonaParaIterar persona: prueba){
            print("Persona: " + persona.getCPersona());
        }
    }
}
