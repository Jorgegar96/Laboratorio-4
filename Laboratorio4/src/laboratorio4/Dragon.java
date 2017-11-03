/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author JorgeLuis
 */
public class Dragon extends Guerrero {

    private String color;
    private String raza;

    public Dragon() {
        super();
    }

    public Dragon(String color, String raza, String nombre, int edad, String lugarn, int poderatk, int salud, int costo) {
        super(nombre, edad, lugarn, poderatk, salud, costo);
        this.color = color;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void Ataque(Guerrero atacado) {
        atacado.setSalud(atacado.getSalud() - getPoderatk());
        atacado.setPoderatk(atacado.getPoderatk() - (atacado.getPoderatk() / 4));
    }

    @Override
    public String toString() {
        return super.toString() + "Dragon{" + "Color=" + color + "\nRaza=" + raza + "}}\n\n";
    }

}
