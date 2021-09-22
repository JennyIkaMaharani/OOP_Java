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
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    
    public void hitungLuas(){
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah " + luas);
    }
    
    public void hitungKeliling(){
        int keliling = (panjang+lebar) * 2;
        System.out.println("Keliling persegi panjang adalah " + keliling);
    }
}
