

import java.util.Scanner;

public class Ex2 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le score sur 100 : ");
        int score = input.nextInt();

        
        int divs = score / 10;

        switch (divs) {
                case 10:
                case 9:
                    System.out.println("Excellent");
                    break;
                case 8:
                    System.out.println("Très bien");
                    break;
                case 7:
                    System.out.println("Bien");
                    break;
                case 6:
                    System.out.println("Assez bien");
                    break;
                case 5:
                    System.out.println("Passable");
                    break;
                default:
                    System.out.println("Échec");
                    break;
            }
        

        input.close();
    }
}
