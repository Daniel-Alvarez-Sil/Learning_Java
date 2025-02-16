/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

// Importamos el módulo para facilitar la impresión
import Programas.Print; 

// Importamos el módulo para leer información del usuario
import java.util.Scanner; 

// Introducción al tipo de dato lógico, boolean

/**
 *
 * @author misio
 */


public class TipoPrimitivoEnteroBoolean {
    public static void main(String args[])
    {
        // Creación del objeto para leer información del usuario
        Print.print("Ingresa tu edad: ");
        Scanner consola = new Scanner(System.in);
        var iEdad = consola.nextInt();
        
        // Definición de una variable booleana
        boolean bMayorEdad = iEdad > 17; 
        
        if (bMayorEdad == true)
        {
            Print.print("Eres un adulto. ");
        }
        else {
            Print.print("No eres un adulto. ");
        }
    }
}
