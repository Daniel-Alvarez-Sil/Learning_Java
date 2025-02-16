/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author misio
 */

// Los constructores son aquellos métodos que inicializan una instancia de una clase

public class Constructores {
    public int a; 
    public int b; 
    
    // Constructores
    // Esta es una sobrecarga de constructores
    // La sobrecarga de constructores consite en establecer más de un método constructor
    // El compilador toma el constructor adecuado automáticamente
    public Constructores(){
        print("El constructor sin argumentos se esta ejecutando...");
    }
    
    public Constructores(int iArg1, int iArg2){
        print("El constructor con argumentos se esta ejecutando...");
        this.a = iArg1; 
        this.b = iArg2; 
    }
        
    public void printAtributos(){
        print("A: " + this.a);
        print("B: " + this.b);
    }
    
    public static void print(String cVar){
        System.out.println(cVar); 
    }
}
