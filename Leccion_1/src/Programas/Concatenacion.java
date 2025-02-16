package Programas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author misio
 */
public class Concatenacion {
    public static void main(String args[]){
        // Concatenación de Strings
        var cNombre = "Daniel";
        var cApellido = "Alvarez";
        var cUnion = cNombre + " " + cApellido; 
        System.out.println("Union de Caracteres: " + cUnion);
        
        var iVar1 = 1;
        var iVar2 = 2; 
        
        // Concatenación de Strings y Enteros
        System.out.println("Union de String y Enteros ("
                + "en Contexto de Cadena): " + cUnion + " " + iVar1 + iVar2);
                // NOTA: El contexto de cadena se refiere a cuando el IDE toma como string a tipos de datos que no son caracteres
        System.out.println("Union de String y Enteros ("
                + "sin Contexto de Cadena): " + cUnion + " " + (iVar1 + iVar2));
        
        
        
        
    }
}
