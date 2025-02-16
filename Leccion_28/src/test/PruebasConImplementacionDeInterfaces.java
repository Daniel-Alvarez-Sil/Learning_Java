/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos el método "print"
import static domain.Print.print; 

// Importamos las clases de las cuales vamos a realizar pruebas
import domain.*;

public class PruebasConImplementacionDeInterfaces {
    public static void main(String args[]){
        // Creación de un objeto de tipo clase que implementa una interfaz
        IAccesoDeDatos prueba1 = new ImplementacionSQL();
        ImplementacionOracle prueba2 = new ImplementacionOracle();
        
        // Utilizamos polimorfismo para reducir el número de líneas de código e ejecutar los métodos de las implementaciones
        imprimirCreate(prueba1);
        imprimirCreate(prueba2);
    }
    
    // Aplicación del concepto de polimorfismo y upcasting
    public static void imprimirCreate(IAccesoDeDatos argInterfaz){
        argInterfaz.create();
    }
}
