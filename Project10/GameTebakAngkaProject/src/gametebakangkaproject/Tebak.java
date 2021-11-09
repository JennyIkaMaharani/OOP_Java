/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tebak {
    void Tebak(){
        Random ran = new Random();
        int x = ran.nextInt(101) + 0;
        System.out.println(x);
        System.out.print("Masukkan tebakan Anda: " );
        Scanner input = new Scanner(System.in);
        int tebak = input.nextInt();
        do {    
            if(tebak > x){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                
            }else{
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            }
            System.out.print("Masukkan tebakan Anda: ");
            tebak = input.nextInt();
            
        } while (tebak != x);
        System.out.println("Yeeee… Bilangan tebakan anda BENAR :) ");
    }
}
