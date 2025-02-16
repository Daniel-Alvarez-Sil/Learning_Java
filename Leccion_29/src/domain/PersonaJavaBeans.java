/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Un Java Bean es una clase que se adhiere a ciertas convenciónes: 
    // Incluir un constructor público y sin argumentos
    // Tener sus atributos encapsulados
    // Implementar la interfaz, "Serializable"

// Un Java Bean sigue dichas convenciones para maximizar su utilidad en GUIs, así como para poder ser transmitidas eficientemente
public class PersonaJavaBeans implements Serializable{ // <-- Implementa la interfaz de Serializable
    // Atributos 
        // Dinámicos
        private String cNombre; 
        private String cApellido; 
        
    // Constructor
        // Sin argumentos
        public PersonaJavaBeans(){
            
        }
    
    // Métodos
        // Getters y Setters
            // cNombre
            public String getcNombre(){
                return this.cNombre; 
            }
            public void setcNombre(String cArgNombre){
                this.cNombre = cArgNombre; 
            }
            // cApellido
            public String getcApellido(){
                return this.cNombre; 
            }
            public void setcApellido(String cArgApellido){
                this.cApellido = cArgApellido; 
            }
        
        
}
