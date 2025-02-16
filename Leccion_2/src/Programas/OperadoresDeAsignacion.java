/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author misio
 */
public class OperadoresDeAsignacion {
    // Operadores de Asignación
    public static void main(String args[]){
        // Operador de asignación, = 
        int c = 3 + 5 + 6; 
        print("c = 3 + 5 + 6 = " + c);
        
        // Operadores Compuestos
        int a = 3; 
            a += 1; // a = a + 1
        print("a += 1 --> a = a + 1 = " + a);
        
        int b = 5; 
            b -= 2; // b = b - 2
        print("b -= 2 --> b = b - 2 = " + b);
        
        int d = 3; 
            d *= 2; // d = d * 2
        print("d *= 2 --> d = d * 2 = " + d);
        
        int e = 4; 
            e /= 2; // e = e / 2
        print("e /= 2 --> e = e / 2 = " + e);
        
        int f = 3;
            f %= 2; // f = f % 3
        print("f %= 2 --> f = f % 2 = " + f);
    }
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar)
    {
        System.out.println(cVar);
    }
}
