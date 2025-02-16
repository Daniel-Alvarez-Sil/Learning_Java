/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la interfaz de Colecciones
import java.util.Collection; 

// Clase que tiene como propósito utilizar el concepto de polimorfismo para imprimir distintas colecciones
public class ImprimirColecciones {
    public static void imprimir(Collection argColeccion){
        System.out.println("Impresion de la Coleccion: ");
        // Impresión de la colección utilizando un ciclo for each
        // for (Object objeto: argColeccion){
        //     System.out.println("Elemento: " + objeto); 
        // }
        // Impresión de la colección utilizando una función lambda/flecha
        argColeccion.forEach(objeto -> {System.out.println("Elemento: " + objeto);});
        System.out.println("");
    }
}
