/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.composicion;

/**
 *
 * @author dannapaola
 */
public class Llanta {

    private String marca;
    private int rodada;

    public Llanta() {
    }

    public Llanta(String marca, int rodada) {
        this.marca = marca;
        this.rodada = rodada;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Llanta{" + "marca=" + marca + ", rodada=" + rodada + '}';
    }

}
