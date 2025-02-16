/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

// Importamos los módulos necesarios para facilitar la sintaxis de imprimir
import Programas.Print;

/**
 *
 * @author misio
 */
public class ConversionDeTipos {
    public static void main(String args[]){
        // Conversion de String a Int
        int iStringAInt = Integer.parseInt("10");
        Print.print("String convertido a Int: " + iStringAInt);
        // Conversion de String a Double
        double dStringADouble = Double.parseDouble("10");
        Print.print("String convertido a Double: " + dStringADouble);
        // Conversion de varios tipos de datos a string
        String cString = String.valueOf(10);
        Print.print("Int convertido a Double: " + cString);
        // Conversion de String a Char 
        char cStringAChar = "Un String".charAt(0);
        Print.print("String convertido a Char: " + cStringAChar);
        cStringAChar = "Un String".charAt(3);
        Print.print("String convertido a Char: " + cStringAChar);
        
    }
}
