/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importaciones necesarias para el funcionamiento del sistema
import java.io.*;
import domain.Pelicula; 
import static domain.Print.print; 
import java.util.*;
import java.nio.file.*;

// Importamos la clase InterfazDeAcceso
import acceso.InterfazDeAcceso;

// Implementamos los comportamientos definidos en la clase InterfazDeAcceso
public class ImplementacionDeAcceso implements InterfazDeAcceso {
    // Método para validar que la ruta del catálogo de películas sea correcto
    @Override
    public boolean existe(String cArgRuta) {
        try{
            File archivo = new File(cArgRuta);
            if (!archivo.exists())
                throw new Exception();
        } catch (Exception e){
          print("ERROR: La ruta del archivo no existe. \n");
          return false;   
        } 
        return true;             
    }
    // Método para generar una lista con todas las películas del catálogo
    @Override
    public List<Pelicula> listar(String cArgRuta){
        List<Pelicula> listaPeliculas = new ArrayList<>(); 
        if (this.existe(cArgRuta)){
            try{            
                BufferedReader lector = new BufferedReader(new FileReader(cArgRuta)); 
                String lectura = lector.readLine();
                do {
                    String cParamNombre = lectura.split(",")[1];
                    int iParamPelicula  = Integer.parseInt(lectura.split(",")[0]);
                    listaPeliculas.add(new Pelicula(cParamNombre, iParamPelicula));
                } while ((lectura = lector.readLine()) != null);
                lector.close();
            } catch (Exception e){
                print("ERROR: La lista de peliculas no pudo ser generada. \nPor favor intenta mas tarde.\n ");
                return null; 
            } finally{
                print("La lista de peliculas se ha generado exitosamente. \n");
            }
        }
        else
            print("ERROR: La lista de peliculas no pudo ser generada. \nPor favor intenta mas tarde.\n ");
        return listaPeliculas; 
    }
    // Método para escribir una pelicula en el cátalogo
    @Override 
    public void escribir(Pelicula argPelicula, String cArgRuta, boolean boolArgAnexar){
        if (this.existe(cArgRuta)){
            try{
                PrintWriter escritor = new PrintWriter(new FileWriter(cArgRuta, boolArgAnexar)); 
                escritor.println(argPelicula.getIPelicula().toString() + "," + argPelicula.getCNombre());
                escritor.close();
            } catch (Exception e){
                print("ERROR: No se pudo agregar la pelicula al catalogo. \nPor favor intenta nuevamente. \n");
                return ; 
            } finally{
                print("La pelicula ha sido agregada con exito al catalogo. \n");
            }
        }
        else 
           print("ERROR: No se pudo agregar la pelicula al catalogo. \nPor favor intenta nuevamente. \n");                        
    }
    // Método para buscar una película en el catálogo
    @Override
    public String buscar(String cArgRuta, String cArgPelicula){
        if (this.existe(cArgRuta)){
            try{
                BufferedReader lector = new BufferedReader(new FileReader(cArgRuta));
                String lectura = lector.readLine(); 
                do {
                    if (lectura.split(",")[1].equals(cArgPelicula)){
                        lector.close();
                        return "La pelicula se encuentra en el catalogo. \n";
                    }
                } while ((lectura = lector.readLine()) != null);
                lector.close();
                
            } catch (Exception e){} 
        }
        return "La pelicula no existe en el catalogo. \n";
    }    
    // Método para crear el archivo
    @Override 
    public void crear(String cArgRuta){
        String cArchivo = cArgRuta.split("/")[cArgRuta.split("/").length - 1];         
        String cRuta = "";
        for (var f = 0; f < cArgRuta.split("/").length - 1; f++)
            cRuta = cRuta + cArgRuta.split("/")[f] + "/";            
        try{
            File folder = new File(cRuta);
            if (!folder.exists())
                folder.mkdirs();
            File path = new File(cArgRuta);
            if (path.createNewFile())
                print("El archivo, " + "\"" + cArchivo + "\", ha sido creado con exito. \n");
            else 
                throw new IOException();
        } catch (Exception e) {
            print("ERROR: El archivo, \"" + cArchivo + "\", no pudo ser creado. \n");
        }
    }
    // Método para borrar el archivo
    @Override
    public void borrar(String cArgRuta){
        File file = new File(cArgRuta);
        if (file.delete())
            print("El archivo ha sido borrado con exito. \n");
        else    
            print("ERROR: El archivo no pudo ser borrado. \n");
        
    }
    
    
}
