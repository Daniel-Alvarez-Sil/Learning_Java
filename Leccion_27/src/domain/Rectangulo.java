/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Clase rectangulo
public class Rectangulo extends FiguraGeometrica{
    // Atributos
        // Dinámicos
        private double fBase;
        private double fHeight; 
        
    // Constructor
        // Con argumentos
        public Rectangulo(String cArgTipo, double fArgBase, double fArgHeight){
            super(cArgTipo);
            this.fBase      = fArgBase; 
            this.fHeight    = fArgHeight;  
        } 
        
    // Métodos
        // Sobreescritos
        @Override
        public double calcularArea(){
            return this.fBase * this.fHeight; 
        }
        // Getters y Setters
            // fBase
            public double getFBase(){
                return this.fBase; 
            }
            public void setFBase(double fArgBase){
                this.fBase = fArgBase; 
            }
            // fHeight
            public double getFHeight(){
                return this.fHeight; 
            }
            public void setFHeight(double fArgHeight){
                this.fHeight = fArgHeight; 
            }                    
}
