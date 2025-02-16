/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase Padre
import domain.Padre;

// Clase Hija
public class Hija extends Padre{
    public void mensajeHija(){
        System.out.println("Mensaje exclusivo de la clase Hija. ");
    }
}
