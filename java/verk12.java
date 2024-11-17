public class verk12{
  public static void main(String[] args) {
  int[] inntak = {Integer.parseInt(args[0]),Integer.parseInt(args[1])};
  System.out.println(naerTiu(inntak[0],inntak[1]));

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
    
  }

