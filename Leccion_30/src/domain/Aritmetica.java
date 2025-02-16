/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos nuestra clase de tipo Exception
import domain.OperacionExcepcion; 

// Importamos nuestra clase de tipo RuntimeException
import domain.OperacionRunTimeExcepcion; 

// Clase para realizar operaciones aritmeticas
public class Aritmetica {
    // Método para calcular una division, arroja un error
    public static double divisionExcepcion (double fArgNumerador, double fArgDenominador)
        throws OperacionExcepcion { // <-- Con este comando, determinamos que es posible que el método arroje una Excepcion
                                    // <-- Este comando solo se debe insertar si el error a arrojar es subclase de Exception
                                    // <-- Si la subclase es de tipo RuntimeException, la línea de comando no se debe insertar
        if (fArgDenominador == 0)
            // Si el denominador es igual a 0, arrojamos una excepcion con la clase que hemos creado
            throw new OperacionExcepcion("Division entre cero. ");
        return fArgNumerador / fArgDenominador;             
    }
    
    // Método para calcular una division, arroja un error de tipo runtime
    public static double divisionRunTimeExcepcion(double fArgNumerador, double fArgDenominador){
        if (fArgDenominador == 0)
            throw new OperacionRunTimeExcepcion("Division entre cero. ");
        return fArgNumerador / fArgDenominador;  
        
    }
        
        
}
