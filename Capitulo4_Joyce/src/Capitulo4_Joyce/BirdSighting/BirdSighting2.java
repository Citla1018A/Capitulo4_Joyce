/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4_Joyce.BirdSighting;

/**
 *
 * @author Citlalli
 */
public class BirdSighting2 {
    private String especie;
    private Integer avistamientos;
    private Integer dia;

    public BirdSighting2(String especie,int avistamientos, int dia ){
        this.especie = especie;
        this.avistamientos = avistamientos;
        this.dia = dia;
    }

    public String getEspecie() {
        return especie;
    }

    public Integer getAvistamientos() {
        return avistamientos;
    }

    public Integer getDia() {
        return dia;
    }
}
