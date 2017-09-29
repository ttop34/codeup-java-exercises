package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args) {
        Input prompt = new Input();
        double userInput = prompt.getDouble();
        Circle circle = new Circle(userInput);

        System.out.println(circle.getCircumference());
        System.out.println(circle.getArea());


    }



}
