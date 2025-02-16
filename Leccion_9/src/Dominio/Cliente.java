/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase de Date
import java.util.Date; 

// Importamos la clase de Persona
import Dominio.Persona; 

// Creamos una clase hija de la clase Persona
public class Cliente extends Persona{
    // Atributos
        // Dinámicos
        private int     iCliente;
        private Date    feRegistro; 
        private boolean boolVip; 
        // Estáticos
        private static int iNextCliente; 
        
    // Métodos 
        // Sobrecarga de Constructores
            // Constructor sin Argumentos
            public Cliente(){
                super(); // <-- Este comando es redundante porque se llama automaticamente, debido a que la clase padre contiene un constructor con argumentos vacios
                this.iCliente = ++Cliente.iNextCliente;
            }
                    
            
            // Constructor con Argumentos
            public Cliente(String cArgNombre, char cArgGenero, int iArgEdad, String cArgDireccion, Date feArgRegistro, boolean boolArgVip){
                // Llamamos el constructor vacío de la misma clase
                this();
                // Asignamos los atributos heredados de la instancia
                this.cNombre    = cArgNombre; 
                this.cGenero    = cArgGenero; 
                this.iEdad      = iArgEdad; 
                this.cDireccion = cArgDireccion; 
                // Asignamos los atributos locales de la instancia
                this.feRegistro = feArgRegistro;
                this.boolVip    = boolArgVip;
                print("El constructor con argumentos de la clase Cliente se esta ejecutando... ");
        }
        
        // Métodos Getters y Setters
            // iCliente
            public int getICliente(){
                return this.iCliente; 
            }
            // feRegistro
            public Date getFeRegistro(){
                return this.feRegistro; 
            }
            public void setFeRegistro(Date feArgRegistro){
                this.feRegistro = feArgRegistro;
            }
            // boolVip 
            public boolean getBoolVip(){
                return this.boolVip; 
            }
            public void setBoolVip(boolean boolArgVip){
                this.boolVip = boolArgVip; 
            }
        // Método para imprimir el estado del objeto 
        @Override
        public String toString(){
            return new StringBuilder().append(super.toString()).append("# de Cliente: ").append(this.iCliente).append("\nRegistro: ").append(this.feRegistro).append("\nVIP: ").append(this.boolVip).append("\n").toString();
        }
}
