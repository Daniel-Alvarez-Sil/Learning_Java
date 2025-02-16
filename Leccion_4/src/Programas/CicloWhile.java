/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

// Importamos la clase Random
import java.util.Random; 

/**
 *
 * @author misio
 */
public class CicloWhile {
    public static void main(String args[]){
        // Creamos un objeto de tipo Random
        var random = new Random();
        // Creamos un entero de manera aleatoria
        var iNumero = random.nextInt(0,100);
        // Ciclo WHILE
        print("Impresion de 10 valores con un ciclo while:"); 
        var iLimite = iNumero + 10;
        while (iNumero < iLimite){
            print("Numero: " + iNumero); 
            iNumero++; 
        }
    }
    
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
