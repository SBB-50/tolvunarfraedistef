import java.lang.*;
import java.util.*;
import java.io.*;

public class verk8 {
  public static void main(String[] args) {
   //1 (smá jank en þetta virkar einhvernveginn)
    int[] slett=new int[50];
    int[] odd=new int[50];
    int[] thre=new int[16];
    int j = 0;
    int p=0;
    int t=0;
    for(int i=1;i<=50;i++){
      slett[i-1]=2*i;
      p=p+slett[i-1];
      }
    for(int i=1;i<=50;i++){
      odd[i-1]=(2*i)-1;
      j=j+odd[i-1];
      }
    
    System.out.println(p);
    //for(int i = 0; i < 50; i++){
     // j = j + 2;
    //  slett = new int[j];
    //System.out.println(slett.length);
     // p = p + slett.length;
   // }
  System.out.println(j);
 // System.out.println(t);
    for(int i=1;i<=16;i++){
      thre[i-1]=3*i;
      t=t+thre[i-1];
      System.out.println(thre[i-1]);
    }
    
    
    //2
    int[] teljarafylki = new int[1000];
    int teljari = 0;
      for (int n = 0; n < 1000;n++) {
        int thusund = (int)(Math.random()*7);
        teljarafylki[n]=thusund;
        //System.out.println(Arrays.toString(teljarafylki));
        //System.out.println(thusund);
        //if(thusund == 6 ){
      
        //teljari++;
      //}
    }
    for (int s = 0; s < 1000 ; s++) {
     if(teljarafylki[s]==6){
       teljari++;
     } 
    }
    System.out.println("teningi var kastad 1000 sinnum og 6 kom upp " + teljari + " sinnum." );

    int[] teljarafylki2 = new int[1000];
    int teljari2 = 0;
      for (int n = 0; n < 1000;n++) {
        int thusund2 = (int)(Math.random()*7);
        int thusund3 = (int)(Math.random()*7);
        teljarafylki2[n]=thusund2+thusund3;
        //System.out.println(Arrays.toString(teljarafylki));
        //System.out.println(thusund);
        //if(thusund == 6 ){
      
        //teljari++;
      //}
    }
    for (int v = 1; v <= 12; v++){
      //System.out.println(v);
     for (int s = 0; s < 1000 ; s++) {
       //System.out.println(s);
       if(teljarafylki2[s]==v){
         teljari2++;
       //  System.out.println(teljari2);
        } 
      }
    System.out.println("tveggjateningasumman "+ v + " kom upp " + teljari2 + " sinnum");
    teljari2=0;
     }




  }
}
