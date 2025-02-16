/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

/**
 *
 * @author misio
 */

// Importamos la clase de Aritmetica
import Clases.Aritmetica;


// Pruebas con la clase de Aritmetica
public class PruebaAritmetica {
    public static void main(String args[]){
        var aritmetica = new Aritmetica();
        aritmetica.a = 1; 
        aritmetica.b = 2; 
        aritmetica.sumar();
        Aritmetica.print("El resultado de la suma es " + aritmetica.retornaSuma());
        Aritmetica.print("La suma de 5 + 5 es " + aritmetica.modificarYSumarConArgumentos(5, 5)); // <-- Parametros
    }
}
