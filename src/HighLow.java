import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        int gamePick = GamePick();
        System.out.println(gamePick);
        System.out.println("Guess the number between 1 and 100");
        Scanner scan = new Scanner(System.in);
        int userGuess = scan.nextInt();


        while (true)
            if (userGuess < 1 || userGuess > 100) {
           userGuess = GetGuess();
            } else {
                break;
            }
        while(userGuess != gamePick) {
            if (userGuess < gamePick) {
                System.out.println("HIGHER");
                userGuess = GetGuess();
            }
            else if (userGuess > gamePick) {
                System.out.println("LOWER");
                userGuess = GetGuess();
            }

        }
        System.out.println("GREAT GUESS!");
    }

    public static int GetGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100");
        int userGuess = scan.nextInt();
        return userGuess;
    }


    public static int GamePick() {
        int n = (int) (Math.random() * 100 + 1);// random number is decided here

        return n;
    }
}
