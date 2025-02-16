/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Clase Abstracta: 
// Una clase abstracta es aquella que no tiene ninguna implementación
// Las subclases de una clase abstracta están obligadas a sobreescribir los métodos abstractors de la clase padre.
// De no ser así, las subclases se vuelven abstractas igualmente
// Podemos definir una clase abstracta, aunque la clase no cuente con métodos abstractos
// Lo contrario del enunciado anterior no es posible
public abstract class FiguraGeometrica {
    // Atributos 
        // Dinámicos
        protected String cTipo; 
        
    // Constructores 
        // Con argumentos
        public FiguraGeometrica(String cArgTipo){
            this.cTipo = cArgTipo; 
        }
        
    // Métodos
        // Abstractos
        public abstract double calcularArea();
        // Getters y Setters
            // cTipo
            public String getCTipo(){
                return this.cTipo; 
            }
            public void setCTipo(String cArgTipo){
                this.cTipo = cArgTipo; 
            }
}
