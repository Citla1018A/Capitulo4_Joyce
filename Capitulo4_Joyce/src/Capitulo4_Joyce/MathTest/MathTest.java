/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4_Joyce.MathTest;

import java.util.Random;

/**
 *
 * @author Citlalli
 */
public class MathTest {
     public void a(){
        System.out.println(Math.sqrt(37));
    }

    public void b(){
        System.out.println(Math.sin(300));
        System.out.println(Math.cos(300));
    }

    public void c(){
        System.out.println(Math.floor(22.8));
        System.out.println(Math.ceil(22.8));
        System.out.println(Math.round(22.8));
    }

    public void d(){
        System.out.println(Math.max('D',71));
    }

    Random rand = new Random();
    public void e(){
        System.out.println(rand.nextInt(20));
    }
}
