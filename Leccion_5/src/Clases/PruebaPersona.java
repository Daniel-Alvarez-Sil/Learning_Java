/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author misio
 */

import Clases.Persona; 


// Creamos objetos de prueba para la clase Persona
public class PruebaPersona {
    public static void main(String args[])
    {
        var persona1 = new Persona();
        persona1.cNombre = "Daniel"; 
        persona1.cApellido = "Alvarez";
        persona1.despliegaInformacion(); 
    }
}
