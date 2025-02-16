/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author misio
 */

public class OperadoresDeIgualdadYRelacionales {
    public static void main(String args[]){
        // Operadores de Igualdad y Relacionales
        int a = 1, b = 2; 
        String c = "Hola", d = "Hola";
        print("a = " + a); 
        print("b = " + b);
        print("c = " + c);
        print("d = " + d);
        print(""); 
            // Operador de igualdad, =
            print("a == b ? " + (a == b));
            print("c == d ? " + (c.equals(d)));
            // Operador de diferencia
            print("a != b ? " + (a != b ));
            print("c != d ? " + !(c.equals(d)));
            // Operadores relacionales
            print("a >= b ? " + (a >= b));
            print("a <= b ? " + (a <= b));
    }
    
    // Módulo para facilitar la impresuión de cadenas
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
