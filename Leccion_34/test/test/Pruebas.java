/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import          java.io.File;
import          java.io.PrintWriter;
import          java.nio.file.*;
import static   domain.Print.print;

/**
 *
 * @author Daniel Alvarez Sil
 */
public class Pruebas {
    public static void main(String cArg[]){        
//        File archivo = new File("pruebas.txt");
//        try{
//            PrintWriter escritor = new PrintWriter(archivo);
//        } catch (Exception e){
//            
//        }
        
   //     Path prueba = Paths.get("C:", "Pruebas_cerca_de_C", "pruebas.txt");
//        File prueba2 = new File("C:/Pruebas_C/pruebas.txt");
//        try {
//            print(Boolean.toString(prueba2.mkdirs()));
//        } catch (Exception e){
//            print(e.toString());
//        }

//        String  cPrueba = "C:/Prueba/de/Archivos/de/Carpeta/.txt";
//        int         iIndex  = 0;
//        Character   cRegex  = 92;
//        print(cPrueba.split("/")[cPrueba.split("/").length - 1]);

//        while(!" ".equals(cPrueba.split("/")[iIndex])){
//            iIndex = iIndex + 1; 
//        }
//        

        File prueba3 = new File("C:/Pruebas_en_C/peliculas.txt");
        if (prueba3.exists())
            print("El archivo existe. ");
        else 
            print("El archivo no existe. ");

            
    }
}
