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

// Modificador de acceso, protected:
// Este modificador no aplica para clases
// Las variables, métodos y constructores con este modificador solo pueden ser accesados desde esta clase y subclases

// Clase
public class ClaseProtected {
    // Atributo o Variable
    protected int iVarProtected;
    // Constructores
        // Sin argumentos
        protected ClaseProtected(){
            
        }
        // Con argumentos
        protected ClaseProtected(int iArgProtected){
            this();
            this.iVarProtected = iArgProtected; 
        }
    // Métodos
    protected void metododProtected(){
        print("Metodo protected");
    }
}
