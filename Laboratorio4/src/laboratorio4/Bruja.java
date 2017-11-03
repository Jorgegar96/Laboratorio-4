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
public class Bruja extends Guerrero {

    private String sigloNacimiento;
    private String lugarResidencia;

    public Bruja() {
    }

    public Bruja(String sigloNacimiento, String lugarResidencia, String nombre, int edad, String lugarn, int poderatk, int salud, int costo) {
        super(nombre, edad, lugarn, poderatk, salud, costo);
        this.sigloNacimiento = sigloNacimiento;
        this.lugarResidencia = lugarResidencia;
    }

    public String getSigloNacimiento() {
        return sigloNacimiento;
    }

    public void setSigloNacimiento(String sigloNacimiento) {
        this.sigloNacimiento = sigloNacimiento;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    @Override
    public void Ataque(Guerrero atacado) {
        atacado.setSalud(atacado.getSalud() - (atacado.getPoderatk()));
        atacado.setPoderatk(atacado.getPoderatk() + 50);
    }

    @Override
    public String toString() {
        return super.toString() + "Bruja{" + "Siglo de Nacimiento = " + sigloNacimiento + "\nLugar de Residencia = " + lugarResidencia + "}}\n\n";
    }

}
