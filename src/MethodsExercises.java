
import java.lang.reflect.GenericArrayType;
import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {


    }


//
//    public static int Addition(int a, int b){
//        return a + b;
//    }
//    public static int Subtraction(int a, int b){
//        return a - b;
//    }
//    public static int Multiplication(int a, int b){
//
//        for (int i = 0; i <= b; i++){
//            a = a +a;
//        }
//            return a;
//    }
//
//    public static int Division(int a, int b){
//        return a / b;
//    }
//    public static int Modulus(int a, int b){
//        return a % b;
//    }

    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100: ");

        int UserInput = scan.nextInt();

        if (UserInput < min || UserInput > max) {
           UserInput = getInteger(min, max);
        } else {
            return UserInput;
        }
        return UserInput;

    }

    public static long factorial(int min, int max) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 10 ");
        int factorial = 1;
        long n = scan.nextInt();

        if (n < min || n > max) {
            n = factorial(min, max);
        } else {

            for (int i = 1; i <= n; i++) {

                factorial *= i;
            }
            return factorial;
        }
        return n;
    }

}
