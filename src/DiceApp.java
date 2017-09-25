import java.lang.Math;
import java.util.Scanner;
public class DiceApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of sides for a pair of dice.");
        int n = scan.nextInt();


        String roll = Roll();

        if (roll.equals("")) {
            for (int i = 1; i <= 2; i++) {
                n = (int) (Math.random() * n + 1);
                System.out.println("This dye is " + n + "!");
                System.out.println("");
            }
        }

        Option();


    }

    public static String Roll(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Press enter to Roll the Dice");
        String roll = scan.nextLine();

        return roll;
        }
//
//
    public static String Option(){
        Scanner scan = new Scanner(System.in);
               System.out.println("Do you wish to continue? y/n");
               String option = scan.nextLine();

               if (option.equals("y")) {
                   GetSides();
               } else {
                   System.out.println("Okay goodbye!");

               }
               return option;
    }

    public static int GetSides(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of sides for a pair of dice.");
        int n = scan.nextInt();
        return n;
    }

}
