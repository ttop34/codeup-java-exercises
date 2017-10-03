package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getDouble(1,10));
    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt){
        System.out.println(prompt);
        String userInput = this.scanner.nextLine();
        return userInput;
    }

   public boolean yesNo(){
       String userInput = scanner.nextLine();
       return  (userInput.equals("y") || userInput.equals("yes"));
    }

    public int getInt() {
        System.out.println("Enter a number");
        String userInput = scanner.next();
//        scanner.nextLine();


        try {
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("You didnt enter a number!");


        }
        return getInt();
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between 1 and 10");
        int userInput = getInt();

        if (userInput < 1 || userInput > 10){
            userInput = getInt(min, max);

        }
        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter the radius of a circle");
        String userInput = scanner.next();
        scanner.nextLine();

        try {
            return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("You didn\'t enter a Double!");
        }
        return getDouble();
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number between 1 and 10");
        double userInput = getDouble();

        if (userInput < 1 || userInput > 100){
            userInput = getDouble(min, max);

        }

        return userInput;

    }

    public int getBinary(){
        System.out.print("Enter a binary number: ");
        String userInput = scanner.next();

        return Integer.valueOf(userInput, 2);
    }

    public int getHexadecimal() {
        System.out.print("Enter a hexidecimal number:");
        String userInput = scanner.nextLine();
        return Integer.valueOf(userInput, 16);

    }
}


