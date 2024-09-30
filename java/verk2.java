//imports
import java.util.*;
//main

public class verk2 {
  public static void main(String[] args){
    System.out.println("nofn?");
    Scanner test = new Scanner(System.in);

    String j = test.nextLine();
    String[] test2 = j.split(" ");
    System.out.println("nofn eru: ");
    for (String a: test2)
      System.out.println(a);
  }
}
