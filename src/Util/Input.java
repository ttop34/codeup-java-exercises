package Util;

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

   public boolean yesNo(String prompt){
       System.out.println(prompt);
       String userInput = this.scanner.nextLine();

       if (userInput.equals("y") || userInput.equals("yes")){
           return true;
       } else {
           return false;
       }
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between 1 and 10");
        int userInput = scanner.nextInt();

        if (userInput < 1 || userInput > 10){
            userInput = getInt(min, max);

        }
        return userInput;
    }

    public int getInt(){
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();

        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter the radius of a circle");
        double userInput = scanner.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number between 1 and 10");
        double userInput = scanner.nextInt();

        if (userInput < 1 || userInput > 100){
            userInput = getDouble(min, max);

        }

        return userInput;

    }




}
