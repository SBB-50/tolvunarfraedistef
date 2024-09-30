public class h22stefanbry_skilaverkefni{
  public static void main(String[] args){
    System.out.println("thad eru " + args.length + " nofn gefin. thau eru:");
    for(int i = 0; i < args.length;){
      int j = args.length - i - 1;
      System.out.println(args[j]);
      //System.out.println(j);
      i++;
    }
  }
}

// 3) t = MR bestur
// s = MR bestur
