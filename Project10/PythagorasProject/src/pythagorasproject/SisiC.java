/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author user
 */
public class SisiC {
    SisiC(int a, int b){
        int sisi = (a*a) + (b*b);
        double sisiMiring = Math.sqrt(sisi);
        System.out.println("Sisi miringnya adalah " + sisiMiring);
    }
   SisiC(double a, int b){
        double sisi = (a*a) + (b*b);
        double sisiMiring = Math.sqrt(sisi);
        System.out.println("Sisi miringnya adalah " + sisiMiring);
    }
    SisiC(double a, double b){
        double sisi = (a*a) + (b*b);
        double sisiMiring = Math.sqrt(sisi);
        System.out.println("Sisi miringnya adalah " + sisiMiring);
    }
}
