import java.util.*;

public class verk3{
  public static void main(String[] args){
    int x1 = Integer.parseInt(args[0]);
    int y1 = Integer.parseInt(args[1]);
    int x2 = Integer.parseInt(args[2]);
    int y2 = Integer.parseInt(args[3]);
    System.out.println("Gefin eru hnitin: (" + x1 + ", "  + y1+ ") og (" + x2 + ", " + y2 + ")");
    //intok stadfest

    System.out.println("Hnit C eru: (" + x1 +", "+ y2 +") eda ("+ x2 +", "+ y1+")");
    //hnit c gefin
    // hnit c eru x1, y2
    int skam1 = Math.abs(y2 - y1);
    int skam2 = Math.abs(x2 - x1);
    System.out.println("skammhlidalengdir eru " + skam1 +" og "+ skam2  );
    //int skam1 = Math.sqrt(((x2-x1)^2)+((y2-y1)^2));
    double lang = Math.sqrt(skam1*skam1 + skam2*skam2);
    System.out.println("langhlidalengdin er "+ lang);
    //lengdir komnar

    double s = skam1 + skam2 + lang;
    s = s/2;
    double a = s - skam1;
    double b = s - skam2;
    double c = s - lang;
    double flatm = Math.sqrt(s*a*b*c);
    System.out.println("flatarmalid er: "+ flatm);
    

 
  }
}
