package tp3;
public class Etudiant {
    // Attributs
    String nom;
    String matricule;
    double noteTP;
    double noteExamen;

    public Etudiant() {
      
    }

    // Constructeur avec nom et matricule
    public Etudiant(String nom, String matricule) {
        this.nom = nom;
        this.matricule = matricule;
    }

    // Constructeur avec tous les attributs
    public Etudiant(String nom, String matricule, double noteTP, double noteExamen) {
        this.nom = nom;
        this.matricule = matricule;
        this.noteTP = noteTP;
        this.noteExamen = noteExamen;
    }

    // Méthode pour afficher les infos formatées
    public void afficherInfo() {
        System.out.println("Nom : " + nom +
                           " | Matricule : " + matricule +
                           " | Note TP : " + noteTP +
                           " | Note Examen : " + noteExamen);
    }
}
