import java.util.Scanner;
public class CalculRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez la longueur du rectangle : ");
        double longueur = input.nextDouble();
        
        System.out.print("Entrez la largeur du rectangle : ");
       
        double largeur = input.nextDouble();
        double surface = longueur * largeur;
        double perimetre = 2 * (longueur + largeur);

        System.out.println("\n--- Résultats ---");
        System.out.println("Longueur : " + longueur);
        System.out.println("Largeur  : " + largeur);
        System.out.println("Surface  : " + surface);
        System.out.println("Périmètre: " + perimetre);
    }
}
