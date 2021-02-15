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
public class TestBloodData {
    private Integer id;
    private Integer edad;
    private BloodData sangre;

    public TestBloodData(){
        this.id = 0;
        this.edad = 0;
        this.sangre = new BloodData("O",'+');
    }

    public TestBloodData(Integer id, Integer edad, String sangre, char factor) {
        this.id = id;
        this.edad = edad;
        this.sangre = new BloodData(sangre,factor);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void getSangre() {
        System.out.println(sangre.getTipoDeSangre() + sangre.getFactor());
    }

    public void setSangre(BloodData sangre) {
        this.sangre = sangre;
    }
}
