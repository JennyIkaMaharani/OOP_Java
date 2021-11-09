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
import java.util.*;
public class Menu {
    Menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit");
        System.out.print("Pilihan Anda: ");
        String pil = input.nextLine();
        switch (pil){
            case "1":
                System.out.println("Masukkan sisi a: ");
                int a = input.nextInt();
                System.out.println("Masukkan sisi b: ");
                int b = input.nextInt();
                System.out.println("Masukkan sisi c: ");
                int c = input.nextInt();
                Triple kasus1 = new Triple(a,b,c);
                break;
            case "2":
                System.out.println("Masukkan sisi a: ");
                int d = input.nextInt();
                System.out.println("Masukkan sisi b: ");
                int e = input.nextInt();
                SisiC kasus2 = new SisiC(d, e);
                break;
            case "3":
                System.out.println("Masukkan sisi Miring: ");
                int m = input.nextInt();
                System.out.println("Masukkan sisi Tegak: ");
                int t = input.nextInt();
                SisiSiku kasus3 = new SisiSiku(m, t);
                break;
            case "4":
                Exit ex = new Exit();
            default:
                System.out.println("Anda belum memilih");
        }
    }
}
