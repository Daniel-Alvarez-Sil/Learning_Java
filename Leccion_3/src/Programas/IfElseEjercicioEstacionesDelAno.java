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
public class IfElseEjercicioEstacionesDelAno {
    
    public static void main(String args[]){
        String cEstacion = "";
        // Creamos un objeto de tipo Random
        var random = new Random();
        // Asignamos el mes de manera aleatoria
        int iMes = random.nextInt(1, 12);
        if (iMes == 1 | iMes == 2 | iMes == 12)
            cEstacion = "Invierno";
        else if (iMes == 3 | iMes == 4 | iMes == 5)
            cEstacion = "Primavera";
        else if (iMes == 6 | iMes == 7 | iMes == 8)
            cEstacion = "Verano"; 
        else if (iMes == 9 | iMes == 10 | iMes == 11)
            cEstacion = "Otono";
        else 
            cEstacion = "Estacion Desconocida";
        print("Estacion del Ano: " + cEstacion);
        
    }
    
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
