/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase de Libro
import domain.Libro; 

// Una matriz es un arreglo con 2 dimensiones, filas y columnas

// Pruebas con el Concepto de Matrices
public class PruebaMatrices {
    public static void main(String args[]){
        // Declaración de una Matriz [filas][columnas]
        int iNumeros[][] = new int[3][2]; 
        // Asignación de valores a la matriz (podríamos usar un ciclo for)
        iNumeros[0][0] = 1; 
        iNumeros[0][1] = 2; 
        iNumeros[1][0] = 3; 
        iNumeros[1][1] = 4; 
        // Imprimimos los valores de la matriz
        for (int f = 0; f <= iNumeros.length - 1; f++){
            for (int k = 0; k <= iNumeros[f].length - 1; k++){
                print("Valor [" + f + "][" + k + "]: " + iNumeros[f][k]);
            }
        }
        
        print("");
        
        // Declaración de matrices con elementos directamente
        String iFrutas[][] = {{"Mango", "Manzana"}, {"Zanahoria"}};
        for (int f = 0; f <= iFrutas.length - 1; f++){
            for (int k = 0; k <= iFrutas[f].length - 1; k++){
                print("Valor [" + f + "][" + k + "]: " + iFrutas[f][k]);
            } 
        }
          
        print("");
        
        // Declaracion de matriz de objetos
        Libro libros[][] = new Libro[2][3]; 
        for (int f = 0; f <= libros.length - 1; f++){
            for (int k = 0; k <= libros[f].length -1; k++){
                libros[f][k] = new Libro("Manga", 139.00);
            }
        }
        printMatriz(libros);
    }
    
    // Método para imprimir una matriz con objetos como elementos
    public static void printMatriz(Object matriz[][]) /*No tenemos que indicar el número de filas y columnas, ya que solo recibimos la referencia del objeto*/{
        print("Impresion de la Matriz: ");
        for (int f = 0; f <= matriz.length - 1; f++){
            for (int k = 0; k <= matriz[f].length - 1; k++){
                print("Valor[" + f + "][" + k + "]: " + matriz[f][k]);
            }           
        }
        
    }
    
    // Método para facilitar la impresión de cadenas
    public static void print(String cArg){
        System.out.println(cArg);
    }
    
    
}
