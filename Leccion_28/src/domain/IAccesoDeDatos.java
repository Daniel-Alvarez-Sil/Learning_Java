/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Una interfaz en Java es similar a una clase
// Las interfaces son usadas para ser implementadas en clases en las cuales se quiere heredar un comportamiento específico
// Las diferencia entre clases e interfaces es la siguiente
// Las clases heredan características en común
// Las interfaces imparten comportamiento en común

// Las interfaces no heredan de ninguna clase, pero si pueden heredar de otra interfaz
// NOTA: Una interfaz es como una plantilla para utilizar en "subclases"
public interface IAccesoDeDatos {
    // Todos los atributos de una interfaz son constantes
    // Es decir, son finales y privados
    int iMAX_REGISTROS = 10; 
    
    // Todos los métodos de una interfaz son abstractos
    void create(); 
    void read(); 
    void update();
    void delete(); 
    
}
