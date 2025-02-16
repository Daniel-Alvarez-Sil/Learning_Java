/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clases de las cuales realizaremos pruebas
import domain.Padre;
import domain.Hija; 

// Pruebas con el concepto de polimorfismo
public class PruebasDePolimorfismo {
    public static void main(String args[]){
        // Creamos dos instancia de las clases Padre e Hija
        var prueba1 = new Padre();
        var prueba2 = new Hija();
        // Ejemplo de polimorfismo
        imprimirMensaje(prueba1);
        imprimirMensaje(prueba2);
    }
    
    // Definimos un método que recibe como argumento un objeto de tipo Padre
    public static void imprimirMensaje(Padre argObjeto){ 
        // Cuando definimos un argumento de tipo objeto de una clase, podemos enviar como parametro cualquier objeto que sea una subclase de la clase definida como tipo de dato del argumento
        // Dicho comportamiento permite concebir el polimorfismo en Java
        // El polimorfismo es un concepto en el cual una linea de codigo genera distintos resultados de acuerdo a la circunstancias en que se ejecuta
        System.out.println("Impresion de Mensaje: ");
        // Ejemplo de polimorfismo
        argObjeto.mensaje();
    }
}
