/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Creamos una clase de tipo error, pero que sea una subclase de RuntimeException 
// Los errores de este tipo de subclases no son captados por el compilador
public class OperacionRunTimeExcepcion extends RuntimeException{
   public OperacionRunTimeExcepcion(String cArgError){
       super(cArgError);
   }
}
