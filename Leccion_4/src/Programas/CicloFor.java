/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author misio
 */
public class CicloFor {
    public static void main(String args[]){
        // Ciclo For
        print("Impresion de 10 valores utilizando el ciclo For: ");
        for (var contador = 1; contador <= 10; contador++){
            print("Valor: " + contador);
        }
    }
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
