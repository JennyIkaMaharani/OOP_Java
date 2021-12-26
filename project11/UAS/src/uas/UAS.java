/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author user
 */
public class UAS {

    /**
     * @param args the command line arguments
     */
    String x;
    public void cetak(int x){
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        // TODO code application logic here
      UAS a = new UAS();
      a.cetak("halo");
    
}
}
