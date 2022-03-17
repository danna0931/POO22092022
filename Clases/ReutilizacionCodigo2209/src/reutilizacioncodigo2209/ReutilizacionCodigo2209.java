
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Procesador;
import javax.swing.JFrame;

/**
 *
 * @author dannapaola
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    
// API: Conjunto de clases o blibliotecas con documentacion para saber como ocuparlas
    public static void main(String[] args) {
        
        // Metodos String
        String nombre= new String ("José José");
        System.out.println(nombre);
        // Imprimir un caracter del nombre
        System.out.println(nombre.charAt(5));
        // Poner en mayusculas 
        System.out.println(nombre.toUpperCase());
        
        // Reutilizacion de codigo
        // Crear una ventana apartir de un codigo ya existente.
        /*JFrame ventana= new JFrame("Mi primer ventana");
        ventana.setSize(600,400);
        ventana.setVisible(true);*/
        
  Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println( miCompu );
    }
    
}
