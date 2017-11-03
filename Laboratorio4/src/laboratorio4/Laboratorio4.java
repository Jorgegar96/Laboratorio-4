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

    public static void main(String[] args) {
        String opcion = "";
        while (!opcion.equals("7")) {
            opcion = JOptionPane.showInputDialog("1: Crear Guerreos\n"
                    + "2: "
            );
            switch (opcion) {
                case "1":
                    crearGuerrero();
                    Listar(inventario);
                    break;
            }
        }
    }

    public static void crearGuerrero() {
        String opcion = "";
        while (!opcion.equals("6")) {
            opcion = JOptionPane.showInputDialog("");
            switch (opcion) {
                case "1":
                    crearg(new Magos());
                    break;
            }
        }
    }

    public static void crearg(Guerrero g) {
        g.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del guerrero: "));
        g.setSalud(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la salud del guerrero")));
        g.setCosto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del guerrero")));
        g.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del guerrero")));
        g.setLugarn(JOptionPane.showInputDialog("Ingrese el lugar de nacimiento del guerrero"));
        g.setPoderatk(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el poder de ataque del guerrero")));
        if (g instanceof Magos) {
            crearm(g);
        } else if (g instanceof Elfos) {
            creare(g);
        } else if (g instanceof Arquero) {
            creara(g);
        } else if (g instanceof Dragon) {
            creard(g);
        } else {
            crearb(g);
        }
        inventario.add(g);
    }

    public static void crearm(Guerrero g) {
        ((Magos) (g)).setElemento(JOptionPane.showInputDialog("Ingrese el elemento favorito del mago"));
        ((Magos) (g)).setTipomag("Ingrese el tipo de magia del mago");
    }

    public static void creare(Guerrero g) {
        ((Elfos) (g)).setRango(JOptionPane.showInputDialog("Ingrese el rango militar del elfo"));
        ((Elfos) (g)).setTipoarma(JOptionPane.showInputDialog("Ingrese el tipo de arma del elfo"));
    }

    public static void creara(Guerrero g) {
        ((Arquero) (g)).setMaterialArco(JOptionPane.showInputDialog("Ingrese el material del arco"));
        ((Arquero) (g)).setMaterialArmadura(JOptionPane.showInputDialog("Ingrese el material de la armadura"));
    }

    public static void creard(Guerrero g) {
        ((Dragon) (g)).setRaza(JOptionPane.showInputDialog("Ingrese la raza del dragon"));
        ((Dragon) (g)).setColor(JOptionPane.showInputDialog("Ingrese el color del dragon"));
    }

    public static void crearb(Guerrero g) {
        ((Bruja) (g)).setLugarResidencia(JOptionPane.showInputDialog("Ingrese el lugar de residencia de la bruja"));
        ((Bruja) (g)).setSigloNacimiento(JOptionPane.showInputDialog("Ingrese el siglo de nacimiento de la bruja"));
    }

    public static void Listar(ArrayList<Guerrero> inventario) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i) instanceof Magos) {
                System.out.println(((Magos) (inventario.get(i))).toString());
            } else if (inventario.get(i) instanceof Elfos) {
                System.out.println(((Elfos) (inventario.get(i))).toString());
            } else if (inventario.get(i) instanceof Arquero) {
                System.out.println(((Arquero) (inventario.get(i))).toString());
            } else if (inventario.get(i) instanceof Dragon) {
                System.out.println(((Dragon) (inventario.get(i))).toString());
            } else {
                System.out.println(((Bruja) (inventario.get(i))).toString());
            }
        }
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
