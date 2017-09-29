package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }


    @Override
    public double getPerimeter() {
        return  2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }
}
