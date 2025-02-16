public class verk18{
  public static void main(String[] args){
    //name breytan er lengri thvi ad thad eru bil sem teljast med
    String name = new String("Stefan Borgar Brynjolfsson");
    int nameLength = name.length();
    System.out.println("lengd er "+ nameLength);
    String lastName = name.substring(3,nameLength-3);
    System.out.println("seinustu 3 stafir eru " + lastName);
    char lastChar = name.charAt(nameLength-1);
    System.out.println("seinasti stafur "+ lastChar);
    //sIndex skilar -1 ef ekkert finnst
    int sIndex = name.indexOf('s');
    System.out.println("s kemur fram i seinasta skiptid "+ sIndex+" sinnum");
    String[] splitN = name.split(" ");
    for (int i = 0; i < splitN.length; i++) {
      System.out.println(splitN[i]);
    }
    System.out.println(mystery("test"));
  }
  //forritid skilar strengnum sem settur er inn nema ofugt 
  public static String mystery(String str){
    if(str.length()<=1)
      return str;
    return mystery(str.substring(1))+str.charAt(0);
  }
}
