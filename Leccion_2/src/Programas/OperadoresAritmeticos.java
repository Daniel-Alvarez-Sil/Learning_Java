/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author misio
 */
public class OperadoresAritmeticos {
    // Uso de operadores aritméticos 
    public static void main(String args[]){
        // Suma
        var iA = 3;
        var iB = 4; 
        var fA = 3F;
        var fB = 4F; 
        int iSuma = iA + iB; 
        float fSuma = fA + fB;
        print("Suma de Enteros: " + iSuma);
        print("Suma de Flotantes: " + fSuma);
        // Resta 
        var iResta = iA - iB; 
        var fResta = fA - fB;
        print("Resta de Enteros: " + iResta);
        print("Resta de Flotantes: " + fResta);
        // Division
        var iDivision = iA / iB; 
        var fDivision = fA / fB; 
        print("Division de Enteros: " + iDivision);
        print("Division de Flotantes: " + fDivision);
        // Multiplicacion
        var iMultiplicacion = iA * iB; 
        var fMultiplicacion = fA * fB; 
        print("Multiplicacion de Enteros: " + iMultiplicacion);
        print("Multiplicacion de Flotantes: " + fMultiplicacion);
        // Residuo
        var iResiduo = iB / iA; 
        var fResiduo = fB / fA; 
        print("Residuo de Division de Enteros: " + iResiduo);
        print("Residuo de Division de Flotantes: " + fResiduo);
    }
    
    // Módulo para imprimir de manera más sencilla
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
