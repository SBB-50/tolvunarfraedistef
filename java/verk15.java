import java.util.Arrays;
public class verk15{
  public static void main(String[] args) {
    int fjoldikasta = Integer.parseInt(args[0]);
    double[] passtelja = new double[3];
    double[] donttelja = new double[3];
    double[] wintelja = new double[0];
    int max = 0;
    int w = 0;
    for (int i = 0; i < fjoldikasta; i++) {
      int p = passbet();
      int d = dontpass();
      System.out.println(d); 
      passtelja[p]++;
      donttelja[d]++;
      if(p>0){
        w=w+1;
       // System.out.println(w);
        if(w>max){
          max = w;
        }
      }else if(p==0){
        if(w>wintelja.length){
          wintelja = Arrays.copyOf(wintelja,w);
        }
        if(w>0){
          //System.out.println(max);
          wintelja[w-1]++;
          w=0;
        }
      }
    }
    System.out.printf("Pass bet:\n Thu spiladir leikinn "+fjoldikasta+" sinnum. \n Thu vannst i "+passtelja[1]+" skipti\n en tapadir i "+passtelja[0]+" skipti \nVinningshlutfallid er "+passtelja[1]/passtelja[0]+" \n Thu vannst mest "+ max+ " sinnum i rod");
    
    System.out.println();
    System.out.println("Dont pass bet:");
    System.out.println("Thu spiladir leikinn "+ fjoldikasta+ " sinnum");
    System.out.println("Thu vannst i "+ donttelja[1]+" skipti");
    System.out.println("en tapadir i "+ donttelja[0]+" skipti");
    System.out.println("Thu fekkst peninginn til baka i "+donttelja[2]+" skipti");
    System.out.println("Vinningshlutfallid er "+donttelja[1]/donttelja[0]);
    System.out.println(wintelja[5]);
    StdStats.plotBars(wintelja);
  }
  public static int passbet(){
    int p = teningar(6,2);
    if (p==11 || p==7) {
      return 1;
    } else if(p == 2||p==3||p==12){
      return 0;
    }else{
      for(boolean i=false;i==false;){
        int j = teningar(6,2);
        if(j==p){
          i = true;
          return 1;
        }else if(j==7){
          i = true;
          return 0;
        }
      }
    } 
  return 0;
  }
  public static int dontpass(){
    int p = teningar(6,2);
  //  System.out.println(p);
    if (p==2 || p==3) {
     return 1;
    } else if(p==7||p==11){
     return 0; 
    }else if(p==12){
      return 2;
    }else{
      for(boolean i=false;i==false;){
        int j = teningar(6,2);
        if(j==p){
          i = true; 
          return 0;
        } else if(j==7){
          i = true;
          return 1;
        }
      }
      return 2;
    } 
  } 
  public static int teningar(int fjoldihlida, int fjolditeninga){
    int tening = 0;
    int count = 0;
    for (int j = 0; j < fjolditeninga; j++) {
      tening = (int) (Math.random()*(fjoldihlida+1));
      count = count+tening;
    //  System.out.println(count);
  }
    return count;
}
 }
