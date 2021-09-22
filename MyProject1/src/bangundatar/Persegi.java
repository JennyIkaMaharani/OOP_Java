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
public class Persegi {
    public int sisi;
    
    public void hitungLuas(){
        int luas = sisi*sisi;
        System.out.println("Luas Persegi adalah " + luas);
    }
    
    public void hitungKeliling(){
        int keliling = sisi*4;
        System.out.println("Keliling Persegi adalah " + keliling);
    }
}
