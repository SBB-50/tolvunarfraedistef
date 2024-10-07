public class verk7{
  public static void main(String[] args){
      
//hluti 1
    for (int i = 10; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
        System.out.print("*");
        }
        System.out.println();
      }
      System.out.println();
      for (int x = 12; x >=1 ; x--) {
      // System.out.println(x);
        for (int p = 1; p < x ; p++) {
        System.out.print(" "); 
        }
        for (int h = 1; h < 12-x ; h++) {
        System.out.print("*");
      }
      System.out.println();
    }
    //hluti 2
    System.out.println("6 hlida teningur:");
    int sex = (int) (Math.random() * 7);
    System.out.println(sex);
    System.out.println();
    System.out.println("tveir teningar:");
    int tveir = (int) (Math.random() *7);
    System.out.println(sex+tveir);
    System.out.println();
    System.out.println("12 hlida teningur:");
    int tolf = (int) (Math.random() * 13);
    System.out.println(tolf);
    System.out.println();
    int teljari = 0;
    for (int n = 0; n < 1000;n++) {
      int thusund = (int)(Math.random()*7);
      //System.out.println(thusund);
      if(thusund == 6 ){
        teljari++;
      }
    }
    System.out.println("teningi var kastad 1000 sinnum og 6 kom upp " + teljari + " sinnum." );
  }
}
