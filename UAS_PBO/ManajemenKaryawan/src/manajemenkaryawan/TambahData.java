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
public class TambahData extends Pilihan{
    
    Scanner input = new Scanner(System.in);
    String pilihan = input.nextLine();
    
    void lihatPilihan(){
        System.out.println("Pilih Sub Menu");
        System.out.println("1. Kembali ke Menu Utama");
        System.out.println("2. Tambah Data Kembali");
        System.out.print("Menu Pilihan: ");
            String pilihan = input.nextLine();
            switch(pilihan){
                case "1":
                   this.menu();
                case "2":
                    ArrayList result = this.proses();
                    ManajemenKaryawan x = new ManajemenKaryawan();
                    x.karyawan.add(result);
                    this.lihatPilihan();
                    
            }
        
    }
     void menu(){
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            System.out.print("Menu Pilihan: ");
            String pilihan = input.nextLine();
            switch(pilihan){
                case "1":
                    ArrayList result = this.proses();
                    ManajemenKaryawan x = new ManajemenKaryawan();
                    x.karyawan.add(result);
                    this.lihatPilihan();
                
                case "2":
                    HapusData hapus = new HapusData();
                    hapus.proses();
                case "3":
                case "4":
                case "5":
                    Exit a = new Exit();
           
            }
    }

    @Override
    ArrayList proses() {
        ArrayList y = new ArrayList();
        System.out.print("Masukkan Kode Karyawan: ");
        String kode = input.nextLine();
        y.add(kode);
        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();
        y.add(nama);
        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();
        y.add(alamat);
        System.out.print("Masukkan Golongan [A,B,C,atau D] : ");
        String gol = input.nextLine();
        y.add(gol);
        System.out.print("Masukkan status 0: belum 1: menikah  : ");
        int status = input.nextInt();
        y.add(gol);
        if (status < 1){
             System.out.print("Masukkan jumlah anak: ");
            int jumlahAnak = input.nextInt();
            y.add(gol);;
        } 
       
        return y;
    }
        

    
}
