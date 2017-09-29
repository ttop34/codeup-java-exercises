package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public double getPerimeter() {
        return  2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }


}
