/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author dannapaola
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola de nuevo");
        //s1 es una instancia de la clase Silla; Instance: Ejemplar.
        Silla s1 = new Silla();
        System.out.println(s1); // Por defecto se invoca toString();
        System.out.println(s1.toString());
        
        //miBocho es una instancia de la clase Automovil; Instance: Ejemplar.
        Automovil miBocho = new Automovil();
        System.out.println(miBocho);
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);

        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);

        Automovil miAcura = new Automovil("Acura", "NSX", 2013, Color.GRAY);
        System.out.println(miAcura);
    }

}
