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
public class SwitchEjercicioEstacionesDelAno {
    public static void main(String args[]){
        String cEstacion = "";
        // Creamos un objeto de tipo Random
        var random = new Random(); 
        // Creamos aletoriamente un mes y llamamos a la sentencia de control
        switch(random.nextInt(1, 14)){
            case 1: case 2: case 12: 
                cEstacion = "Invierno";
                break; 
            case 3: case 4: case 5: 
                cEstacion = "Primavera"; 
                break; 
            case 6: case 7: case 8: 
                cEstacion = "Verano";
                break; 
            case 9: case 10: case 11: 
                cEstacion = "Otono"; 
                break; 
            default: 
                cEstacion = "Estacion Desconocida"; 
        
        // Imprimimos el resultado de la estación del año
        }
        print("Estacion: " + cEstacion);    
    }
    
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
