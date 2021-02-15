/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4_Joyce;

import Bread.Bread;
import Capitulo4_Joyce.Billing.Billing;
import Capitulo4_Joyce.BirdSighting.BirdSighting;
import Capitulo4_Joyce.BirdSighting.BirdSighting2;
import Capitulo4_Joyce.BloodData.BloodData;
import Capitulo4_Joyce.BloodData.TestBloodData;
import Capitulo4_Joyce.Circle.Circle;
import Capitulo4_Joyce.FormLetterWriter.FormLetterWriter;
import Capitulo4_Joyce.MathTest.MathTest;
import Capitulo4_Joyce.Rental.Rental;
import java.util.GregorianCalendar;

/**
 *
 * @author Citlalli
 */
public class Main {
    public static void main(String[] args) {
     /*   System.out.println("BILLING");
        Billing bill = new Billing();
        System.out.println (bill.computeBill (30.5));
        System.out.println (bill.computeBill (30.5,5));
        System.out.println (bill.computeBill (30.5,5,25));
        System.out.println("BREAD");
        Bread bread = new Bread("Centeno",20);
        System.out.println(""+bread.toString());
        System.out.println("NextMonth");
      //  NextMonth nextMonth = NextMonth();*/
        System.out.println("RENTAL");
        Rental rental = new Rental("hola",20);
        System.out.println(""+rental.setHoursAndMinutes());
        System.out.println("FormLetterWriter");
        FormLetterWriter formLetterWriter  = new FormLetterWriter();
        formLetterWriter.displaySalutation("Citlalli");
        System.out.println("BirdSightin");
        BirdSighting birdSighting = new BirdSighting();
        System.out.println( birdSighting.getEspecie());
        BirdSighting birdSighting2 = new BirdSighting("cotorro",10,18);
        System.out.println(birdSighting2.getEspecie());
        System.out.println(birdSighting2.getAvistamientos());
        System.out.println(birdSighting2.getDia());
        System.out.println("---");
        BirdSighting2 animal = new BirdSighting2("Guacamaya", 5,12);
        System.out.println(animal.getEspecie());
        System.out.println(animal.getAvistamientos());
        System.out.println(animal.getDia());
        System.out.println("BloodData");
        BloodData bloodData = new BloodData();
        System.out.println(bloodData.getTipoDeSangre());
        System.out.println(bloodData.getFactor());
        bloodData.setTipoDeSangre("B");
        bloodData.setFactor('+');
        System.out.println(bloodData.getTipoDeSangre());
        System.out.println(bloodData.getFactor());
        System.out.println("---");
        TestBloodData paciente = new TestBloodData();
        paciente.getSangre();
        System.out.println(paciente.getEdad());
         TestBloodData paciente2 = new  TestBloodData(123,45,"A",'-');
        paciente2.getSangre();
        System.out.println(paciente2.getId());
    System.out.println(paciente2.getEdad());
        System.out.println("Circle");
        Circle circulo = new Circle();
        circulo.setRadio(15.5);
        System.out.println(circulo.area());
        System.out.println("MathTest");
        MathTest mathTest = new MathTest();
        mathTest.a();
        mathTest.b();
        mathTest.c();
        mathTest.d();
        mathTest.e();
        System.out.println("");
        GregorianCalendar gcal = new GregorianCalendar();
        

       

    }
}
