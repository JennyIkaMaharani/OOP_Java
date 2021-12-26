/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Menu {
    public String pil;
    Menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit");
        System.out.print("Pilihan Anda: ");
        String pil = input.nextLine();
    }
}
