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
public class BangunRuangMainClass {
    public static void main(String[] args) {
        Bola ball = new Bola();
            ball.jarijari = 10;
            ball.hitungVol();
            ball.hitungLuasSelimut();
        Kerucut ker = new Kerucut();
            ker.jarijari = 10;
            ker.tinggi = 10;
            ker.hitungVol();
            ker.hitungLuasSelimut();
        Tabung tube = new Tabung();
            tube.jarijari = 10;
            tube.tinggi = 10;
            tube.hitungVol();
            tube.hitungLuasSelimut();
    }
}
