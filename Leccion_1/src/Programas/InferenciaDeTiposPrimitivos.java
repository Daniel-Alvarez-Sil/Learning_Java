/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;  

/**
 *
 * @author misio
 */
public class InferenciaDeTiposPrimitivos {
    public static void main(String args[]){
        // El uso de la inferencia para asignar tipos primitivos: 
        // Enteros
            // Bytes
            var iByte = (byte)10;
            print("Valor Entero, Byte: " + iByte);
            // Short
            var iShort = (short)10;
            print("Valor Entero, Short: " + iShort);
            // Int
            var iInt = 10;
            print("Valor Entero, Integer: " + iInt);
            // Long
            var iLong = 10L; 
            print("Valor Entero, Long: " + iLong);
        // Flotantes
            // Float
            var fFloat = 10F; 
            print("Valor Flotante, Float: " + fFloat);
            // Double 
            var fDouble = 10.0; 
            print("Valor Flotante, Double: " + fDouble);
    }
    
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
