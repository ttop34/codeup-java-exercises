import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer");
         int newInt = scan.nextInt();
        System.out.println(newInt);

        System.out.println("Please enter three words");
        String firstString = scan.next();
        String secondString = scan.next();
        String thirdString = scan.next();


        System.out.println(firstString+"\n");
        System.out.println(secondString+"\n");
        System.out.println(thirdString+"\n");

        System.out.println("Enter the length of the classroom");
        String lengthResponse = scan.nextLine();
        Double length = Double.parseDouble(lengthResponse);

        System.out.println("Enter the width of the classroom");
        String widthResponse = scan.nextLine();
        Double width = Double.parseDouble(widthResponse);

        Double area = length * width;
        Double perimeter = 2 * length + 2 * width;

        System.out.println("The area of the classroom is " +area);
        System.out.println("the perimeter of the classroom is " +perimeter);


    }
}
