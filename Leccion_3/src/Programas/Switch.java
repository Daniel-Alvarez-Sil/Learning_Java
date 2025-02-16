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
public class Switch {
    public static void main(String args[]){
        var cNumero = "";
        // Creamos un objeto de tipo Random
        var random = new Random();
        // Creamos un valor entero aleatorio y ejecutamos la sentencia de control Switch
        switch(random.nextInt(1, 6)){
            case 1: 
                cNumero = "Uno";
                break;
            case 2: 
                cNumero = "Dos"; 
                break; 
            case 3: 
                cNumero = "Tres";
                break; 
            case 4: 
                cNumero = "Cuatro"; 
                break; 
            default: 
                cNumero = "Numero Desconocido";                
        }
        print("Numero: " + cNumero);
        
    }
    
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar){
        System.out.println(cVar);
    }
            
}
