

import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.print("Enter an integer between 1 and 10 ");
//        int factorial = 1;
//        long n = scan.nextInt();

        System.out.println(factorial());




    }


//
//    public static int Addition(int a, int b){
//        return a + b;
//    }
//    public static int Subtraction(int a, int b){
//        return a - b;
//    }

//    public static int Multiplication(int a, int b){
//        int res = 0;
//        for (int i = 1; i <= b; i++){
//            res = res + a;
//        }
//            return res;
//    }
//
//    public static int Division(int a, int b){
//        return a / b;
//    }
//    public static int Modulus(int a, int b){
//        return a % b;
//    }
//
//    public static int getInteger(int min, int max){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 100: ");
//
//        int UserInput = scan.nextInt();
//
//        if (UserInput < min || UserInput > max) {
//           UserInput = getInteger(min, max);
//        } else {
//            return UserInput;
//        }
//        return UserInput;

//    }

    public static long factorial() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 10 ");
        long n = scan.nextInt();
        int factorial = 1;


        while (n < 1 || n > 10){
            n = factorial();
        }

        for (int i = 1; i <= n; i++) {

            factorial *= i;

        }

        return factorial;
    }

    public static void Option(){
        Scanner scan = new Scanner(System.in);
        System.out.println("would you like to continue? y/n");
        String option = scan.nextLine();

        while (option.equals("y")){
            factorial();
        }
            System.out.println("Goodbye!");
        }
}
