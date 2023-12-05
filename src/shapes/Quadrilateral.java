package shapes;

public abstract class Quadrilateral extends Shape  {

    protected double length;

    protected double width;

    //subclasses tell how to set width and length
    public abstract void setLength(double length);

    public abstract void setWidth(double width);

//    public Quadrilateral(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
