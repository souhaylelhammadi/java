import  java.util.random.*;
import java.util.Scanner;
public class EX5 {
    public static void main(String[] args) {
        int n=(int)(Math.random()*3 ); 
        Scanner input = new Scanner(System.in);
        System.out.print("Devinez le nombre (0 pour pierre, 1 pour feuille, 2 pour ciseaux): ");
        int userChoice = input.nextInt();
        if (userChoice == 0 || n == 1) {
            System.out.println("PERDU ! La machine a choisi feuille.");     
        }else if (userChoice == 0 || n == 2) {
            System.out.println("GAGNÉ ! La machine a choisi ciseaux.");
        }else if (userChoice == 1 || n == 0) {
            System.out.println("GAGNÉ ! La machine a choisi pierre.");  
        }else if (userChoice == 1 || n == 2) {
            System.out.println("PERDU ! La machine a choisi ciseaux.");
        }else if (userChoice == 2 || n == 0) {
            System.out.println("PERDU ! La machine a choisi pierre.");
        }else if (userChoice == 2 || n == 1) {
            System.out.println("GAGNÉ ! La machine a choisi feuille.");
        }else if (userChoice ==  n) {
            System.out.println("Egalité.");
        }
    }
}
