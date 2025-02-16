/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author misio
 */
public class Aritmetica {
    // Atributos de la clase
    public int a;
    public int b;
    
    // Métodos de la clase
    public void sumar(){
        int resultado = a + b; 
        print("Resultado: " + resultado);
    }
   
    public int retornaSuma(){
        return a + b; 
    }
    
    public int modificarYSumarConArgumentos(int iParam1, int iParam2) // <-- Argumentos
    {
        a = iParam1; 
        b = iParam2; 
        return a + b; 
    }
    
    public static void print(String cVar){
        System.out.println(cVar);
    }
    
    
      
}
