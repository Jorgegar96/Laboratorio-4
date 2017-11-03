/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JorgeLuis
 */
public class Partida {
    ArrayList<Movimiento> movimientos = new ArrayList();
    
   private Jugador jugador1;
   private Jugador jugador2;
   boolean turno;
   boolean enJuego;

    public Partida() {
    }

    public Partida(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        enJuego = true;
        turno = true;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
   
    
    public void juego(){
        Jugador enTurno;
        Jugador not;
        String turn;
        String notTurn;
        while (enJuego){
            if (turno){
                enTurno = jugador1;
                not = jugador2;
                turn = "jugador 1";
                notTurn = "Jugador 2";
            }else{
                enTurno = jugador2;
                not = jugador1;
                turn = "jugador 2";
                notTurn = "Jugador 1";
            }
            JOptionPane.showMessageDialog(null, "Ataca " + turn + "!"
                    + "\n" + "Salud de Guerrero: " + enTurno.getGuerrero().getSalud()
                    + "\n" + "Salud de Enemigo : " + not.getGuerrero().getSalud()
            );
            enTurno.getGuerrero().Ataque(not.getGuerrero());
            if (jugador1.getGuerrero().getSalud() == 0){
                enJuego = false;
                JOptionPane.showMessageDialog(null, "Jugador 2 has ganado!"
                        + "\n" + "Salud de Jugador 2: " + enTurno.getGuerrero().getSalud()
                        + "\n" + "Salud de Jugador 1 : " + not.getGuerrero().getSalud());
            }else if (jugador2.getGuerrero().getSalud() == 0){
                JOptionPane.showMessageDialog(null, "Jugador 1 has ganado!"
                        + "\n" + "Salud de Jugador 1 : " + enTurno.getGuerrero().getSalud()
                        + "\n" + "Salud de Jugador 2 : " + not.getGuerrero().getSalud());
            }
            if (turno == true){
                turno = false;
            }else{
                turno = true;
            }
        }
    }
   
}
