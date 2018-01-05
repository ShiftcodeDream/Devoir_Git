public class Main{

  public static void main(String args[]){
      Coordonnees a = new Coordonnees();
      Coordonnees b = new Coordonnees();
      a.setX(15);
      a.setY(20);
      b.setX(50);
      b.setY(50);
      System.out.println("a = " + a + "\nb = " + b);
      a.ajouter(b);
      System.out.println("a = " + a + "\nb = " + b);
  }
  
  public static void ajouteCoordonnees(Coordonnees gauche, Coordonnees droite){
    gauche.ajouter(droite);
  }
}
