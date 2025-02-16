/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos el método "print"
import static domain.Print.print; 

// Importamos las clases con las cuales queremos realizar pruebas
import domain.*; 

public class PruebasConClasesAbstractas {
    public static void main(String cArg[]){
        // No se pueden crear instancias de una clase abstracta
        FiguraGeometrica prueba1 = new Rectangulo("Rectangulo", 10, 20.63); 
        print("El area del " + prueba1.getClass().getSimpleName() + " es: " + prueba1.calcularArea()); 
    }
}
