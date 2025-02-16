/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

/**
 *
 * @author misio
 */

// Importamos la clase de OperadorThis
import Clases.OperadorThis;

public class PruebaOperadorThis {          
    public static void main(String args[]) {
        var prueba1 = new OperadorThis();
        prueba1.a = 5; 
        prueba1.b = 6; 
        print("La suma de los valores es: " + prueba1.retornarSuma());
        print("La resta de los valores es: " + prueba1.retornarResta());
        
    }
    
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
