/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author misio
 */
public class OperadoresUnarios {
    // Operadores Unarios
    public static void main(String args[]){
        // Operador negativo, -
        int a = 1; 
        int b = -a; 
        print("Operador Negativo, -"); 
        print("a = " + a);
        print("b = " + b);
        // Operador para revertir, !
        // Solo aplica para tipos de datos booleanos
        boolean c = true; 
        boolean d = !c; 
        print("Operador para Revertir, !");
        print("c = " + c);
        print("d = " + d);
        // Operador para Incrementar (también aplica para decrementar)
            // Pre-incremento}
            int e = 3, f = ++e; // Primero se incrementa e y luego su valor asignado a f
            print("e = " + e);
            print("f = " + f);
            // Post-incremento
            int g = 4, h = g++; // El valor g es asignado a la variable h y, después, el valor de g es aumentado
            print("h = " + h);
            print("g = " + g);

            
            
            
        
    }
    
    // Función para facilitar la impresión de cadenas
    public static void print(String cVar)
    {
        System.out.println(cVar);
    }
}
