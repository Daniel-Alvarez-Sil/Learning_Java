/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos el método "print"
import static domain.Print.print; 

// Importamos la clases del paquete Input-Output
import java.io.*;

// Manejo de archivos
public class ManejoDeArchivos {
    // Creación de archivos
    public static void crearArchivo(String cArgArchivo){        
        // Creamos una variable de tipo File
        File fileArchivo = new File(cArgArchivo);
        // Establecemos un bloque de código try-catch para validar que la ruta del archivo sea usable
        try{
            // Creamos un objeto para utilizar el archivo
            PrintWriter salida = new PrintWriter(fileArchivo);
            // El archivo se crea hasta que se cierra el archivo
            salida.close();            
            print("El archivo se ha creado con exito. ");
        } catch (FileNotFoundException e){
            print("Error: " + e.getMessage());
        }
    }
    // Escritura sobre archivos
    public static void escribirArchivo(String cArgArchivo, String cArgContenido){
        File archivo = new File(cArgArchivo);
        try{
            PrintWriter salida = new PrintWriter(archivo); 
            // Utilizamos la instancia de PrintWriter para escribir sobre el archivo
            salida.println(cArgContenido);
            // Cerramos el archivo para que se cree
            salida.close();
            print("El archivo se ha creado y escrito sobre el correctamente. ");
        } catch (FileNotFoundException e){
            print("Error" + e.getMessage());
        }
    }
    // Append a un archivo
    public static void anexarArchivo(String cArgArchivo, String cArgContenido){
        //File archivo = new File(cArgArchivo);
        try {
          // Creamos una instancia de tipo PrintWriter, pero especial para anexar información a un archivo   
          PrintWriter salida = new PrintWriter(new FileWriter(cArgArchivo, true)); // <-- El segundo parámetro del constructor de la clase FileWriter indica que vamos a anexar y no sobreescribir
          // Anexamos la información
          salida.println(cArgContenido);
          // Cerramos el archivo para que se guarden los cambios
          salida.close();
          print("La informacion se ha anexado correctamente al archivo. ");
        } catch(Exception e){
            print("Error: " + e.getMessage());
        }        
    }
    // Leer información de un archivo
    public static void leerArchivo(String cArgArchivo){
        File archivo = new File(cArgArchivo);
        try {
            // Creamos un objeto de tipo BufferedReader
            // Esta instancia es capaz de leer lineas completas de un archivo
            // Mandamos un objeto de tipo de FileReader como parámetro, ya que dicho objeto no puede leer lineas completas y los objetos de tipo BufferedReader sí pueden
            BufferedReader lector = new BufferedReader(new FileReader(cArgArchivo));
            // Leemos todas las líneas del archivo
            print("Impresion de la informacion del archivo " + "\"" + cArgArchivo + "\": ");
            String cLectura = lector.readLine();
            while (cLectura != null){
                print(cLectura);                
                cLectura = lector.readLine();
            }
        } catch (Exception e) {
            print("Error: " + e.getMessage());
        } 
    }
}
