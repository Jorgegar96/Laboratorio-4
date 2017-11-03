/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author edujg
 */
public class Elfos extends Guerrero {

    private String tipoarma;
    private String rango;

    public Elfos() {
        super();
    }

    public Elfos(String tipoarma, String rango, String nombre, int edad, String lugarn, int poderatk, int salud, int costo) {
        super(nombre, edad, lugarn, poderatk, salud, costo);
        this.tipoarma = tipoarma;
        this.rango = rango;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public void setTipoarma(String tipoarma) {
        this.tipoarma = tipoarma;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString() + "Elfos{" + "Tipo de arma = " + tipoarma + "\nRango = " + rango + "}}\n\n";
    }

    @Override
    public void Ataque(Guerrero atacado) {
        atacado.setSalud(atacado.getSalud() - (getPoderatk()));
    }

}
