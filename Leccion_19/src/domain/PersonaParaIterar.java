/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */
public class PersonaParaIterar {
    // Atributos
        // Dinámicos
        private int     iPersona; 
        private String  cPersona; 
    
    // Constructores
        // Con argumentos
        public PersonaParaIterar(String cArgPersona){
            this.cPersona = cArgPersona; 
        }
        
    // Métodos
        // Getters
            // cPersona
            public String getCPersona(){
                return this.cPersona;
            }
}
