package shapes;
public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.getArea());

    }

    private double radius;

    public Circle(double radius){
        this.radius = radius;

    }



    public double getArea(){
        System.out.print("The Area is " );

        return Math.PI * (radius * radius);
    }


    public double getCircumference(){
        System.out.print("The Circumference is ");
        return 2 * Math.PI * radius;

    }

}
