public class Coordonnees{
  // Les attributs protégés :
  protected long x;
  protected long y;
  // Les setters :
  public void setX(long x){
    this.x = x;
  }
  public void setY(long y){
    this.y = y;
  }
  // Les getters :
  public long getX(){
    return x;
  }
  public long getY(){
    return y;
  }
  // Le constructeur par défaut :
  public Coordonnees(){
  
  }

  public void ajouter(Coordonnees Autre){
    this.x += Autre.x;
    this.y += Autre.y;
  }  
}
