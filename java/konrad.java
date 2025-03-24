import java.util.Scanner;
public class konrad{
  public static void main(String [] args){
    //int x1 = t.getTen1Gildi();
    //int x2 = t.getTen2Gildi();
    //System.out.println(x1);
  System.out.println("H til ad hefja, S til ad stoppa umferdina og Q til ad stoppa leikinn.");
  System.out.println(leikur());
  }
public static String leikur(){
  teningatvenna t = new teningatvenna(); 
  Keppandi k2 = new Keppandi(false);
  Keppandi k = new Keppandi(true);
  boolean umferd = true;
  boolean heild = true;
  if(heild == true){
   for (int i = 0; i < 3;) {
    
   
     if (umferd==true){
    for (int p=1; p >= 1;) { 
    if(k.getStigafjoldiUmferd()+k.getHeildarStigafjoldi()>=100){
      heild = false;
      i = 30;
      System.out.println("thu nadir 100 eda fleiri stigum og vannst");
    }else{
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Hvad viltu gera?");
    String test2 = scanner.nextLine();
    //System.out.println(scanner.toString());
    if(test2.equals("H")){
    int test = 1;
    System.out.println(test);
    if(test ==1){  t.kasta();

     int t1 = t.getTen1Gildi();
     int t2 = t.getTen2Gildi();
     if (t1==1 && t2==1){
        k.setHeildarStigafjoldi(0);
        umferd = false;
        p=0;
      }else if(t1==1 || t2==1){
       k.setStigafjoldiUmferd(0);
        umferd = false;
        p=0;
      }else{
        k.setStigafjoldiUmferd(k.getStigafjoldiUmferd()+t.getSamtalsGildi());
        System.out.println("teningur 1 gaf "+ t1+", teningur 2 gaf "+ t2+", saman "+t.getSamtalsGildi());
        System.out.println("umferdarstig eru "+ k.getHeildarStigafjoldi());
      }
      }
    else if(test2.equals("Q")){
      heild=false;
      i = 30;
    }else{
      System.out.println("stigin i umferdini voru "+ k.getStigafjoldiUmferd()+ " sem baetast ofan a "+ k.getHeildarStigafjoldi()+" heildarstig. Ny heildarstig eru "+ k.getHeildarStigafjoldi()+k.getStigafjoldiUmferd());
      k.setHeildarStigafjoldi(k.getHeildarStigafjoldi()+k.getStigafjoldiUmferd());
      k.setStigafjoldiUmferd(0);
      umferd = false;
      p = 0;
    }}

    }}
    if (umferd ==true){
    for (int p = 0;p <=0;) { 
      if(k2.getStigafjoldiUmferd()+k2.getHeildarStigafjoldi()>=100){
        heild = false;
        i = 30;
      System.out.println("tolvan fekk fleiri en 100 stig og vann");
    }else{
    //Scanner scanner = new Scanner("Hvad viltu gera? ");
      if(k2.getStigafjoldiUmferd()<=20){
        t.kasta();

        int t1 = t.getTen1Gildi();
        int t2 = t.getTen2Gildi();
        if (t1==1 && t2==1){
        k2.setHeildarStigafjoldi(0);
        umferd = true;
        p = 1;
      }else if(t1==1 || t2==1){
        k2.setStigafjoldiUmferd(0);
        umferd = true;
        p = 1;
      }else{
        k2.setStigafjoldiUmferd(k2.getStigafjoldiUmferd()+t.getSamtalsGildi());
        System.out.println("teningur 1 gaf "+ t1+", teningur 2 gaf "+ t2+", saman "+t.getSamtalsGildi());

      }
      }else{
      System.out.println("stigin i umferdini voru "+ k2.getStigafjoldiUmferd()+ " sem baetast ofan a "+ k2.getHeildarStigafjoldi()+" heildarstig. Ny heildarstig eru "+ k.getHeildarStigafjoldi()+k.getStigafjoldiUmferd());
      k2.setHeildarStigafjoldi(k2.getHeildarStigafjoldi()+k2.getStigafjoldiUmferd());
      k2.setStigafjoldiUmferd(0);
      umferd = true;
      p = 1;
      }}
  
  }
  }
  }

  }
  }
  return"leik lokid";}
}


