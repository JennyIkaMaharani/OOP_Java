/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author user
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persegi Panjang
        PersegiPanjang a = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang 1 adalah "+a.hitungLuas(10, 5));
        System.out.println("Keliling Persegi Panjang 1 adalah "+a.hitungKeliling(10, 5));
        System.out.println("Luas Persegi Panjang 2 adalah "+a.hitungLuas(3.6, 8));
        System.out.println("Keliling Persegi Panjang 2 adalah "+a.hitungKeliling(3.6, 8));
        System.out.println("Luas Persegi Panjang 3 adalah "+a.hitungLuas(6, 8.3));
        System.out.println("Keliling Persegi Panjang 3 adalah "+a.hitungKeliling(6, 8.3));
        System.out.println("Luas Persegi Panjang 4 adalah "+a.hitungLuas(5.6, 8.8));
        System.out.println("Keliling Persegi Panjang 4 adalah "+a.hitungKeliling(5.6, 8.8));
        
        //Persegi
        Persegi c = new Persegi();
        System.out.println("Luas Persegi 1 adalah " + c.hitungLuas(4.5));
        System.out.println("Keliling Persegi 1 adalah " + c.hitungKeliling(4.5));
        System.out.println("Luas Persegi 2 adalah " + c.hitungLuas(7));
        System.out.println("Keliling Persegi 2 adalah" + c.hitungKeliling(7));
        //Lingkaran
        Lingkaran b = new Lingkaran();
        System.out.println("Luas Lingkaran 1 adalah " + b.hitungLuas(7.4));
        System.out.println("Keliling Lingkaran 1 adalah" + b.hitungKeliling(7.4));
        System.out.println("Luas Lingkaran 2 adalah " + b.hitungLuas(5));
        System.out.println("Keliling Lingkaran 2 adalah" + b.hitungKelilings(5));
        
        //Segitiga
        Segitiga d = new Segitiga();
        System.out.println("Luas segitiga 1 adalah " + d.hitungLuas(8, 10));
        System.out.println("Keliling segitiga 1 adalah " + d.hitungKeliling(8, 10));
        System.out.println("Luas segitiga 2 adalah " + d.hitungLuas(8, 11.5));
        System.out.println("Keliling segitiga 2 adalah " + d.hitungKeliling(8, 11.5));
        System.out.println("Luas segitiga 3 adalah" + d.hitungLuas(12.2, 9));
        System.out.println("Keliling segitiga 3 adalah " + d.hitungKeliling(12.2, 9));
        System.out.println("Luas segitiga 4 adalah " + d.hitungLuas(13.9, 20.7));
        System.out.println("Keliling segitiga 4 adalah " + d.hitungKeliling(13.9, 20.7));
       
    }
    
}
