

import java.util.Scanner;
public class EX1 {


    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Veuillez saisir un score (sur 100) : ");
        int score = input.nextInt();
        if (score >=90 && score <=100 ){
            System.out.println("Excellent");
        }else if( score >=80 && score <=89 ){
            System.out.println("Très bien");
        }else if (score >=70 && score <=79 ){
            System.out.println("Bien");
        }else if (score >=60 && score <=69 ){
            System.out.println("Assez bien");
        }else if (score >=50 && score <=59 ){
            System.out.println("Passable");
        }else if (score >=0 && score <=49 ){
            System.out.println("Échec");
        }
    }


}
