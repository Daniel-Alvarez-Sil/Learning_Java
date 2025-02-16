/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author misio
 */
public class Caja {
    // Atributos de la caja
    public int l; 
    public int w; 
    public int h; 
    
    // Métodos de la caja
    public Caja(){
        print("El constructor sin argumentos se esta ejecutando...");
    }
    
    public Caja(int iArg1, int iArg2, int iArg3){
        this.l = iArg1; 
        this.w = iArg2; 
        this.h = iArg3; 
        print("El constructor con argumentos se esta ejecutando...");
    }
    
    public int retornaVolumen(){
        return this.l * this.w * this.h; 
    }
    
    public void printAtributos(){
        print("Length: " + this.l);
        print("Height: " + this.h);
        print("Weight: " + this.w);
        print("Volume: " + this.retornaVolumen());
    }
    
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
