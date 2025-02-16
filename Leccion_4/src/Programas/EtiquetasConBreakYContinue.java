package Programas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author misio
 */
public class EtiquetasConBreakYContinue {
    public static void main(String args[]){
        // El uso de etiquetas facilita el uso de los comandos break y continue
        print("Impresion de numeros pares: ");
        for (var f = 0; f < 100; f++)
        {
            if (f % 2 == 0)
            {
                print("Valor: " + f);
                if (f == 10); 
                    break; 
            }
            else 
                continue;
        }
    }
    // Módulo para facilitar la impresión de cadenas
    public static void print(String cVar){
        System.out.println(cVar);
    }
    
    
}
