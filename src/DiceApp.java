import java.lang.Math;
import java.util.Scanner;
public class DiceApp {
    public static void main(String[] args) {
        GetSides(true);

    }


    public static void GetSides(Boolean x){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of sides for a pair of dice ");
        int n = scan.nextInt();
        scan.nextLine();

            System.out.println("Press enter to Roll the Dice");
            String roll = scan.nextLine();

           while (true) {
               if (roll.equals("")) {
                   for (int i = 1; i <= 2; i++) {
                       n = (int) (Math.random() * n + 1);
                       System.out.println(" This is dye is " + n + "!");
                   }
               } else {
                   System.out.println("Okay goodbye!");
                   break;
               }
               System.out.println("");
               System.out.println("Do you wish to continue? y/n");
               String option = scan.nextLine();
               if (option.equals("y")) {
                   GetSides(true);
               } else {
                   System.out.println("Okay goodbye!");
                   break;

               }
           }
    }

}
