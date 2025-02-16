/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase de SobreCargaDeMetodos
import Clases.SobreCargaDeMetodos; 

// Prueba de la clase de SobreCargaDeMetodos
public class PruebaSobreCargaDeMetodos {
    public static void main(String args[]){
        print("5 + 5 = " + SobreCargaDeMetodos.sumar(5, 5));
        print("7.5 + 8.0 = " + SobreCargaDeMetodos.sumar(7.5, 8));
        // El compilador escoge el método a ejecutar basandose en que paramétros funcionan como argumentos correctos de los métodos
        print("5 + 5L = " + SobreCargaDeMetodos.sumar(5, 5L)); 
    }
    
    // Método para facilitar la impresión de cadenas
    public static void print(String cArg){
        System.out.println(cArg);
    }
    
}
