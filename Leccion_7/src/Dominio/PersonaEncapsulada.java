/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Daniel Alvarez Sil
 */

// El encapsulamiento es el concepto que consiste en privatizar los atributos y/o métodos de una clase para que solo sean accesibles desde dicha clase

public class PersonaEncapsulada {
    // Creación de atributos privados
    private String cNombre; 
    private double fSueldo; 
    private boolean boolActivo; 
    
    // Constructor (inicializador) de la Clase
    public PersonaEncapsulada(String cArgNombre, double fArgSueldo, boolean boolArgActivo){
        this.cNombre = cArgNombre; 
        this.fSueldo = fArgSueldo; 
        this.boolActivo = boolArgActivo; 
        print("El constructor con argumento se esta ejecutando... ");
    }
    
    // Métodos Get y Set de nuestros atributos encapsulados
        // cNombre
        public String getCNombre(){
            return this.cNombre; 
        }
        public void setCNombre(String cArgNombre){
            this.cNombre = cArgNombre; 
        }
        // fSueldo
        public double getFSueldo(){
            return this.fSueldo; 
        }
        public void setFSueldo(double fArgSueldo){
            this.fSueldo = fArgSueldo; 
        }
        // boolActivo
        // Debido a que este atributo es de tipo Bool, la sintaxis cambia de la siguienta manera:
        public boolean isBoolActivo(){
            return this.boolActivo; 
        }
        public void setBoolActivo(boolean boolArgActivo){
            this.boolActivo = boolArgActivo; 
        }
        
    // Métodos
    // Método toString (este método se encarga de imprimir todos los atributos de un objeto lo cual se conoce como el estado del objeto)
    public String toString(){
        return "Impresion de la Persona Encapsulada: \n" + "Nombre: " + this.getCNombre()
                + "\n" + "Sueldo: " + this.getFSueldo() + "\n" + "Activo: " + this.isBoolActivo();
    }
    
    public void printAtributos(){
        print("Impresion de la Persona Encapsulada: ");
        print("Nombre: " + this.getCNombre());
        print("Sueldo: " + this.getFSueldo());
        print("Activo: " + this.isBoolActivo());
    }   
    
    public static void print(String cArg){
        System.out.println(cArg);        
    }
}
