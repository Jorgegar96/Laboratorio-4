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
public class Movimiento {

    public Jugador jugador1 = new Jugador();
    public Jugador jugador2 = new Jugador();
    public boolean turno;

    public Movimiento() {
    }

    public Movimiento(Jugador jugador1, Jugador jugador2, boolean turno) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.turno = turno;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "Jugador1 = " + jugador1 + "\nJugador2 = " + jugador2 + "\nTurno = " + turno + "\n";
    }

}
