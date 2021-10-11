/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author user
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran l = new Lingkaran();
        Persegi s = new Persegi();
        
        //menghitung total luas bangun kompleks
        double luasTotal = (l.hitungLuas(21)*2) + s.hitungLuas(42);
        
        //menampilkan hasil
        System.out.println("Luas dari bangun nomor 1 adalah "+luasTotal+" cm");
        
        //project 2
        //menghitung luas setengah lingkaran besar
        Lingkaran l2 = new Lingkaran();
        double luasBesar = l2.hitungLuas(14) / 2;
        //menghitung 2 luas setengah lingkaran kecil
        Lingkaran l3 = new Lingkaran();
        double luasKecil = l3.hitungLuas(7);
        //menghitung luas gabungan
        double luas = luasBesar - luasKecil;
        //menampilkan hasil
        System.out.println("Luas bangun nomor 2 adalah "+ luas + " cm");
    }
    
}
