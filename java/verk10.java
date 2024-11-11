public class verk10{
  public static void main(String[] args){
    int summa = Integer.parseInt(args[0]);
    for (int i = 0; i < summa; i++) {
      int tening = (int) ((Math.random()*12)+1);
      StdOut.print(tening); 
    }
  }
}
