public class verk14{
  public static void main(String[] args){
    int staerd = Integer.parseInt(args[0]);
    double[] safn = new double[staerd];
    double medal = Double.parseDouble(args[1]);
    double stadal = Double.parseDouble(args[2]);
    for (int i = 0; i < staerd; i++) {
      safn[i] = StdRandom.gaussian(double medal, double stadal)
    }
  StdOut.println("Haesta talan var: " + StdStats.max(safn));
  StdOut.println("Laegsta talan var: " + StdStats.min(safn));
  }
private static double[] reiknaTidni(double[] tolur, int fjoldibila) {
  double range = Math.ceil(StdStats.max(tolur) - StdStats.min(tolur));
  int bilastaerd = (int) Math.ceil(range / fjoldibila);
  double[] tidnitafla = new double[fjoldibila];
  for (double v : tolur) {
    int bilaIndex = (int) Math.floor((v - StdStats.min(tolur)) / bilastaerd);
    bilaIndex = Math.min(bilaIndex, fjoldibila - 1);
    tidnitafla[bilaIndex]++;
  }
  return tidnitafla; 
}
}
