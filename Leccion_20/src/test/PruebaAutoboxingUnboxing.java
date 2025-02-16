/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// En esta clase, revisaremos el concepto de Autoboxing y Unboxing
public class PruebaAutoboxingUnboxing {
    public static void main(String arg[]){
        // Todas las variables primitivas tienen una Clase Wrapper asociada
        /*
            Variable    Clase
            Primitiva   Wrapper

            int         Integer
            long        Long
            float       Float
            double      Double
            boolean     Boolean
            byte        Byte
            char        Character
            short       Short
        */

        // Autoboxing es el concepto de envolver una literal de tipo primitivo en un objeto
        // Con el uso de Autoboxing, podemos acceder a los atributos y métodos del objeto
        Integer iAutoboxing = 10; 
        System.out.println("Valor = " + iAutoboxing.toString());   
        
        // Unboxing es el concepto de asignar una variable envuelta en un objeto a una variable de tipo primitivo
        int iUnboxing = iAutoboxing; 
        System.out.println("Valor = " + iUnboxing);
    }
}
