/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4_Joyce.BloodData;

/**
 *
 * @author Citlalli
 */
public class BloodData {
    private String tipoDeSangre;
    private char factor;

    public BloodData(){
        this.setTipoDeSangre("O");
        this.setFactor('+');
    }

    public BloodData(String sangre, char factor){
        this.setTipoDeSangre(sangre);
        this.setFactor(factor);
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public char getFactor() {
        return factor;
    }

    public void setFactor(char factor) {
        this.factor = factor;
    }
}
