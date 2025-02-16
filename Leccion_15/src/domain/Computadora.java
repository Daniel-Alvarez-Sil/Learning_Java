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

// Importamos las clases que serán atributos
import domain.*; 

// La clase Computadora tendrá atributos de tipo Monitor, Ratón y Teclado
public class Computadora {
    // Atributos 
        // Dinámicos
        private int     iComputadora; 
        private String  cComputadora; 
        private Monitor monitor; 
        private Teclado teclado; 
        private Raton   raton; 
        // Estáticos
        private static int iNextComputadora; 
    
    // Constructores
        // Sin argumentos
        private Computadora(){
            this.iComputadora = ++Computadora.iNextComputadora; 
            print("El constructor sin argumentos de la clase Computadora se esta ejecutando. ");         
        }
        // Con argumentos 
        public Computadora(String cArgComputadora, Monitor argMonitor, Teclado argTeclado, Raton argRaton){
            // Ejecutamos el constructor sin argumentos
            this(); 
            // Asignamos el resto de variables locales de la clase
            this.cComputadora   = cArgComputadora; 
            this.monitor        = argMonitor; 
            this.teclado        = argTeclado; 
            this.raton          = argRaton; 
            print("El constructor con argumentos de la clase Computadora se esta ejecutando. ");
        }
        
    // Métodos
        // Getters y Setters
            // cComputadora
            public String getCComputadora(){
                return this.cComputadora; 
            }
            public void setCComputadora(String cArgComputadora){
                this.cComputadora = cArgComputadora; 
            }
            // monitor
            public Monitor getMonitor(){
                return this.monitor; 
            }
            public void setMonitor(Monitor argMonitor){
                this.monitor = argMonitor; 
            }       
            // teclado 
            public Teclado getTeclado(){
                return this.teclado; 
            }
            public void setTeclado(Teclado argTeclado){
                this.teclado = argTeclado; 
            }
            // raton
            public Raton getRaton(){
                return this.raton; 
            }
            public void setRaton(Raton argRaton){
                this.raton = argRaton; 
            }
        // Método para imprimir el estado del objeto
        @Override
        public String toString(){
            return new StringBuilder().append("Computadora #").append(this.iComputadora)
                    .append(", ").append(this.cComputadora).append(": \n")
                    .append(this.monitor.toString()).append(this.teclado.toString())
                    .append(this.raton.toString()).toString();
        }
        
}
