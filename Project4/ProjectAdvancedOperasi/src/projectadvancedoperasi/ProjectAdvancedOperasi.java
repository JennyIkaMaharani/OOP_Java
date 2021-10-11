/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author user
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi a = new Operasi();
        System.out.println("Hasil 3 + 5 = " + a.jumlahkan(3,4));
        System.out.println("Hasil 4+7+(-9) = " + a.jumlahkan(4,7, -9));
        System.out.println("Hasil 3.4+(-0.002)+0.12313 = " + a.jumlahkan(3.4, -0.002, 0.12313));
        System.out.println(a.kalikan(0.2,9, 7));
        System.out.println(a.kalikan(9, 9));
    }
    
}
