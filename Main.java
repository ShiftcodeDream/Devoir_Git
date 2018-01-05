public class Main{

  public static void main(String args[]){
    long a = 500;
    long b = 150;

    System.out.println("Premier nombre : " + a + "\nSecond nombre : " + b);
    addLong(a, b);    
    System.out.println("Premier nombre : " + a + "\nSecond nombre : " + b);    
  }
  public static void addLong(long gauche, long droite){
    gauche += droite;  
  }
  
  public static void addCaseZero(long[] gauche, long[] droite){
    gauche[0] += droite[0];
  }  
}
