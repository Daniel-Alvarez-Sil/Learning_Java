/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

// Importamos el módulo para facilitar la sintaxis de impresion
import Programas.Print; 

// Introducción al tipo de dato char:

/**
 *
 * @author misio
 */
public class TipoPrimitivoEnteroChar {
    public static void main(String args[]){
        // Tipo Char
        // Una variable char almacena un valor unicode
        // Hay varias formas de asignar valor a una variable char
            // 1era Forma, Valor Unicode
            char cChar1 =  '\u0021';
            Print.print("Variable Char Asignada con un Valor Unicode: " + cChar1);
            // 2da Forma, Valor Decimal
            char cChar2 = 33;
            Print.print("Variable Char Asignada con un Valor Decimal: " + cChar2);
            // 3ra Forma, Valor Literal
            char cChar3 = '!';
            Print.print("Variable Char Asignada con un Caracter: " + cChar3);
            
    }
    
}
