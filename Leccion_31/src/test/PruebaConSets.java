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

// Importamos la clase Hashset
import java.util.HashSet; 

// Importamos la interfaz Set
import java.util.Set;


public class PruebaConSets {
    public static void main(String cArg[]){
        // Los Hashsets son clases que implementan el comportamiento de la interfaz Set
        // La mejor práctica para definir un Hashset es la siguiente: 
        // <interfaz> <nombre de el set> = new <clase que implementa la interfaz>
        Set miSet = new HashSet(); 
        // Los elementos de un set no tienen orden y no pueden ser repitidos
        // Un Set no tiene un límite de elementos
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        imprimir(miSet);
        
    }
}
