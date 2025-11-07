public class Testconstru {
     public static class Livre {
    String titre;
    String auteur;
    int anneePublication;
    double prix;

    public Livre(String titre, String auteur, int anneePublication, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.prix = prix;
    }
    public Livre (String titre, String auteur){
        this.titre=titre;
        this.auteur=auteur;
        this.anneePublication=0;
        this.prix=0.0;
    }
    public Livre(){
      this.titre="Inconnu";
      this.auteur="Inconnu";
      this.anneePublication=0;
      this.prix=0.0;
    }


    
  }
  public static void main(String[] args) {
    Livre livre1 = new Livre("1984", "George Orwell", 1949,   15.99);
    Livre livre2 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");
    Livre livre3 = new Livre();
    
    System.out.println("Livre 1: " + livre1.titre + ", " + livre1.auteur + ", " + livre1.anneePublication + ", " + livre1.prix);
    System.out.println("Livre 2: " + livre2.titre + ", " + livre2.auteur + ", " + livre2.anneePublication + ", " + livre2.prix);
    System.out.println("Livre 3: " + livre3.titre + ", " + livre3.auteur + ", " + livre3.anneePublication + ", " + livre3.prix);
    

  }

}
