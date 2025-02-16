/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clases para la creación Y escritura de archivos
import domain.ManejoDeArchivos;


// Manejo de archivos
public class PruebaDeManejoDeArchivos {
    public static void main(String cArg[]){  
        // Creación de Archivo
        // ManejoDeArchivos.crearArchivo("prueba.txt");
        // Creación y Escritura de Archivo
        ManejoDeArchivos.escribirArchivo("prueba.txt", "Hola desde Java. ");
        // Anexo de Información a un archivo
        ManejoDeArchivos.anexarArchivo("prueba.txt", "Hola de nuevo, desde Java. ");
        ManejoDeArchivos.leerArchivo("prueba.txt");
    }
}
