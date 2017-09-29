package Util.Shapes;

public class Square extends Quadrilateral {


    public Square(int side) {
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
    public void setWidth(int width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
        this.width = length;
    }
}
