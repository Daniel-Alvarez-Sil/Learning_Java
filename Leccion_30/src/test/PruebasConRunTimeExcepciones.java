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

// Importamos la clase para realizar operaciones aritméticas
import domain.Aritmetica; 

// Manejo de Exepciones de tipo Runtime
// Este tipo de Excepciones no las marca el compilador, sino que solo aparecen en tiempo de ejecución
public class PruebasConRunTimeExcepciones {
    public static void main(String args[]){
        double resultado = Aritmetica.divisionRunTimeExcepcion(10, 0);
    }
}
