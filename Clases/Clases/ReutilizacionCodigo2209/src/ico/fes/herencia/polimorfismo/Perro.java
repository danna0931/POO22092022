/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author dannapaola
 */
public class Perro extends Animal{
    private String raza;
    private String pedigree;

    public Perro() {
    }

    public Perro(String raza, String pedigree) {
        this.raza = raza;
        this.pedigree = pedigree;
    }

    public Perro(String raza, String pedigree, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
        this.pedigree = pedigree;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", pedigree=" + pedigree + '}';
    }
    
    @Override
    public void emitirSonido(){
            System.out.println("El perro esta ladrando... Guau!... Guau!");
    }
    
}
