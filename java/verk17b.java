public class verk17b{
  public static void main(String[] args){
    int min = 0;
    int max = 100;
    int p = 1;
    System.out.println("Hugsadu tolu a bilinu 0 til 100");
    for (int i = 0; i <= 100;) {
      if(p==1){
      p = 0;
      System.out.println("er talan "+ (min + (max-min)/2));
      System.out.println("R fyrir rett, L fyrir laegri og H fyrir haerri");
      char input = StdIn.readChar();
      p = 1;
      if(input == 'R'){
        System.out.println("vann a "+i+" giskum");
        i = 101;
      }else if(input == 'L'){
        max = (min+(max-min)/2);
        i++;
        p = 1;
        }else if(input == 'H'){ min = min+(max-min)/2;i++;p=1;}
      
      //System.out.println(input); 
      }
      //p = 1;
    }
  }

}
