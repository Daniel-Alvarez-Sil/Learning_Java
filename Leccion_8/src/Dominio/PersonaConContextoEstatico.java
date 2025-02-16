/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Contexto Estático
// El contexto estático se refiera a la carga de clases
// Los elementos del contexto estático son los mismos para todos los elementos del contexto dinámico
// Los elementos del contexto estático no pueden accedar a los elementos del contexto dinámico

// Contexto Dinámico 
// El contexto dinámico se refiere a la carga de las instancias de la clase
// El contexto dinámico incluye los atributos que son únicas para cada distinta instancia de la clase
// El contexto dinámico PUEDE acceder al contexto estático

public class PersonaConContextoEstatico {
    // Atributos de la Clase
        // Contexto Dinámico
        private int iPersona;
        private String cNombre;
        
        // Contexto Estático
        private static int nextPersona; 
    
    // Constructor de las instancias de la clase
    public PersonaConContextoEstatico(String cArgNombre){
        // Incrementamos el contador de IDs del contexto estático
        PersonaConContextoEstatico.nextPersona++;
        // Asignamos los atributos dinámicos
        this.iPersona = PersonaConContextoEstatico.nextPersona;
        this.cNombre = cArgNombre;  
    }
    
    // Método toString (sobreescrito)
    @Override
    public String toString(){
        return "Persona con Contexto Estatico: \nPersona: "  + this.cNombre
                + "\nID: " + this.iPersona;
    }
    
    // Métodos setters y getters de los atributos privados
        // cNombre (Contexto Dinámico)
        public String getCNombre(){
            return this.cNombre; 
        }
        public void setCNombre(String cArgNombre){
            this.cNombre = cArgNombre; 
        }
        // iPersona (Contexto Dinámico)
        public int getIPersona(){
            return this.iPersona;
        }
        public void setIPersona(int iArgPersona){
            this.iPersona = iArgPersona;
        }
        // nextPersona (Contexto Estático)
        public int getNextContador(){
            return PersonaConContextoEstatico.nextPersona; 
        }
        public void setNextContador(int iArgNextContador){
            PersonaConContextoEstatico.nextPersona = iArgNextContador;
        }
}
