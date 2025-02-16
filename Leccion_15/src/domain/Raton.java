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
        
// Importamos la clase padre de DispositivoEntrada
import domain.DispositivoEntrada; 

// La clase de Raton que hereda de la clase de DispositivoEntrada
// Esta clase será añadida como atributo de la clase Computadora
public class Raton extends DispositivoEntrada{
    // Atributos
        // Dinámicos 
        private int iRaton; 
        // Estaticos
        private static int iNextRaton; 
        
    // Constructores
        // Con argumentos
        public Raton(String cArgTipoEntrada, String cArgMarca){
            // Ejecutamos la tarea constructora de la clase padre
            super(cArgTipoEntrada, cArgMarca);
            print("El constructor con argumentos de la clase Raton se esta ejecutando. ");
            // Asignamos los atributos locales de la clase hija, esta clase
            this.iRaton = ++Raton.iNextRaton;
        }
    
    // Métodos
        // Método para imprimir el estado de un objeto
        @Override
        public String toString(){
            return new StringBuilder().append(super.toString()).append("\tRaton #").
                    append(this.iRaton).append("\n").toString(); 
        }
}
