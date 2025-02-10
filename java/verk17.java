public class verk17{
public static void main(String[] args) {
  int[] arr = {2, 3, 4, 10, 40};
  int talan = Integer.parseInt(args[0]);
  int saeti = binarySearch(arr, 0, arr.length - 1, talan);
  if (saeti != -1) {
    System.out.println("Talan fannst sem stak númer " + (saeti + 1));
  } else {
  System.out.println("Talan fannst ekki");
  }
}
public static int linearSearch(int[] arr, int lengd,int talan){
  if(arr[lengd]==talan){
    return lengd;
  }else if(lengd != 0){
    return linearSearch(arr,lengd-1,talan);
  }else{
    return -1;
  }
}
public static int binarySearch(int[] arr, int z, int lengd, int talan){
  if(lengd >= z){
    int m = z + (lengd - z) / 2;
    if(arr[m]==talan)
      return m;
    if(arr[m]>talan)
      return binarySearch(arr,z, m-1,talan);
    return binarySearch(arr,m+1,lengd,talan);
  }
  return -1;
}
}
