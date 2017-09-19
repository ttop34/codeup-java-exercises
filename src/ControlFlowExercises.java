import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a numerical grade from 0 to 100");
        int input = scan.nextInt();

        String a = "A: 100 - 88";
        String b = "B: 87 - 80";
        String c = "C: 79 - 67";
        String d = "D: 66 - 60";
        String f = "F: 60 - 0";


        if (input <= 100 && input >= 88){
            System.out.println(a);
        }
        if (input <= 87 && input >= 80){
            System.out.println(b);
        }
        if (input <= 79 && input >= 67){
            System.out.println(c);
        }
        if (input <= 66 && input >= 60){
            System.out.println(d);
        }
        if (input <= 59 && input >= 0){
            System.out.println(f);
        }
    }
}
