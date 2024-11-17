import java.util.Arrays;
public class verk12{
  public static void main(String[] args) {
  int[] inntak = {Integer.parseInt(args[0]),Integer.parseInt(args[1])};
  System.out.println(naerTiu(inntak[0],inntak[1]));
  System.out.println(runa(inntak[0],inntak[1]));
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
  public static String runa(int tala1, int tala2) {

    
    if (tala1<tala2) {
     int[] f = new int[tala2-tala1 +1];
     for (int i = 0; i <= tala2-tala1; i++) {
       f[i]=tala1+i;
     }
     return "fallid f inniheldur nu " + Arrays.toString(f);
    } else {
      return"tala 1 er staerri en tala 2";
    }

  }  
  
  
  }

