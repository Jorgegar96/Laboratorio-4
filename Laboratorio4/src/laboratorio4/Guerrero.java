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
public abstract class Guerrero {

    private String nombre;
    private int edad;
    private String lugarn;
    private int poderatk;
    private int salud;
    private int costo;

    public Guerrero() {
    }

    public Guerrero(String nombre, int edad, String lugarn, int poderatk, int salud, int costo) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugarn = lugarn;
        this.setPoderatk(poderatk);
        this.setSalud(salud);
        this.setCosto(costo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarn() {
        return lugarn;
    }

    public void setLugarn(String lugarn) {
        this.lugarn = lugarn;
    }

    public int getPoderatk() {
        return poderatk;
    }

    public void setPoderatk(int poderatk) {
        if (poderatk < 51) {
            this.poderatk = poderatk;
        }
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        if (salud < 201 && salud > 99) {
            this.salud = salud;
        }
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        if (costo < 301) {
            this.costo = costo;
        }
    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre=" + nombre + ", edad=" + edad + ", lugarn=" + lugarn + ", poderatk=" + poderatk + ", salud=" + salud + ", costo=" + costo + '}';
    }

    public abstract void ataque();

}
