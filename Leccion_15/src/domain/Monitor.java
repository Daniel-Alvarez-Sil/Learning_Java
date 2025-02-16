/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos el método "print"
import static domain.Print.print; 

// Esta clase será añadida como atributo de la clase Computadora
public class Monitor {
    // Atributos 
        // Dinámicos 
        private int     iMonitor; 
        private String  cMarca; 
        private double  fTamano; 
        // Estáticos
        private static int iNextMonitor; 
    
    // Constructores
        // Sin argumentos
        private Monitor(){
            this.iMonitor = ++Monitor.iNextMonitor; 
            print("El constructor sin argumentos de la clase Monitor se esta ejecutando. "); 
        }
        // Con argumentos
        public Monitor(String cArgMarca, double fArgTamano){
            // Ejecutamos el constructor sin argumentos
            this();
            // Asignamos los atributos faltantes de la instancia
            this.cMarca = cArgMarca; 
            this.fTamano = fArgTamano; 
            print("El constructor con argumentos de la clase Monitor se esta ejecutando. ");
        }
        
    // Métodos 
        // Getters y Setters
            // cMarca
            public String getCMarca(){
                return this.cMarca; 
            }
            public void setCMarca(String cArgMarca){
                this.cMarca = cArgMarca; 
            }
            // fTamano
            public double getFTamano(){
                return this.fTamano; 
            }
            public void setFTamano(double fArgTamano){
                this.fTamano = fArgTamano;
            }
        // Método para imprimir el estado de un objeto 
        @Override
        public String toString(){
            return new StringBuilder().append("Monitor: \n").append("\tMarca: ").append(this.cMarca).append("\n\tTamano: ").append(this.fTamano).append("\n\tMonitor #").append(this.iMonitor).append("\n").toString();
        }
            
        
}
