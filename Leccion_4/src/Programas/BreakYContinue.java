/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author misio
 */

// NOTAS: 
// Break - Comando para salir de un CICLO
// Continue - Termina la iteración actual y ejecuta automáticamente la siguiente iteración

public class BreakYContinue {
    public static void main(String args[]){
        // Uso de break y continue
        print("Impresion de valores pares");
        Inicio:
        for (var f = 0; f < 100; f++)
        {
            if (f % 2 == 0)
            {
                print("Valor par: " + f); 
                if (f == 10)
                    break;
            }
            else
                continue Inicio;
           
        }
    }
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar){
        System.out.println(cVar);
    }
}
