/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase de Persona
import Dominio.Persona; // <-- Codigo Redundante porque ambas clases se encuentran el mismo paquete

// Creamos una clase hija de la clase Persona
public class Empleado extends Persona{
    // Atributos
        // Dinámicos 
        private int     iEmpleado;
        private double  fSueldo; 
        // Estáticos
        private static int iNextEmpleado; 
    // Si el constructor de la clase hija no tiene argumentos o bien la clase hija no ha definido un constructor, el constructor de la clase Padre es llamado automáticamente
    public Empleado(String cArgNombre, char cArgGenero, int iArgEdad, String cArgDireccion, double fArgSueldo){
        // Llamamos al constructor de la clase Padre
        super(cArgNombre, cArgGenero, iArgEdad, cArgDireccion);
        // Asignamos los atributos locales de la instancia
        this.iEmpleado  = ++Empleado.iNextEmpleado;
        this.fSueldo    = fArgSueldo;        
        print("El constructor con argumentos de la clase Empleado se esta ejecutando... ");
    }
    
    // Métodos 
        // Métodos Getters y Setters
            // iEmpleado
            public int getIEmpleado(){
                return this.iEmpleado; 
            }
            // fSueldo 
            public double getFSueldo(){
                return this.fSueldo;
            }
            public void setFSueldo(double fArgSueldo){
                this.fSueldo = fArgSueldo; 
            }
            // iNextEmpleado
            public int getINextEmpleado(){
                return Empleado.iNextEmpleado; 
            }
            public void setINextEmpleado(int iArgNextEmpleado){
                Empleado.iNextEmpleado = iArgNextEmpleado; 
            }
            
        // Método para imprimir el estado del objeto
        @Override
        public String toString(){
            return new StringBuilder().append(super.toString()).append("# de Empleado: ").append(this.iEmpleado).append("\nSueldo: ").append(this.fSueldo).append("\n").toString();
        }
}
