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
public class HapusData extends Pilihan{
    Scanner input = new Scanner(System.in);
@Override
void lihatPilihan(){
        

        System.out.println("Pilih Sub Menu");
        System.out.println("1. Kembali ke Menu Utama");
        System.out.println("2. Hapus Data Kembali");
        System.out.print("Menu Pilihan: ");
            String pilihan = input.nextLine();
            switch(pilihan){
                case "1":
                   TambahData a = new TambahData();
                   a.menu();
                case "2":
                    ArrayList result = this.proses();
                    ManajemenKaryawan x = new ManajemenKaryawan();
                    x.karyawan.add(result);
                    this.lihatPilihan();
                    
            }
        
    }    

    @Override
    ArrayList proses() {
       ManajemenKaryawan data = new ManajemenKaryawan();
       ArrayList dataKaryawan = data.karyawan;
        System.out.print("Masukkan Kode Karyawan yang ingin dihapus: ");
        String kode = input.nextLine(); 
        dataKaryawan.removeIf(item -> dataKaryawan.get(0) == kode);
        this.lihatPilihan();
        return dataKaryawan;
    }
    }

