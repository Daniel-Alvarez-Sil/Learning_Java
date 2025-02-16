/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase de Padre
import domain.Padre; 

// Clase Hijas
public class Hija extends Padre{
    @Override
    public void mensaje(){
        System.out.println("Mensaje desde la clase Padre"); 
    }
}
