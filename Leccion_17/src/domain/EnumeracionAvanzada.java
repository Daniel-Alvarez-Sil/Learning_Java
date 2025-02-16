/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Esta clase definirá una enumeración con conceptos menos básicos

// Definición de la enumeración 
public enum EnumeracionAvanzada {
    // Atributos
        // Elementos de la enumeración
        AFRICA(53, 100E3), EUROPA(46, 100E3), ASIA(44, 100E4), AMERICA(34, 100E3), OCEANIA(14, 100E3); 
        // Atributos de los elementos
        private final int       iPaises; 
        private final double    fPoblacion; 
        
    // Constructor de los elementos de la enumeración
    EnumeracionAvanzada(int iArgPaises, double fArgPoblacion){
        this.iPaises    = iArgPaises; 
        this.fPoblacion = fArgPoblacion; 
    }
    
    // Métodos Getters de los atributos de los elementos
        // iPaises
        public int getIPaises(){
            return this.iPaises; 
        }
        // fPoblacion
        public double getFPaises(){
            return this.fPoblacion; 
        }
        
    
    
}
