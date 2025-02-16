/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

import java.util.Random;

/**
 *
 * @author misio
 */
public class IfElse {
    public static void main(String args[]){
        // Sentencia de Control IF-ELSE
        boolean boolCondicion = false;
        if (boolCondicion){
            print("Condicion verdadera. ");
        }
        else{
            print("Condicion false. ");
        }
        
        // Sentencia de Control IF-ELSEIF...
        var random = new Random();
        int iNumero = random.nextInt(1, 5);
        String cNumero = "";
        if (iNumero == 1)
            cNumero = "Uno";
        else if (iNumero == 2)
            cNumero = "Dos";
        else if (iNumero == 3)
            cNumero = "Tres";
        else if (iNumero == 4)
            cNumero = "Cuatro";
        else 
            cNumero = "Numero Desconocido";
        print("El numero es " + cNumero);
            
          
    }
    
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
