public class verk4{
  public static void main(String[] args){
  //1
  double upph = Double.parseDouble(args[0]);
  double vext = Double.parseDouble(args[1]);
  double ar = Double.parseDouble(args[2]);
  double i = vext + 1;
  double lokaupph = upph*Math.pow(i, ar);
  System.out.println(lokaupph);
  //2
  int threeInt = 3;
  int fourInt = 4;
  double threeDouble = 3.0;
  double fourDouble = 4.0;
  System.out.println(threeInt / fourInt); //0 vegna thess ad int inniheldur ekki nein brot
  System.out.println(threeInt / fourDouble); //0.75 vegna thess ad double inniheldur brot
  System.out.println(threeDouble / fourInt); //sama gildir
  System.out.println(threeDouble / fourDouble);//sama gildir
  //3
  double x = (double) (3/5); // 0 vegna thess ad double inniheldur ekki svona litlar tolur
  boolean y = (!false && 2<3);// gefur true vegna thess ad !false er ekki false og 2 er minni en 3
  boolean z = (2==2);//gefur true vegna thess ad 2 er samasem 2
  boolean w = (Math.sqrt(2)*Math.sqrt(2)==2);//gefur false vegna thess ad sqrt af 2 er m oendanlega aukastafi og tolva getur ekki geymt tha
  System.out.println(x);
  System.out.println(y);
  System.out.println(z);
  System.out.println(w);
  //4
  double F = 50;
  double div = 5.0/9.0;
  double C = (F-32)*div; //verdur 0 vegna thess ad 5/9 deilist sem int en 5.0/9.0 leysir vandamalid
  //System.out.println(div);
  System.out.println(F + "i farenheit er " + C + " i celsius gradum");
  //5
  double a = 3.0;
  double b = Math.pow(a, 2);//tharf ad vera int til ad nota ^
  System.out.println(b);
  }
}
