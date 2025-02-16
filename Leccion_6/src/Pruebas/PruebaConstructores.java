/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

/**
 *
 * @author misio
 */

// Importamos la clase de constructores
import Clases.Constructores; 

public class PruebaConstructores {
    public static void main(String arg[]){
        var prueba1 = new Constructores();
        prueba1.printAtributos();
        var prueba2 = new Constructores(5, 8);
        prueba2.printAtributos();
        
    }
}
