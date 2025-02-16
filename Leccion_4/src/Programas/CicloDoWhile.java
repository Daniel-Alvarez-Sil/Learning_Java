/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author misio
 */
public class CicloDoWhile {
    public static void main(String args[]){
        // Ciclo Do While
        print("Impresion de 10 valores usando el ciclo Do While: ");
        var iContador = 1; 
        do{
            print("Valor: " + iContador++);
        }while (iContador <= 10); 
    }
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
