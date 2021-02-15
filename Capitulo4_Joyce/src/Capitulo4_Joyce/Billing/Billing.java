/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4_Joyce.Billing;

/**
 *
 * @author Citlalli
 */
public class Billing {
     public Billing(){
        
    }
    public Double computeBill(Double precio){
        return precio+(precio*0.08);
    }
    public Double computeBill(Double precio,Integer order){
        return (precio*order)+(precio*order*0.08);
    }
    public Double computeBill(Double precio,Integer order,Integer cupon){
        return ((precio*order)-((precio*order)*(cupon*0.010)))+(((precio*order)-((precio*order)*(cupon*0.010)))*0.08);
    }
}
