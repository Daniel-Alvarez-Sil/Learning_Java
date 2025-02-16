package Programas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author misio
 */
public class InferenciaDeTipos {
    public static void main(String args[]){
        // La inferencia de datos consiste en asignar un valor a una variable cuyo tipo de dato es indefinido
        // Con este concepto, el tipo de dato de la variable se asigna de acuerdo al tipo de dato del valor que se le esté asignando
            // Variable Inferida de Tipo Entero
        var iVarInferida = 10;
        System.out.println("iVarInferida = " + iVarInferida);     
            // Variable Inferida de Tipo Caracter
        var cVarInferida = "Hola Mundo de Java";
        System.out.println("cVarInferida = " + cVarInferida);
    }
}
