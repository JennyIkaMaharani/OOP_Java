/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author user
 */
public class Ubin {
    int panjang; //panjang ubin
    int lebar; //lebar ubin
    //menghitung luas ubin
    int hitungLuas(){
        //menghitung luas menggunakan class PersegiPanjang
        PersegiPanjang u = new PersegiPanjang();
        
        return u.hitungLuas(this.panjang, this.lebar);
        
    }
}
