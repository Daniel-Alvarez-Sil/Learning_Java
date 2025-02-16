/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package front_end;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importaciones necesarias para el funcionamiento del sistema
import          negocio.*;
import static   domain.Print.print;
import          java.util.Scanner;

public class menu {
    // Variables
        // Estáticos
        public static Scanner          lector   = new Scanner(System.in);
        public static int              iOpcion  = 0; 
        public static String           cRuta    = "C:/Pruebas_en_C/peliculas.txt";
        public static InterfazDeReglas opciones = new ImplementacionDeReglas(); 
    // Métodos
        // Main
        public static void main(String cArg[]){
            menu.opciones.iniciarArchivo(menu.cRuta);
            do {
                print("\nMenu: \n\t1. Iniciar Catalogo \n\t2. Agregar Pelicula \n\t3. Listar Peliculas \n\t4. Buscar Pelicula \n\t5. Salir \n\nIngresa tu opcion: ");
                menu.iOpcion = Integer.parseInt(menu.lector.nextLine());
                switch (menu.iOpcion){
                    case 1 -> menu.uno();
                    case 2 -> menu.dos();
                    case 3 -> menu.opciones.listarPeliculas(menu.cRuta);
                    case 4 -> menu.cuatro();
                    case 5 -> print("Gracias por utilizar el sistema. Hasta pronto!\n");
                    default -> print("ERROR: Tu opcion no es valida. Por favor escoge nuevamente: \n"); 
                }
            } while (menu.iOpcion != 5);           
        }
        // Método a ejecutarse para la opción 1
        public static void uno(){
            print("Iniciando el archivo... \n");
            menu.opciones.iniciarArchivo(menu.cRuta);
        }
        // Método a ejecutarse para la opción 2
        public static void dos(){
            print("Ingresa el nombre de la pelicula: ");
            menu.opciones.agregarPelicula(menu.cRuta, menu.lector.nextLine());
        }
        // Método a ejecutarse para la opcion 4
        public static void cuatro(){
            print("Ingresa el nombre de la pelicula a buscar: ");
            menu.opciones.buscarPelicula(menu.cRuta, menu.lector.nextLine());
        }
        
        
}
