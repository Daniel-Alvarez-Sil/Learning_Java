/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase de PalabraFinal
import dominio.PalabraFinal; 

public class PruebaPalabraFinal extends PalabraFinal{
    // Podemos sobreescribir este método porque no existe un método final con la misma firma (firma = nombre y argumentos) en la clase padre
    public static void print(String cArg1){
        
    }
    // No podemos sobreescribir este método porque ya existe un método final en la clase padre
    //public static void print(String cArg, String cArg1){
        
    //}
            
}
