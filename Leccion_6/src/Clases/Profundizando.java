/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Profundizando en conceptos de clases y métodos

public class Profundizando {
    public static void main(String args[]){
        var libro1 = new Libro("Dorohedoro", "100");
        libro1.printAtributos();
        libro1.printObjetoMemoria();
    }
}

// Podemos crear otras clases dentro del mismo archivo
// Sin embargo, estas clases se conocen como default o package porque solo se pueden acceder desde los archivos del paquete en el que se encuentra

// Todas la clases heredan de la clase Object (igual que en Python)
class Libro{
    String cNombre;
    String cPrecio; 
    
    Libro(String cArg1, String cArg2){
        super(); // Con este comando llamamos el constructor de la clase object
                 // Este constructor se encarga de crear el espacio en memoria para la creación de objetos
                 // Este comando se ejecuta automáticamente con el compilador, por lo que no es necesario escribirlo
        this.cNombre = cArg1; 
        this.cPrecio = cArg2;        
    }
    
    void printAtributos(){
        print("Impresion de Libro: ");
        print("Titulo: " + this.cNombre);
        print("Precio: " + this.cPrecio);
    }
    
    void printObjetoMemoria(){
        print("Objeto en Memoria: " + this); // El operador this retorna la referencia del objeto en el que se esté trabajando
    }
    
    static void print(String cArg){
        System.out.println(cArg);
    }
    
}
