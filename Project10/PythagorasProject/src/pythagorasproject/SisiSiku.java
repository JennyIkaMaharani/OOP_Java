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
public class SisiSiku {
    SisiSiku(int c, int b){
        int sisi = (c*c) - (b*b);
        double sisiSiku = Math.sqrt(sisi);
        System.out.println("Sisi siku-sikunya nya adalah " + sisiSiku);
    }
    SisiSiku(double c, int b){
        double sisi = (c*c) - (b*b);
        double sisiSiku = Math.sqrt(sisi);
        System.out.println("Sisi siku-sikunya nya adalah " + sisiSiku);
    }
    SisiSiku(double c, double b){
        double sisi = (c*c) - (b*b);
        double sisiSiku = Math.sqrt(sisi);
        System.out.println("Sisi siku-sikunya nya adalah " + sisiSiku);
    }
}
