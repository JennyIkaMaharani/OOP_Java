/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

/**
 *
 * @author user
 */
public class Tabung {
    public int jarijari;
    public int tinggi;
    
    public void hitungVol(){
        double vol = 3.14 * tinggi *jarijari *jarijari;
        System.out.println("Volume tabung adalah " + vol);
    }
    public void hitungLuasSelimut(){
        double selimut = 3.14 * 2 *jarijari *tinggi;
        System.out.println("Luas selimut tabung adalah " + selimut);
    }
}
