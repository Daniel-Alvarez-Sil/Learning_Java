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

// Esta clase será el padre de las clases Ratón y Teclado
public class DispositivoEntrada extends Object{
    // Atributos que se herdarán 
        // Dinámicos
        protected String cTipoEntrada; 
        protected String cMarca; 
    
    // Constructores
        // Con argumentos
        public DispositivoEntrada(String cArgTipoEntrada, String cArgMarca){
            print("El constructor con argumentos de la clase DispositivoEntrada se esta ejecutando. ");
            this.cTipoEntrada   = cArgTipoEntrada; 
            this.cMarca         = cArgMarca;
        }
    // Métodos
        // Métodos Getters y Setters
            // cTipoEntrada
            public String getCTipoEntrada(){
                return this.cTipoEntrada; 
            }
            public void setCTipoEntrada(String cArgTipoEntrada){
                this.cTipoEntrada = cArgTipoEntrada; 
            }
            // cMarca
            public String getCMarca(){
                return this.cMarca; 
            }
            public void setCMarca(String cArgMarca){
                this.cMarca = cArgMarca; 
            }
        // Método para imprimir el estado del objeto
        @Override
        public String toString(){
            return new StringBuilder().append("Dispositivo de Entrada: \n").append("\tTipo de Entrada: ")
                    .append(this.cTipoEntrada).append("\n\tMarca: ").append(this.cMarca).append("\n").toString();
        }
}
