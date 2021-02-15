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
public class BirdSighting {
    private String especie;
    private Integer avistamientos;
    private Integer dia;

    public BirdSighting(){
        this.especie = "robin";
        this.avistamientos = 1;
        this.dia = 1;
    }

    public BirdSighting(String especie,int avistamientos, int dia ){
        this.setEspecie(especie);
        this.setAvistamientos(avistamientos);
        this.setDia(dia);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getAvistamientos() {
        return avistamientos;
    }

    public void setAvistamientos(Integer avistamientos) {
        this.avistamientos = avistamientos;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }
}
