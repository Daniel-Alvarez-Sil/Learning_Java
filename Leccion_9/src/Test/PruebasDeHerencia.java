/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase de Date
import java.util.Date;

// Importamos las clases padre e hijas
    // Padre
    import Dominio.Persona;
    // Hijas
    import Dominio.Empleado; 
    import Dominio.Cliente; 

public class PruebasDeHerencia {
    // Pruebas de las clases padre e hijas
    public static void main(String args[]){
        var prueba1 = new Persona("Daniel", 'H', 19, "Cerezos 3, Casa 9");
        print(prueba1.toString());
        var prueba2 = new Empleado("Daniel", 'H', 19, "Cerezos 3, Casa 9", 3000);
        print(prueba2.toString());
        var prueba3 = new Empleado("Mariana", 'M', 21, "Cerezos 3, Casa 9", 3000);
        print(prueba3.toString());
        var prueba4 = new Cliente("Daniel", 'H', 19, "Cerezos 3, Casa 9", new Date(), true);
        print(prueba4.toString());
        var prueba5 = new Cliente("Mariana", 'M', 21, "Cerezos 3, Casa 9", new Date(), true);
        print(prueba5.toString());
    }
    
    // Método para facilitar la impresión de las cadenas
    public static void print(String cArg){
        System.out.println(cArg);
    }
}
