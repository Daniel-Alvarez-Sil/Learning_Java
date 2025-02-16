/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Clase para imprimir un mensaje de error personalizado
public class OperacionExcepcion extends Exception{
    public OperacionExcepcion(String cArg){
         super(cArg);
    }
}
