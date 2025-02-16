/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author misio
 */

// Creamos la clase Persona
public class Persona {
    // Atributos de la Clase
    String cNombre;
    String cApellido; 
    
    // Métodos de la Clase
    
    // Método statico
    public static void print(String cVar)
    {
        System.out.println(cVar);
    }
    
    public void despliegaInformacion()
    {
        print("Nombre: " + cNombre);
        print("Apellido: " + cApellido); 
    }
}
