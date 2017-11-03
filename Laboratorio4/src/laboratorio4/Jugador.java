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
public class Jugador {
    private String nombre;
    private float dinero;
    private int puntos;
    private Guerrero guerrero;

    public Jugador() {
        setPuntos(0);
    }

    public Jugador(String nombre, float dinero, int puntos, Guerrero guerrero) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.puntos = puntos;
        this.guerrero = guerrero;
        setPuntos(0);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Guerrero getGuerrero() {
        return guerrero;
    }

    public void setGuerrero(Guerrero guerrero) {
        this.guerrero = guerrero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", dinero=" + dinero + ", puntos=" + puntos + ", guerrero=" + guerrero + '}';
    }
    
    
}
