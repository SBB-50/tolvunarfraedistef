public class verk5{
  public static void main(String[] args){
  int y = Integer.parseInt(args[0]);
//  System.out.println(y);
  //1

  if (y > 2012 ){
    System.out.println("Kynslod ekki fundin");
  }
  else if (y >= 1997){
    System.out.println("gen Z");
  }
  else if (y >= 1981){
    System.out.println("milennial");
  }
  else if (y >= 1965){
    System.out.println("gen x");
  }
  else if (y >= 1955){
    System.out.println("boomer II");
  }
  else if (y >= 1946){
    System.out.println("boomer I");
  }
  else{
    System.out.println("kynslod ekki fundin");
  }
  //2
  boolean hlaup;
  hlaup = (y % 4 ==0) && (y % 100 != 0);
  hlaup = hlaup || (y % 400 == 0);
  if (hlaup == true){
    System.out.println("arid er hlaupar");
  }
  else{
    System.out.println("arid er ekki hlaupar");
  }

  //3
  double x = -22.2;
  boolean isPositive = (x>0.0);

  if (isPositive) System.out.println(x + " er jakvaed");// ef adeins eitt = er notad breytir thad breytunni frekar en ad lesa hana.
  else System.out.println(x + " er ekki jakvaed");
  
  }
}
