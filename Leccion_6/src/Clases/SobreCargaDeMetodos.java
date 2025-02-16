/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Sobrecargde Métodos
// La sobrecarga de métodos consiste en definir el mismo método más de una vez, pero con distintos parámetros
// Estos distintos parámetros determinan que método el compilador utilizará

public class SobreCargaDeMetodos {
    public static int sumar(int iArg1, int iArg2){
        return iArg1 + iArg2;
    }
    public static double sumar(double fArg1, double fArg2){
        return fArg1 + fArg2; 
    }
    
}
