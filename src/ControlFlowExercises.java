import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int input = scan.nextInt();

        System.out.printf("%10s", "number | ");
        System.out.printf(" %-5s", "square  |");
        System.out.printf(" %-10s", "cubed   ");

        System.out.println();

        System.out.printf("%10s", "------ | ");
        System.out.printf(" %-5s", "------- |");
        System.out.printf(" %-10s", "-----");
        System.out.println();

        for (int i = 1; i <= input; i++){
            System.out.printf("%-10s", i + "       |");
            System.out.printf(" %-5s", i * i + "       |");
            System.out.printf(" %-10s", i * i * i + "      |");
            System.out.println();
        }

    }
}
