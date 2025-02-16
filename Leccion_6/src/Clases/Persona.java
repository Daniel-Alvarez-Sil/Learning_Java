/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

/**
 *
 * @author Daniel Alvarez Sil
 */
public class Persona {
    public String cNombre; 
    public String cApellido; 
    
    public Persona(){
        print("El constructor sin argumentos se esta ejecutando...");
    }
    
    public Persona(String cArg1, String cArg2){
        this.cNombre = cArg1; 
        this.cApellido = cArg2; 
        print("El constructor con argumentos se esta ejecutando...");
    }
    
    public void printAtributos(){
        print("Impresion de Persona: ");
        print("Nombre: " + this.cNombre);
        print("Apellido: " + this.cApellido);
    }
    
    public static void print(String cVar) {
        System.out.println(cVar);
    }
    
}
