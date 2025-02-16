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

// Importamos la clase para realizar operaciones aritmeticas
import domain.Aritmetica; 

// Importamos la clase de tipo excepcion que creamos nosotros
import domain.OperacionExcepcion; 

// Manejo de Excepciones
public class PruebasConExcepciones {
    public static void main(String args[]){
        double resultado; 
        // Envolvemos un bloque de código en un bloque try - catch - catch - finally
        // Es importante que si hay más de un bloque catch, éstos esten ordenados de menor jerarquía de error a mayor
        try{
            resultado = Aritmetica.divisionExcepcion(10, 0);
        // Capturamos el error, si es que haya alguno
        } catch (OperacionExcepcion e){
            print("Ocurrio un error de tipo OperacionExcepcion. "); 
            // Imprimimos la pila de excepciones
//            e.printStackTrace(System.out);
            // Imprimimos el mensaje simplificado del error
            print(e.getMessage());
        } catch (Exception e){
            print("Ocurrio un error de tipo Exception. ");
//            e.printStackTrace(System.out);
            print(e.getMessage());
        } finally {
            print("Fin del programa. ");
        }
        
        
    }
}
