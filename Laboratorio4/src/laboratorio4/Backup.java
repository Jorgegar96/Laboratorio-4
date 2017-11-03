/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

import javax.swing.JOptionPane;
import static laboratorio4.Laboratorio4.e;

/**
 *
 * @author JorgeLuis
 */
public class Backup {
    
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
    
    public static void evaluarFloat(float valor) throws myException{
        for (int i = 0; i < ; i++) {
            
        }
    } 