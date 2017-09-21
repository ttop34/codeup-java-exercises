import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Say something to Bob");
            String response = input.nextLine();
            String Question = "?";
            String Yell = "!";
            String sayNothing = "";

            if (response.endsWith(Question)) {
                System.out.println("Sure");
            } else if (response.endsWith(Yell)) {
                System.out.println("Whoa, chill out!");
            } else if (response.endsWith(sayNothing)) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Do you want to continue? y/n");
            String option = input.nextLine();

            if (!option.equalsIgnoreCase("y")) {
                System.out.println("Ok, good bye");
                break;
            }
        }

    }
}
