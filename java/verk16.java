public class verk16{
  public static void main(String[] args){
    int[] f = {1,2,3,4,5,6};
  System.out.println(summA(f,3));
  System.out.println(summF(3));
  System.out.println(summS(6));
  System.out.println(thrirVeldi(3));
  for (int i=0;i<6;i++)
  {
    for (int j=0;j<=i;j++)
    System.out.print(pascal(i,j)+"\t");
    System.out.println();
  }
  }
  //ekki endurkvaemt en virkar
  //public static int summA(int n, int[] A){
  //  int teljari = 0;
  //  for (int i = 0; i < n; i++) {
  //    teljari = teljari+A[i]; 
  //  }
  //  return teljari;
  //}
  public static int summA(int[] A, int n){
    if(n==0){
      return A[0];
    }else{
      return A[n]+summA(A, n-1);
    }
  }
  public static int summF(int n){
    if(n==1){
      return 1;
    }else{
      return (n*n)+summF(n-1);
    }
  }
  public static int summS(int n){
    if(n%2==0){
      if(n==0){
        return 0;
      }else{
        return n+summS(n-2);
      }
    }else{
      return 0;
    }
  }
  public static int thrirVeldi(int n){
    if(n>0){
      if(n==1){
        return 3;
      }else{
        return thrirVeldi(n-1)*3;
      }
    }else{
      return 0;
    }
  }
  public static int pascal(int m,int n){
    if(n==m||n==0){return 1;}
    return pascal(m-1,n-1)+pascal(m-1,n);
  }
}
