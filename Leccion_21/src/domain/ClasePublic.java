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

// Modificador de acceso, public:
// Con este modificador; clases, variables, métodos y constructores pueden ser consultados, modificados y/o heredados (los constructores no se heredan)

// Clase
public class ClasePublic { // En un clase, permite que sea accesible desde cualquier lugar
    // Atributo o variable
    public int iVarPublic;     // De igual manera, un atributo public es accesible desde cualquier lugar
    // Constructor
    public ClasePublic(){
        this.iVarPublic = 1; 
    }
    // Método
    public void metodoPublic(){
        print("Metodo publico"); 
    }
}
