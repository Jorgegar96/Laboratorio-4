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
public class Laboratorio4 {

    static Magos m = new Magos();
    static Elfos e = new Elfos();
    static Dragon g = new Dragon();
    static Bruja b = new Bruja();
    static Arquero a = new Arquero();
    static ArrayList<Jugador> jugadores = new ArrayList();
    static ArrayList<Guerrero> inventario = new ArrayList();
<<<<<<< HEAD

=======
>>>>>>> b3c801eca1ce9d229ba2ae9c3a5adadd53470429
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         << << << < HEAD
        // TODO code application logic here
     == == ==
                =  >>> >>> > 84a865b12812dbbdf297c04b1382499a6b5bb2ac
        
    }

    public void crearg(Guerrero g) {
        g.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del guerrero: "));
        g.setSalud(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la salud del guerrero")));
        g.setCosto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del guerrero")));
        g.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del guerrero")));
        g.setLugarn(JOptionPane.showInputDialog("Ingrese el lugar de nacimiento del guerrero"));
        g.setPoderatk(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el poder de ataque del guerrero")));
    }

    public void crearm(Guerrero g) {
        ((Magos) (g)).setElemento(JOptionPane.showInputDialog("Ingrese el elemento favorito del mago"));
        ((Magos) (g)).setTipomag("Ingrese el tipo de magia del mago");
    }
    public void creare(Guerrero g){
        ((Elfos)(g)).setRango(JOptionPane.showInputDialog("Ingrese el rango militar del elfo"));
        ((Elfos)(g)).setTipoarma(JOptionPane.showInputDialog("Ingrese el tipo de arma del elfo"));
    }
    public void creara(Guerrero g){
        ((Arquero)(g)).set
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void registrarJugador(Jugador jugador){
        jugador.setNombre(JOptionPane.showInputDialog(""
                + "Nombre:"
        ));
        boolean repetir = false;
        do{
            try{
                float dinero = Float.parseFloat(JOptionPane.showInputDialog(""
                        + "Ingrese el Dinero disponible:"
                ));
                repetir = false;
            }catch (Exception e){
                System.out.println("No se ingreso un numero flotante");
                repetir = true;
            }
        }while (repetir);
        elegirGuerrero();
        jugador.setGuerrero(e);
    }
    
    public static void elegirGuerrero(){
        String lista = "Guerreros";
        
    }
    
    public static void listarJugadores(){
        String lista = "Jugadores \n\n";
        for (Jugador jugador : jugadores) {
            lista += jugador + "\n";
        }
    }
    
    public static void evaluarFloat(float valor) throws myException{
        for (int i = 0; i < ; i++) {
            
        }
    } 
}
