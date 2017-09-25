package Util.Shapes;
public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.getCircumference(3));

    }

    private double radius;

    public Circle(double radius){
        this.radius = radius;

    }



    public double getArea(double radius){

        return Math.PI * (radius * radius);
    }


    public double getCircumference(double radius){
        return 2 * Math.PI * radius;

    }

}
