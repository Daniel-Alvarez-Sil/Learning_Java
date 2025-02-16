/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase de PersonaConContextoEstatico
import Dominio.PersonaConContextoEstatico;

// Pruebas de la clase de PersonConContextoEstatico
public class PruebaPersonaConContextoEstatico {
    public static void main(String args[]){
        var prueba1 = new PersonaConContextoEstatico("Daniel");
        print(prueba1.toString());
        var prueba2 = new PersonaConContextoEstatico("Mariana");
        print(prueba2.toString());
    }
    
    public static void print(String cArg){
        System.out.println(cArg);
    }
}
