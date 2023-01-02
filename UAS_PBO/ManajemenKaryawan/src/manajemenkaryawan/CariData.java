/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemenkaryawan;

import java.util.*;

/**
 *
 * @author user
 */
public class CariData extends Pilihan{
Scanner input = new Scanner(System.in);
    @Override
    ArrayList proses() {
        ManajemenKaryawan data = new ManajemenKaryawan();
        ArrayList dataKaryawan = data.karyawan;
        System.out.print("Masukkan Kode Karyawan yang ingin dihapus: ");
        String kode = input.nextLine();
        boolean stat = false;
        int ind = -1;
        for (int i=0; i<dataKaryawan.size(); i++){
           ArrayList data1 = (ArrayList) dataKaryawan.get(i);
                
            }
        }

    @Override
    void lihatPilihan() {
        System.out.println("Pilih Sub Menu");
        System.out.println("1. Kembali ke Menu Utama");
        System.out.print("Menu Pilihan: ");
            String pilihan = input.nextLine();
            switch(pilihan){
                case "1":
                   TambahData a = new TambahData();
                   a.menu();

            }
    }
        
    }

    
    

