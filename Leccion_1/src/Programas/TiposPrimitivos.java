/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author misio
 */

// Esta rutina explora los tipos de datos primitivos
// Tipos Primitivos: 
    // Enteros (Integers): 
        // Byte - 8 bits
        // Short - 16 bits
        // Char - 16 bits
        // Int - 32 bits
        // Long - 64 bits
    // Flotantes (Floating):
        // Float - 32 bits
        // Double - 64 bits

public class TiposPrimitivos {
    public static void main(String args[]){
        print("Impresion de los Valores Minimos y Maximos de los Tipos Primitivos");
        // Tipos Enteros
            // Tipo Byte
            print("El valor minimo de la clase Byte: " + Byte.MIN_VALUE);
            print("El valor maximo de la clase Byte: " + Byte.MAX_VALUE);
                // La coversion de un valor positivo fuera del rango de Byte a Byte retorna lo siguiente:
                // (<valor fuera de rango> - Byte.MAX_VALUE) - (Byte.MIN_VALUE - 1)
                // Esta formula aplica para cualquier valor primitivo entero positivo (a excepción de Long)
                // (<valor fuera de rango> - <Clase de Tipo Primitivo Entero>.MAX_VALUE) - (<Dicha Clase>.MIN_VALUE - 1)
            print("Conversion de un valor fuera del rango de Byte, 128: " + (byte)128);
            
            // Tipo Short
            print("El valor minimo de la clase Short: " + Short.MIN_VALUE);
            print("El valor maximo de la clase Short: " + Short.MAX_VALUE);
            print("Conversion de un valor fuera del rango de Short, 32768: " + (short)32768);
            
            // Tipo Int 
            print("El valor minimo de la clase Integer: " + Integer.MIN_VALUE);
            print("El valor maximo de la clase Integer: " + Integer.MAX_VALUE);
            print("Conversion de un valor fuera del rango de Integer, 2147483648: " + (int)2147483648L);
            
            // Tipo Long
            print("El valor minimo de la clase Long: " + Long.MIN_VALUE);
            print("El valor maximo de la clase Long: " + Long.MAX_VALUE);
            print("Conversion de un valor fuera del rango de Long, 9223372036854775808: " + (long)9223372036854775808D);
        
        // Tipos Flotantes
            // Tipo Float 
            print("El valor minimo de la clase Float: " + Float.MIN_VALUE);
            print("El valor maximo de la clase Float: " + Float.MAX_VALUE);
            print("Conversion de un valor fuera del rango de Float, 3.4028236E38: " + (float)3.4028236E38D);
            
            // Tipo Double 
            print("El valor minimo de la clase Double: " + Double.MIN_VALUE);
            print("El valor maximo de la clase Double: " + Double.MAX_VALUE);
            
    }
    
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
