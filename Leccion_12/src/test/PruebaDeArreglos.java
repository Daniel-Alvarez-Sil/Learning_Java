/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Los arreglos son objetos que almacenan varias variables del mismo tipo

// Importamos la clase de Persona
import domain.Persona; 

// Pruebas con el concepto de Arreglos
public class PruebaDeArreglos {
    public static void main(String args[]){
        // Definir un arreglo
        int edades[] = new int[4]; 
        print("Objeto de tipo Arreglo: " + edades);
        
        // Como modificar e imprimir la información de arreglos
        edades[0] = 10; 
        print("Impresion del primer objeto del arreglo: " + edades[0]);
        
        // Modificar e imprimir la información de arreglos con un ciclo for
        for (int f = 0; f <= edades.length - 1; f++){
            print("Valor " + (f + 1) + ": " + edades[f]); 
        }
        print("");
        
        // Definición de un arreglo mediante los elementos del arreglo directamente
        int iNumeros[] = {1, 2, 3, 4, 5};
        print("Impresion del arreglo inicializado mediante elementos directamente: ");
        for (int f = 0; f <= iNumeros.length - 1; f++){
            print("Valor " + (f + 1) + ": " + iNumeros[f]);
        }
        print("");
        
        // Definición de arreglos con elementos de tipo object
        Persona personas[] = new Persona[2]; 
        for (int f = 0; f <= personas.length - 1; f++){
            personas[f] = new Persona("Juanito"); 
        }
        for (int f = 0; f <= personas.length - 1; f++){
            print(personas[f].toString());
        }
            
    }
    // Método para facilitar 
    public static void print(String cArg){
        System.out.println(cArg);
    }
}
