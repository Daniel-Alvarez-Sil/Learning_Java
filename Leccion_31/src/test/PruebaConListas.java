/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos el método para imprimir colecciones
import static domain.ImprimirColecciones.imprimir; 

// Importamos la clase ArrayList
import java.util.ArrayList; 

// Importamos la interfaz List
import java.util.List; 

// Una lista 
public class PruebaConListas {
    public static void main(String cArg[]){
        // Una ArrayList es una clase que implementa los comportamientos de la interfaz List
        // La mejor práctica para definir una colección es la siguiente
        // <interfaz> <nombre de la lista> = new <clase que implementa la interfaz>;
        List miLista = new ArrayList(); 
        // Una lista tiene un orden específico
        // También puede tener elementos repitidos y no tiene un número definido de elementos
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves"); 
        miLista.add("Viernes");
        miLista.add("Sabado");
        imprimir(miLista);
    }
}
