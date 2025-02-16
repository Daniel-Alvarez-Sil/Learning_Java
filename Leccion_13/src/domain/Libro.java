/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */
public class Libro extends Object{
    // Atributos
        // Dinámicos
        public String cTitulo; 
        public double fPrecio; 
        
    // Constructores
    public Libro(String cArgTitulo, double fArgPrecio){
        this.cTitulo = cArgTitulo;
        this.fPrecio = fArgPrecio; 
    }
    
    // Métodos 
        // Getters y Setters
            // cTitulo
            public String getCTitulo(){
                return this.cTitulo; 
            }
            public void setCTitulo(String cArgTitulo){
                this.cTitulo = cArgTitulo; 
            }
            // fPrecio
            public double getFPrecio(){
                return this.fPrecio; 
            }
            public void setFPrecio(double fArgPrecio){
                this.fPrecio = fArgPrecio; 
            }
        // Método para imprimir el estado del objeto
        @Override
        public String toString(){
            return "Libro:  \nTitulo: " + this.cTitulo + "\nPrecio: " + this.fPrecio + "\nReferencia: " + super.toString() + "\n";          
        }
}
