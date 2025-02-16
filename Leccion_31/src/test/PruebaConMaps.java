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

// Importamos la clase HashMap
import java.util.HashMap; 

// Importamos la interfaz Map
import java.util.Map; 

public class PruebaConMaps {
    public static void main(String cArg[]){
        // Los HashMaps son clases que implementan el comportamiento de la interfaz Map
        // La mejor práctica para definir un mapa es la siguiente:
        // <interfaz> <nombre del mapa> = new <clase que implementa la interfaz>
        Map miMapa = new HashMap(); 
        // Un mapa consiste de una serie infinita de duplas llave-valor
        // Dichas duplas no tienen un valor determinado
        // No puede haber 2 duplas con la misma llave
        
        // Como agregar una dupla al mapa
        miMapa.put("valor1", "Daniel"); 
        miMapa.put("valor2", "Mariana");
        miMapa.put("valor3", "Oscar");
        
        // Como obtener un valor del mapa
        // <mapa>.get(<llave>);
        miMapa.get("valor1");
        
        // Impresion de llaves
        imprimir(miMapa.keySet());
        // Impresion de valores
        imprimir(miMapa.values());
    }
}
