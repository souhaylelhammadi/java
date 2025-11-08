package tp3;

public class TestEtudiant {
    public static void main(String[] args) {

        // --- Exercice 2 : instanciation et attribution directe ---
        Etudiant etudiantA = new Etudiant();
        Etudiant etudiantB = new Etudiant();
        Etudiant etudiantC = new Etudiant();

        etudiantA.nom = "Alaoui";
        etudiantA.matricule = "12345";
        etudiantA.noteTP = 15.5;
        etudiantA.noteExamen = 16.0;

        etudiantB.nom = "Benali";
        etudiantB.matricule = "67890";
        etudiantB.noteTP = 17.0;
        etudiantB.noteExamen = 14.5;



        etudiantC.nom = "Hassan";
        etudiantC.matricule = "11223";
        etudiantC.noteTP = 14.25;
        etudiantC.noteExamen = 15.0;

        System.out.println("=== Informations des étudiants (attribution directe) ===");
        etudiantA.afficherInfo();
        etudiantB.afficherInfo();
        etudiantC.afficherInfo();

        // --- Exercice 3 : utilisation des constructeurs ---
        Etudiant etudiantD = new Etudiant(); // constructeur vide
        Etudiant etudiantE = new Etudiant("Khalid", "44556"); 
        Etudiant etudiantF = new Etudiant("Sara", "99887", 18.0, 19.5);
        
        System.out.println("\n=== Informations des étudiants (constructeurs) ===");
        etudiantD.afficherInfo(); 
        etudiantE.afficherInfo(); 
        etudiantF.afficherInfo(); 
    }
}
