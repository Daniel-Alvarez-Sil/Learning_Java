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

// El modificador de acceso, default o package:
// Este modificador de acceso no se especifica, sino que, la ausencia de cualquier modificador es lo que determina el acceso default
// Con este modificador, solo tenemos acceso a las clases, variables, métodos y constructores desde las clases del mismo paquete y desde la misma clase
// Con este modificador, las variables y métodos pueden ser heredados, y la clase puede tener subclases

// Clase
class ClaseDefault {
    // Atributo
    int iVarDefault; 
    // Constructor
        // Sin argumentos
        ClaseDefault(){
            
        }
    // Método
    void metodoDefault(){
        print("Metodo default");
    }
}
