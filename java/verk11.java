
public class verk11{
  public static void main(String[] args){
    int[] rnd = new int[3];
    double[] rnd2 = new double[20];
    double[] rnd3 = new double[20];
    for (int j = 0; j < 3; j++) {
      double p = Math.random()*255; 
      rnd[j] =(int) p; 
      System.out.println(rnd[j]);
    }
    for (int f = 0; f < 20; f++) {
     rnd2[f]=Math.random(); 
     rnd3[f]=Math.random(); 
    }
    StdDraw.setPenRadius(0.05);
    for (int i = 0; i < 10; i++) { 
      StdDraw.setPenColor(rnd[0],rnd[1],rnd[2]);
      StdDraw.line(rnd2[i],rnd3[i],rnd2[i+1],rnd3[i+1]); 
      System.out.println(i);
      try {
         Thread.sleep(500);
      } catch (InterruptedException e) {
      }    
    }
    StdDraw.line(rnd2[10],rnd3[10],0.5,rnd3[1]);
    StdDraw.line(0.5,rnd3[1],0.5,rnd3[0]);
    StdDraw.line(0.5,rnd3[0],rnd2[0],rnd3[0]);
    }
}
