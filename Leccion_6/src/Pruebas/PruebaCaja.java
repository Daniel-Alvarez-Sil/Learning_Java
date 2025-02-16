/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

/**
 *
 * @author misio
 */

// Importamos la clase de Caja
import Clases.Caja; 

// Pruebas de la clase de Caja
public class PruebaCaja {
    public static void main(String args[]){
        var caja1 = new Caja(1, 2, 3);
        caja1.printAtributos();
    }
}
