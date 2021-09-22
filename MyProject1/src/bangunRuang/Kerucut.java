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
public class Kerucut {
    public int jarijari;
    public int tinggi;
    
    public void hitungVol(){
        double vol = (3.14  *jarijari *jarijari *tinggi)/3;
        System.out.println("Volume kerucut adalah " + vol);
    }
    public void hitungLuasSelimut(){
        double apotema = Math.sqrt((jarijari *jarijari) + (tinggi *tinggi));
        double selimut = 3.14 *jarijari *apotema;
        System.out.println("Luas selimut kerucut adalah " + selimut);
    }
}
