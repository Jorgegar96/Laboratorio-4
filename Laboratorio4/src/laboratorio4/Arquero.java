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
public class Arquero extends Guerrero {

    private String materialArco;
    private String materialArmadura;

    public Arquero() {
    }

    public Arquero(String materialArco, String materialArmadura, String nombre, int edad, String lugarn, int poderatk, int salud, int costo) {
        super(nombre, edad, lugarn, poderatk, salud, costo);
        this.materialArco = materialArco;
        this.materialArmadura = materialArmadura;
    }

    public String getMaterialArco() {
        return materialArco;
    }

    public void setMaterialArco(String materialArco) {
        this.materialArco = materialArco;
    }

    public String getMaterialArmadura() {
        return materialArmadura;
    }

    public void setMaterialArmadura(String materialArmadura) {
        this.materialArmadura = materialArmadura;
    }

    @Override
    public void Ataque(Guerrero atacado) {
        atacado.setSalud(atacado.getSalud() - (getPoderatk()));
        super.setSalud(super.getSalud() + 10);
    }

    @Override
    public String toString() {
        return super.toString() + "Arquero{" + "Material del Arco = " + materialArco + "\nMaterial de la Armadura = " + materialArmadura + "}}";
    }

}
