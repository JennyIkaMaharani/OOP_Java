/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.*;
/**
 *
 * @author user
 */

public class Processing {
    Menu a = new Menu();
    public String pil = a.pil;
    ArrayList data = new ArrayList();
    Processing(){
        Scanner input = new Scanner(System.in);
        switch (pil){
            case "1":
                System.out.println("Masukkan data string: ");
                String inputData1 = input.nextLine();
                data.add(inputData1);
                System.out.println("Daftar string dalam array list: " + data);
                break;
            case "2":
                System.out.println("String yang mau dicari: ");
                String inputData2 = input.nextLine();
                int b = data.indexOf(inputData2);
                System.out.println("String " + inputData2 + "ada di index ke-" + b + "di dalam data");
                break;
            case "3":
                System.out.println("Masukkan sisi Miring: ");
                int m = input.nextInt();
                System.out.println("Masukkan sisi Tegak: ");
                int t = input.nextInt();
                SisiSiku kasus3 = new SisiSiku(m, t);
                break;
            case "4":
                Exit ex = new Exit();
            default:
                System.out.println("Anda belum memilih");
        }
    }
    }
}
