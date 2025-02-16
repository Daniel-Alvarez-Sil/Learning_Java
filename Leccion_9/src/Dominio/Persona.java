/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Daniel Alvarez Sil
 */

// En esta lección, veremos el concepto de Herencia en Java
// La herencia en Java es solamente simple, no múltiple como en Python
// En la herencia de Java, los atributos private no son heredados 
// Debido a esto, cuando atributos privados deben ser heredados, asignamos los atributos como "protected"
// En la herencia de Java, los constructores no son heredados, por lo que debemos utilizar el comando "super" para llamar los constructores de clases padre

// En Java, todas las clases sin herencia heredan de la clase, Object
// Para nuestro ejercicio, Persona será la clase Padre
public class Persona extends Object{
     // Atributos de la clase
        // Dinámicos
        protected String    cNombre; 
        protected char      cGenero; 
        protected int       iEdad; 
        protected String    cDireccion; 
        
    // Sobrecarga de Constructores
        // Constructor Vacío
        public Persona(){
            print("El constructor sin argumentos de la clase Persona se esta ejecutando... ");
        }
        // Constructor con Argumentos
        public Persona(String cArgNombre, char cArgGenero, int iArgEdad, String cArgDireccion){
            this.cNombre    = cArgNombre; 
            this.cGenero    = cArgGenero; 
            this.iEdad      = iArgEdad;
            this.cDireccion = cArgDireccion; 
            print("El constructor con argumentos de la clase Persona se esta ejecutando... "); 
        }
        
    // Métodos de la clase
        // Método para facilitar la impresión de cadenas 
        public static void print(String cArg){
            System.out.println(cArg);
        }
        
        // Métodos Setters y Getters
            // cNombre
            public String getCNombre(){
                return this.cNombre; 
            }
            public void setCNombre(String cArgNombre){
                this.cNombre = cArgNombre; 
            }
            // cGenero 
            public char getCGenero(){
                return this.cGenero;
            }
            public void setCGenero(char cArgGenero){
                this.cGenero = cArgGenero; 
            }
            // iEdad
            public int getIEdad(){
                return this.iEdad;
            }
            public void setIEdad(int iArgEdad){
                this.iEdad = iArgEdad;
            }
            // cDireccion
            public String getCDireccion(){
                return this.cDireccion;
            }
            public void setCDireccion(String cArgDireccion){
                this.cDireccion = cArgDireccion; 
            }
        // Método para imprimir el estado del objeto 
        @Override
        public String toString(){
            // Creamos un objeto de tipo Stringbuilder para crear la cadena de retorno
            // Stringbuilder es conveniente porque solo se crea un objeto en memoria
            // Por otro lado, el uso de concatenación de cadenas crea varios objetos de tipo String en memoria
            var cEstado = new StringBuilder();
            cEstado.append("Impresion de la Instancia: \n"); 
            cEstado.append("Nombre: ").append(this.cNombre).append("\n");
            cEstado.append("Genero: ").append(this.cGenero).append("\n");
            cEstado.append("Edad: ").append(this.iEdad).append("\n");
            cEstado.append("Direccion: ").append(this.cDireccion).append("\n");
            cEstado.append("Referencia: ").append(super.toString()).append("\n");
            // Retornamos el Stringbuilder convertido a String
            return cEstado.toString();                       
        }
}
