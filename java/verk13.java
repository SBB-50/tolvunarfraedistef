public class verk13{
public static void main(String[] args){
  hluti1();
  int[] hlidar = hluti2(1000);
  for (int i = 0; i < hlidar.length; i++) {
   System.out.println("hlid " + (i+1) + "kom upp " + hlidar[i] +"sinnum");
  }
  int[] summur = hluti3(1000);
  for (int i = 0; i < hlidar.length; i++) {
   System.out.println("hlid " + (i+1) + "kom upp " + hlidar[i] +"sinnum");
  }

}
public static void hluti1() {
  //hluti 1
  System.out.println("1 teningur: "+ kastatening(6));
  System.out.println("2 teningar: "+ teningar(6,2));
  System.out.println("12 hlida: "+ kastatening(12));
}
public static int kastatening(int fjoldihlida){
 int tening = (int) (Math.random()*(fjoldihlida+1));
 return tening;
}
public static int teningar(int fjoldihlida, int fjolditeninga){
  int tening = 0;
  for (int j = 0; j < fjolditeninga; j++) {
    tening = (int) (Math.random()*(fjoldihlida+1));
  }
  return tening;
}
public static int[]hluti2(int fjoldikasta){
    
    int[] geymsla = new int[fjoldikasta];
    int[] teljarafylki2 = new int[1000];
    int teljari2 = 0;
      for (int n = 0; n < 1000;n++) {
        int thusund2 = (int)(Math.random()*13); 
        teljarafylki2[n]=thusund2;
        //System.out.println(Arrays.toString(teljarafylki));
        //System.out.println(thusund);
        //if(thusund == 6 ){
      
        //teljari++;
      //}
    }
    for (int v = 1; v <= 12; v++){
      //System.out.println(v);
     for (int s = 0; s < fjoldikasta ; s++) {
       //System.out.println(s);
       if(teljarafylki2[s]==v){
         teljari2++;
       //  System.out.println(teljari2);
        } 
      }
    geymsla[v] = teljari2;
    teljari2=0;
     }

}
public static int[]hluti3(int fjoldikasta){
    
    int[] geymsla = new int[fjoldikasta];
    int[] teljarafylki2 = new int[1000];
    int teljari2 = 0;
      for (int n = 0; n < 1000;n++) {
        int thusund2 = (int)(Math.random()*7);
        int thusund3 = (int)(Math.random()*7);
        teljarafylki2[n]=thusund2+thusund3;
        //System.out.println(Arrays.toString(teljarafylki));
        //System.out.println(thusund);
        //if(thusund == 6 ){
      
        //teljari++;
      //}
    }
    for (int v = 1; v <= 12; v++){
      //System.out.println(v);
     for (int s = 0; s < fjoldikasta ; s++) {
       //System.out.println(s);
       if(teljarafylki2[s]==v){
         teljari2++;
       //  System.out.println(teljari2);
        } 
      }
    geymsla[v] = teljari2;
    teljari2=0;
     }

}
}
