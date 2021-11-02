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
public class Triple {
    int a;
    int b;
    int c;

    Triple(int a, int b, int c) {
        int sisi = (a*a) + (b*b);
        double sisiMiring = Math.sqrt(sisi);
        
        if(sisiMiring == c){
            System.out.println("Ketiga bilangan tersebut merupakan triple pythagoras");
        } else{
            System.out.println("Ketiga bilangan tersebut bukan triple pythagoras");
        }
    }

   
    
    void Triple(){
        int sisi = (a*a) + (b*b);
        double sisiMiring = Math.sqrt(sisi);
        if(sisiMiring == c){
            System.out.println("Ketiga bilangan tersebut merupakan triple pythagoras");
        } else{
            System.out.println("Ketiga bilangan tersebut bukan triple pythagoras");
        }
    }
    void Triple(double a, int b, int c){
        double sisi = (a*a) + (b*b);
        double sisiMiring = Math.sqrt(sisi);
        if(sisiMiring == c){
            System.out.println("Ketiga bilangan tersebut merupakan triple pythagoras");
        } else{
            System.out.println("Ketiga bilangan tersebut bukan triple pythagoras");
        }
    }
    void Triple(double a, double b, int c){
        double sisi = (a*a) + (b*b);
        double sisiMiring = Math.sqrt(sisi);
        if(sisiMiring == c){
            System.out.println("Ketiga bilangan tersebut merupakan triple pythagoras");
        } else{
            System.out.println("Ketiga bilangan tersebut bukan triple pythagoras");
        }
    }
    void Triple(double a, double b, double c){
        double sisi = (a*a) + (b*b);
        double sisiMiring = Math.sqrt(sisi);
        if(sisiMiring == c){
            System.out.println("Ketiga bilangan tersebut merupakan triple pythagoras");
        } else{
            System.out.println("Ketiga bilangan tersebut bukan triple pythagoras");
        }
    }
}
