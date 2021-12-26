/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;
import java.util.*;
/**
 *
 * @author user
 */
public class ArrayProcessing {
  int [] dataBil = new int [100];
  int n;
    private int maks;
  void input() {
      Scanner input = new Scanner (System.in);
      System.out.print("Masukkan banyaknya data (n) : ");
      this.n = input.nextInt();
      for(int i=0; i<n; i++){
          System.out.print("Masukkan bil ke-"+(i+1)+": ");
          this.dataBil[i] = input.nextInt();
          
      }
  }
  double hitungRerata(int[] data) {
    double sum = 0;
    for(int i=0; i<this.n;i++){
        sum += data[i];
    }
    double rerata = sum/this.n;
    return rerata;
    
  }
  void output(){
      System.out.println("Rerata: " + this.hitungRerata(this.dataBil));
      System.out.println("Nilai maksimal :" + this.cariMax(this.dataBil));
      System.out.println("Nilai minimal :" + this.cariMin(this.dataBil));
      System.out.println(this.urutkan(dataBil));
      
  }
  
  int cariMax(int[] data){
      int x = this.n ;
      int maksimal = this.dataBil[0];
      for(int i=1; i<x;i++){
          int a = this.dataBil[i];
         
          if(maksimal>a){
               maksimal = maksimal;
          } else {
              maksimal = a;
          }
      }
      return maksimal;
  } 
  int cariMin(int[] data){
      int x = this.n;
      int minimal = this.dataBil[0];
      for(int i=1; i<x;i++){
          int a = this.dataBil[i];
          
          if(minimal <a){
               minimal = minimal;
          } else{
              if(a < minimal){
                  minimal = a;
              }
          }
      }
      return minimal;
  }
  
  ArrayList urutkan(int[] data){
      ArrayList A = new ArrayList();
      for (int i = 0; i<this.n; i++){
          for(int j= 0; j<this.n-1; j++){
              int bil1 = data[j];
              int bil2 = data[j+1];
              if (bil1 < bil2){
                  data[j] = bil2;
                  data[j+1] = bil1;
                    
              }
            
          }
          A.add(0, data[i]);
         
      }
      
      return A;
  }
}
