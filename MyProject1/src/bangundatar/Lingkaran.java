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
public class Lingkaran {
    public int jariJari;
    
    public void hitungLuas(){
        double luas = 3.14 *jariJari * jariJari;
        System.out.println("Luas Lingkaran adalah "+ luas);
    }
    public void hitungKeliling(){
        double keliling = 3.14 *jariJari * 2;
        System.out.println("Keliling Lingkaran adalah "+ keliling);
    }
}
