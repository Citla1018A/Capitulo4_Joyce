/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bread;

/**
 *
 * @author Citlalli
 */
public class Bread {
    private String tipo;
    private Integer calorias;
    
    public Bread(String tipo, Integer calorias){
        this.calorias=calorias;
        this.tipo=tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public Integer getCalorias(){
        return calorias;
    }
    public void setTipo(){
        this.tipo=tipo;
    }
    public void setCalorias(){
        this.calorias=calorias;
    }
    public static final String motto(){
        return "El personal de la vida";
    }
    @Override
    public String toString(){
        return String.format("%s\nEl pan de tipo %s contiene %.2f calorias", motto(),this.getTipo(),this.getCalorias());
    }
}
