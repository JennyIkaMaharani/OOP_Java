/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author user
 */
public class BangunDatarMain {
    public static void main(String[] args) {
        PersegiPanjang a = new PersegiPanjang();
            a.panjang = 25;
            a.lebar =38;
            a.hitungLuas();
            a.hitungKeliling();
        Persegi A = new Persegi();
            A.sisi = 10;
            A.hitungLuas();
            A.hitungKeliling();
        Persegi B = new Persegi();
            B.sisi = 15;
            B.hitungLuas();
            B.hitungKeliling();
        Lingkaran x = new Lingkaran();
            x.jariJari = 25;
            x.hitungLuas();
            x.hitungKeliling();
        Lingkaran y = new Lingkaran();
            y.jariJari = 37;
            y.hitungLuas();
            y.hitungKeliling();
    }
}
