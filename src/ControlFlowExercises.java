public class ControlFlowExercises {

    public static void main(String[] args) {
        String y = "fizz";
        String x = "buzz";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            } else {
                if (i % 3 == 0) {
                    System.out.print(y);
                }

                if (i % 5 == 0) {
                    System.out.print(x);
                }
                System.out.println();
            }
        }

    }
}
