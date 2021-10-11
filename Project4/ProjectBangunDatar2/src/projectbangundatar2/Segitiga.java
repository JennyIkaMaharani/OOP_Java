/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author user
 */
public class Segitiga {
    
    int hitungLuas(int a, int t){
        int luas = a * t /2;
        return luas;
    }
    double hitungLuas(double a, int t){
        double luas = a * t /2;
        return luas;
    }
    double hitungLuas(int a, double t){
        double luas;
        luas = (a * t /2);
        return luas;
    }
    double hitungLuas(double a, double t){
        double luas = a * t /2;
        return luas;
    }
    double hitungKeliling(int a, int t){
        double sisi = Math.sqrt((Math.pow(a,2)+Math.pow(t, 2)));
        double keliling = (a + sisi + sisi);
        return keliling;
    }
    double hitungKeliling(double a, int t){
        double sisi = Math.sqrt((Math.pow(a,2)+Math.pow(t, 2)));
        double keliling = (a + sisi + sisi);
        return keliling;
    }
    double hitungKeliling(int a, double t){
        double sisi = Math.sqrt((Math.pow(a,2)+Math.pow(t, 2)));
        double keliling = (a + sisi + sisi);
        return keliling;
    }
    double hitungKeliling(double a, double t){
        double sisi = Math.sqrt((Math.pow(a,2)+Math.pow(t, 2)));
        double keliling = (a + sisi + sisi);
        return keliling;
    }
}
