/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4_Joyce.Rental;

/**
 *
 * @author Citlalli
 */
public class Rental {
    public static final Integer HORA=60;
    public static final Integer TARIFA=40;
    private String contrato;
    private Integer horas;
    private Integer invitados;
    private Integer precio;
    public Rental(String contrato, Integer horas){
        this.contrato=contrato;
        this.horas=horas;
    }
    public Rental(){
        this.contrato="A000";
        this.horas=0;
    }
    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getInvitados() {
        return invitados;
    }

    public Integer getPrice() {
        return precio;
    }
    public String setHoursAndMinutes (){
        return String.format("Horas de alquiler: %d\nMinutos de alquiler: %d\nPrecio total: %d",this.getHoras()/HORA,this.getHoras()%HORA,(this.getHoras()/HORA)*TARIFA+(this.getHoras()%HORA));
    }
    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

}
