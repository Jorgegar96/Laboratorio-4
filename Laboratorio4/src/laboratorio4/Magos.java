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
public class Magos extends Guerrero {

    private String tipomag;
    private String elemento;

    public Magos() {
        super();
    }

    public Magos(String tipomag, String elemento, String nombre, int edad, String lugarn, int poderatk, int salud, int costo) {
        super(nombre, edad, lugarn, poderatk, salud, costo);
        this.tipomag = tipomag;
        this.elemento = elemento;
    }

    public String getTipomag() {
        return tipomag;
    }

    public void setTipomag(String tipomag) {
        this.tipomag = tipomag;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Magos{" + "tipomag=" + tipomag + ", elemento=" + elemento + '}';
    }

}
