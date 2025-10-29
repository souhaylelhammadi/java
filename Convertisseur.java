import java.util.Scanner;
public class Convertisseur  {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n*** Convertisseur d’Unités ***");
            System.out.println("1. Convertir des Kilogrammes en Livres");
            System.out.println("2. Convertir des Kilomètres en Miles");
            System.out.println("3. Convertir des Celsius en Fahrenheit");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            
            choix = input.nextInt();

            if (choix == 0) {
                System.out.println("Merci et au revoir !");
                break;
            }

            System.out.print("Entrez la valeur à convertir : ");
            double valeur = input.nextDouble();
            double resultat;

            switch (choix) {
                case 1:
                    resultat = valeur * 2.2046;
                    System.out.println(valeur + " kilogrammes = " + resultat + " livres");
                    break;
                case 2:
                    resultat = valeur * 0.62137;
                    System.out.println(valeur + " kilomètres = " + resultat + " miles");
                    break;
                case 3:
                    resultat = (valeur * 1.8) + 32;
                    System.out.println(valeur + " °C = " + resultat + " °F");
                    break;
                default:
                    System.out.println("Option non disponible.");
                    break;
            }

        } while (choix != 0);

        input.close();
        

    }
}
