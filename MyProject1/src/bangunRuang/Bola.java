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
public class Bola {
    public int jarijari;
    
    public void hitungVol(){
        double vol = (3.14 * 4 *jarijari *jarijari *jarijari)/3;
        System.out.println("Volume bola adalah " + vol);
    }
    public void hitungLuasSelimut(){
        double selimut = 3.14 * 4 *jarijari *jarijari;
        System.out.println("Luas selimut bola adalah " + selimut);
    }
}
