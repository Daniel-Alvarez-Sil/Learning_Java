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

// Importamos la clase de Computadora
import domain.Computadora; 

// La clase de Orden tendrá un atributo de tipo Computadora
public class Orden {
    // Atributos
        // Dinámicos
        private int             iOrden;
        private Computadora[]   computadoras;
        private int             iIndexComputadoras; 
        // Estáticos
        private static int      iNextOrden; 
        private static int      iMaxComputadoras = 2; 
        
    // Constructores
        // Sin argumentos
        public Orden(){
            print("El constructor sin argumentos de la clase Orden se esta ejectuando. ");
            this.iOrden = ++Orden.iNextOrden; 
            this.computadoras = new Computadora[iMaxComputadoras];
        }
        
    //Métodos
        // Métodos para Agregar un objeto al atributo de array de computadoras
        public void addComputadora(Computadora argComputadora){
            if (this.iIndexComputadoras < Orden.iMaxComputadoras){
                this.computadoras[this.iIndexComputadoras++] = argComputadora;
                print("EXITO: La computadora se ha agregado a la computadora. ");
            }
            else 
                print("ERROR: La orden ha alcanzado el limite de productos. ");
        }
        // Método para imprimir el estado del objeto
        @Override 
        public String toString(){
            var cEstado = new StringBuilder(); 
            cEstado.append("\nOrden #").append(this.iOrden).append(": \n");
            for (int f = 0; f < this.iIndexComputadoras; f++){
                cEstado.append(this.computadoras[f].toString());
            }
            return cEstado.toString(); 
        }
        
}
