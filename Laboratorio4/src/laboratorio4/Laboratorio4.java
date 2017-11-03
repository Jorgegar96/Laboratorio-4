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
    static ArrayList<Partida> partidas = new ArrayList();
    static Movimiento mov = new Movimiento();

    public static void main(String[] args) {
        String opcion = "";
        while (!opcion.equals("8")) {
            opcion = JOptionPane.showInputDialog("1: Crear Guerreos\n"
                    + "2: Eliminar Guerreros\n"
                    + "3: Registro de Jugadores\n"
                    + "4: Iniciar Partida\n"
                    + "5: Listar Jugadores\n"
                    + "6: Listar Guerreros\n"
                    + "7: Cargar partida\n"
                    + "8: Salir"
            );
            switch (opcion) {
                case "1":
                    crearGuerrero();
                    break;
                case "2":
                    Listar(inventario);
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del guerreo a eliminar"));
                    inventario.remove(pos);
                    break;
                case "6":
                    Listar(inventario);

                    break;

                case "3":
                    registrarJugador(new Jugador());
                    break;
                case "5":
                    listarJugadores();

                    break;
                case "7":
                    listarpart();
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la partida que quiere cargar"));
                    listamov(pos);
                    int posa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el movimiento de la partida al cual quiere regresar"));
                    mov.setJugador1(partidas.get(pos).movimientos.get(posa).getJugador1());
                    mov.setJugador2(partidas.get(pos).movimientos.get(posa).getJugador2());
                    mov.setTurno(partidas.get(pos).movimientos.get(posa).isTurno());
                    partidas.get(pos).juego();
                    break;
            }
        }
    }

    public static void crearGuerrero() {
        String opcion = "";
        while (!opcion.equals("6")) {
            opcion = JOptionPane.showInputDialog("1: Mago\n"
                    + "2: Elfo\n"
                    + "3: Arquero\n"
                    + "4: Dragon\n"
                    + "5: Bruja\n"
                    + "6: Salir");
            switch (opcion) {
                case "1":
                    crearg(new Magos());
                    break;
                case "2":
                    crearg(new Elfos());
                    break;
                case "3":
                    crearg(new Arquero());
                    break;
                case "4":
                    crearg(new Dragon());
                    break;
                case "5":
                    crearb(new Bruja());
                    break;
                default:
            }
        }
    }

    public static void crearg(Guerrero g) {
        boolean rep = true;
        g.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del guerrero: "));
        while (rep) {
            try {
                int salud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la salud del guerrero"));
                conds(salud);
                g.setSalud(salud);
                rep = false;
            } catch (myException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                rep = true;
            }
        }
        rep = true;
        while (rep) {
            try {
                int costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del guerrero"));
                condc(costo);
                g.setCosto(costo);
                rep = false;
            } catch (myException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                rep = true;
            }
        }

        g.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del guerrero")));
        g.setLugarn(JOptionPane.showInputDialog("Ingrese el lugar de nacimiento del guerrero"));
        boolean repetir = true;
        while (repetir) {
            try {
                int poder = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el poder de ataque del guerrero"));
                condp(poder);
                g.setPoderatk(poder);
                repetir = false;
            } catch (myException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                repetir = true;
            }
        }
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
        ((Magos) (g)).setTipomag(JOptionPane.showInputDialog("Ingrese el tipo de magia"));
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
            System.out.print((i + 1) + ") ");
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

    public static void condp(int poder) throws myException {
        if (poder <= 50 && poder > 0) {
        } else {
            throw new myException("El poder debe estar entre 0 y 50");
        }
    }

    public static void conds(int salud) throws myException {
        if (salud <= 200 && salud >= 100) {
        } else {
            throw new myException("La salud tiene que estar entre 100 y 200");
        }
    }

    public static void condc(int costo) throws myException {
        if (costo <= 300 && costo > 0) {
        } else {
            throw new myException("El costo del guerrero debe estar entre 0 y 300");
        }
    }

    public static void registrarJugador(Jugador jugador) {
        jugador.setNombre(JOptionPane.showInputDialog(""
                + "Nombre:"
        ));
        boolean repetir = false;
        do {
            try {
                float dinero = Float.parseFloat(JOptionPane.showInputDialog(""
                        + "Ingrese el Dinero disponible:"
                ));
                jugador.setDinero(dinero);
                repetir = false;
            } catch (Exception e) {
                System.out.println("No se ingreso un numero flotante");
                repetir = true;
            }
        } while (repetir);
        elegirGuerrero(jugador);
        jugadores.add(jugador);
    }

    public static void elegirGuerrero(Jugador jugador) {
        String lista = "Guerreros\n\n";
        Listar(inventario);
        String opcion = "";
        boolean existe = false;
        while (!existe) {
            try {
                opcion = JOptionPane.showInputDialog("Posicion del guerrero");
                int pos = Integer.parseInt(opcion);
                try {
                    jugador.setGuerrero(inventario.get(pos - 1));
                    inventario.remove(pos - 1);
                    existe = true;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("El guerrero no existe");
                    existe = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de numero incorrecto");
                existe = false;
            }

        }
    }

    public static void listarJugadores() {
        String lista = "Jugadores \n\n";
        for (Jugador jugador : jugadores) {
            lista += jugador + "\n\n";
        }
        System.out.println(lista);
    }

    public static void listarpart() {
        for (int i = 0; i < partidas.size(); i++) {
            JOptionPane.showMessageDialog(null, "Lista de partidas:\n"
                    + i + " " + partidas.get(i).toString() + "\n");
        }
    }

    public static void listamov(int pos) {
        for (int i = 0; i < partidas.get(pos).movimientos.size(); i++) {
            JOptionPane.showInputDialog("Lista de movimientos de la partida:\n"
                    + partidas.get(pos).movimientos.get(i).toString() + "\n");
        }
    }
}
