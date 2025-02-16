/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

import java.util.Scanner;

/**
 *
 * @author misio
 */

// Esta rutina nos muesta como leer información del usuario

public class ScannerClass {
    public static void main(String args[]){
        // Imprimimos un mensaje para que el usuario sepa que ingresar
        System.out.println("Por favor ingresa tu nombre: ");
        // Creamos una instancia de la clase 'Scanner' para leer información del usuario
        Scanner consola = new Scanner(System.in);
        // Leemos la información que el usuario ingresa
        var cNombre = consola.nextLine();
        // Imprimimos la información del usuario
        System.out.println("Usuario: " + cNombre);            
    }
}
