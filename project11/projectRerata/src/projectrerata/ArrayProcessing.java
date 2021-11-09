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
  }
  
  int cariMax(int[] data){
      int x = this.n -1;
      int maksimal = 0;
      for(int i=0; i<x;i++){
          int a = this.dataBil[i];
          int b = this.dataBil[i+1];
         
          if(b>a){
               maksimal = b;
          } else {
              maksimal = a;
          }
      }
      return maksimal;
  } 
  int cariMin(int[] data){
      int x = this.n -1;
      int minimal = 9999;
      for(int i=0; i<x;i++){
          int a = this.dataBil[i];
          int b = this.dataBil[i+1];
          
          if(b<a){
               minimal = b;
          } else{
              if(a < b){
                  minimal = a;
              }
          }
      }
      return minimal;
  }
}
