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

// La clase de Teclado que hereda de la clase de DispositivoEntrada
// Esta clase será añadida como un atributo de la clase Computadora
public class Teclado extends DispositivoEntrada{
    // Atributos 
        // Estáticos
        private int iTeclado;
        // Dinámicos
        private static int iNextTeclado; 
        
    // Constructores
        // Con argumentos
        public Teclado (String cArgTipoEntrada, String cArgMarca){
            // Llamamos al constructor de la clase padre
            super(cArgTipoEntrada, cArgMarca); 
            print("El constructor sin argumentos de la clase Teclado se esta ejecutando. ");
            // Asignamos los atributos locales de la clase hijaa, esta clase
            this.iTeclado = ++Teclado.iNextTeclado; 
        }
        
    // Métodos
        // Método para imprimir el estado de un objeto
        @Override
        public String toString(){
            return new StringBuilder().append(super.toString()).append("\tTeclado #").
                    append(this.iTeclado).append("\n").toString();
        }
}
