import java.util.Arrays;
public class verk12{
  public static void main(String[] args) {
  int[] inntak = {Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])};
  System.out.println(naerTiu(inntak[0],inntak[1]));
  int[] f = runa(inntak[0],inntak[1]);
  for (int i = 0; i < f.length; i++) {
    System.out.print(f[i]+" "); 
  }
  System.out.println();
  System.out.println(sidastiSami(inntak[0],inntak[1]));
  int[] B = fyllir(inntak);
  for (int j = 0; j < B.length; j++) {
   System.out.print(B[j]+" ");
  }
  System.out.println();
  }
  public static int naerTiu(int tala1, int tala2){
    int[] tala = {tala1, tala2};
    int[] tekk = new int[tala.length];
    for (int i = 0; i < tala.length; i++) {
      if (tala[i]>10) {
        tekk[i] = tala[i] - 10;
      } else{
        tekk[i] = 10 - tala[i];
      }
      //System.out.println(i);
      //System.out.println(tala[i] +" gefur "+ tekk[i]); 
    } 
    if (tekk[0]>tekk[1]) {
      return tala[1];
    }else return tala[0];
    }
  public static int[] runa(int tala1, int tala2) {

    
    if (tala1<tala2) {
     int[] f = new int[tala2-tala1 +1];
     for (int i = 0; i <= tala2-tala1; i++) {
       f[i]=tala1+i;
     }
     return f;
    } else {
      int[] f = {0};
      return f;
    }

  }  
  public static boolean sidastiSami(int tala1, int tala2) {
    if((tala1 % 10)==(tala2%10)){
      return true;
    }else return false;
 } 
  public static int[] fyllir(int[] arr){
    int num1 = arr[0];
    int num2 = arr[2];
    if (num1 >= num2) {
      int[] nums={num1,num1,num1};
      return nums;
     }else{
      int[] nums={num2,num2,num2};
      return nums;
      }
  }  
}

