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

// En esta clase revisaremos el concepto de bloques de código inicializadores
// Es importante mencionar que estos bloque casi no se usan en JAVA, ya que los atributos de una clase son asignados directamente desde el constructor

public class PersonaConInicializadores {
    private final   int iPersona; 
    private static  int iNextPersona;  
    
    // Para definir un inicializador estático, utilizamos la siguiente sintáxis
    // El inicializador estático solo se ejecuta una vez
    // Dicha vez ocurre cuando la clase se carga por primera vez en memoria, es decir la primera vez que se hace referencia a la clase dentro de la rutina
    // El inicializador estático se ejecuta antes que el inicializador dinámico, siempre
    static{
        print("El inicializador estatico de la clase PersonaConInicializadores se esta ejecutando. ");
        PersonaConInicializadores.iNextPersona = 0;      
    }
    
    // Para definir un inicializador dinámico (no estático), utilizamos la siguiente sintáxis
    // El inicializador dinámico se ejecuta cada vez que se crea una instancia de la clase
    {
        print("El inicializador dinamico de la clase PersonaConInicializadores se esta ejecutando. ");
        this.iPersona = ++PersonaConInicializadores.iNextPersona; 
    }
    
    // Constructor de la clase
    public PersonaConInicializadores(){
        // Se construye el objeto
        super();
        // Se ejecuta el inicializador estático, si es que la clase no se ha cargado
        // Se ejecuta el inicializador dinamico
        print("El constructor de la clase sin argumentos de la clase PersonaConInicializadores se esta ejecutando. ");
    }
}
