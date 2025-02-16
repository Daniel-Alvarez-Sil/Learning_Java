/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author misio
 */
public class OperadoresLogicos {
    public static void main(String args[]){
        // Operador Condicional
        int a = 5, b = 0, c = 10; 
        print("Operadores Condicionales");
        print("a = " + a);
        print("b = " + b);
        print("c = " + c);
            // Operador AND, && o & 
            print("c > a > b ? " + (a > b & a < c));
            // Operador OR, || o |
            print("c < a OR a < b ? " + (c < a | a < b));         
    }
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar)
    {
        System.out.println(cVar);
    }
}
