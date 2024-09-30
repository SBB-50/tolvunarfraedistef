
public class verk6 {
  public static void main(String[] args){
  int i = Integer.parseInt(args[0]);
  //System.out.println(i);
  int h = 0;
  for(int j = 1;j <= i; j++){
    h = h + j;
  }
  System.out.println(h);
  for(int l = 0;l <= i; l++){
    System.out.println("i odru veldi er talan "+l+" "+l*l);
    }
  for(int r = 0; r<=i;r++){
    System.out.println(i-r);
  }
  //int p = 0; ma ekki vera vegna thess ad thad er int p = 0 i for lykkjunni
  for(int p = 0; p<10;p++){
    System.out.println(p+" ");
  }
  }
}
