public class verk15{
  public static void main(String[] args) {
    int fjoldikasta = Integer.parsein(args[0]);
    double[] passtelja = new double[3];
    double[] donttelja = new double[3];
    double[] wintelja = new double[0];
    int max = 0;
    for (int i = 0; i < fjoldikasta; i++) {
      int p = passbet();
      int d = dontpass();
      int w = 0;
    
      passtelja[p]++;
      donttelja[d]++;
      if(p==1){
        w++;
        if(w>max){
          max = w;
        }
      }else{
        if(w>wintelja.length){
          wintelja = Arrays.copyOf(wintelja,w);
        }
        wintelja[w]++;
        w=0;
      }
    }
    System.out.printf("Pass bet:\n Thu spiladir leikinn "+fjoldikasta+" sinnum. \n Thu vannst i "+passtelja[1]+" skipti\n en tapadir i "+passtelja[0]+" skipti \nVinningshlutfallid er "+passtelja[1]/passtelja[0]+" \n Thu vannst mest "+ max+ " sinnum i rod");
    
  }
  public static int passbet(){
    int p = teningar(6,2);
    if (p==11 || p==7) {
      return true;
    } else if(p == 2||p==3||p==12){
      return false;
    }else{
      for(boolean i=false;i==false){
        int j = teningar(6,2);
        if(j==p;){
          i = true
          return 1;
        } else if(j==7){
          i = true
          return 0;
        }
      }
    } 
  }
  public static int dontpass(){
    int p = teningar(6,2);
    if (p==2 || p==3) {
     return 1;
    } else if(p==7||p==11){
     return 0; 
    }else if(p==12){
      return 2;
    }else{
      for(boolean i=false;i==false){
        int j = teningar(6,2);
        if(j==p;){
          i = true; 
          return 0;
        } else if(j==7){
          i = true
          return 1;
        }
      }
    } 
  } 
  public static int teningar(int fjoldihlida, int fjolditeninga){
    int tening = 0;
    for (int j = 0; j < fjolditeninga; j++) {
      tening = (int) (Math.random()*(fjoldihlida+1));
  }
    return tening;
}
 }
