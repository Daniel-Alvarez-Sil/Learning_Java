/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author misio
 */

// El operador "this" es un comando que nos permite accesar los métodos y atributos de un instancia directamente desde su clase correspondiente

public class OperadorThis {
    public int a; 
    public int b; 
    
    public void modificarValores(int iArg1, int iArg2){
        this.a = iArg1; 
        this.b = iArg2; 
    }
            
    public int retornarSuma(){
        return this.a + this.b; 
    }
    
    public int retornarResta(){
        return this.a - this.b; 
    }
}

