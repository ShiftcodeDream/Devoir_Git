public class Main{

  public static void main(String args[]){
    long a = 500;
    long b = 150;
    
    long[] c = new long[1];
    long[] d = new long[1];
    
    c[0] = 1300;
    d[0] = 1500;

    System.out.println("Premier nombre : " + c[0] + "\nSecond nombre : " + d[0]);
    addCaseZero(c, d);    
    System.out.println("Premier nombre : " + c[0] + "\nSecond nombre : " + d[0]);
  }
  public static void addLong(long gauche, long droite){
    gauche += droite;  
  }
  
  public static void addCaseZero(long[] gauche, long[] droite){
    gauche[0] += droite[0];
  }  
}
