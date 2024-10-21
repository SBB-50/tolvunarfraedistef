public class verk9 {
  public static void main(String[] args){
    int[] fylki=new int[10];
    int fimttelja = 0;
    for (int i = 0; i < 10; i++) {
    int fyllir =(int) (Math.random()*10);
    //System.out.println(fyllir);
    fylki[i] = fyllir*10;
    if (fylki[i]==50) {
      fimttelja++;
    }
    }

    for (int e = 0; e < fylki.length; e++) {
     System.out.println(fylki[e]); 
    }
    for (int e = 0; e < fylki.length; e++) {
     System.out.println(fylki[fylki.length-e-1]); 
    }
    System.out.println("50 kom up "+ fimttelja + " sinnum");
    for (int e = 0; e < fylki.length; e++) {
      if (fylki[e]==50) {
        fylki[e] = 200;
        System.out.println(fylki[e]); 
      }else{
        System.out.println(fylki[e]);
      }
    }
    
    //b
    boolean[] boolfylk = new boolean[10];
    int booltelja = 0;
    for (int i = 0; i < 10; i++) {
      int teljari =(int) (Math.random()*2);
      if (teljari==1) {
       boolfylk[i] = true;
       System.out.println(boolfylk[i]);
       booltelja++;
      } else {
        boolfylk[i] = false;
        System.out.println(boolfylk[i]);
      }
      }
    System.out.println("true kemur upp "+ booltelja + " sinnum");
    for (int i = 0; i < boolfylk.length; i++) {
      if (boolfylk[i]==true) {
        boolfylk[i]=false;
        System.out.println(boolfylk[i]);
      } else if(boolfylk[i]==false) {
        boolfylk[i]=true;
        System.out.println(boolfylk[i]);
      } 
    }
  }



  }


