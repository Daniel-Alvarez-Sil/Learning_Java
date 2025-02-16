/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos el método "print"
import static domain.Print.print; 

// Importamos las clases con las cuales realizaremos pruebas
import domain.ClaseGenerica;
import java.util.ArrayList;
import java.util.List; 
import java.util.HashMap;
import java.util.Map; 

public class PruebaConClasesGenericas {
    public static void main(String cArg[]){
        // Definimos una instancia de una clase Genérica
        ClaseGenerica prueba1 = new ClaseGenerica(10, " ");
        prueba1.obtenerClase();
        
        // Definimos una instancia de una clase Genérica, pero definimos la clase de sus objetos
        ClaseGenerica<Integer> prueba2 = new ClaseGenerica<>(10,10);
        prueba2.obtenerClase();
        
        // Definimos un ArrayList (Coleccion Genérica), pero vamos a establecer una clase para todos los elementos
        List<String> prueba3 = new ArrayList<>();
        prueba3.add("Mariana");
        prueba3.add("Daniel");
        // prueba3.add(1);
        
        // Definimos un HashMap (Mapa Genérico), pero vamos a establecer clases definitivas para sus llaves y valores
        Map<Integer, String> prueba4 = new HashMap<>();
        prueba4.put(0, "America");
        prueba4.put(1, "Asia");
        prueba4.put(2, "Europa");
        // prueba4.put("Valor", "Africa");
    }
}
