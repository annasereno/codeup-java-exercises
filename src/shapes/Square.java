package shapes;

public class Square extends Rectangle{

    private int side;

    //CONSTRUCTOR//
    //define a constructor that accepts one argument side
    public Square (int side){
        super(side, side);
        this.side = side;
    }

    @Override
    public int getArea() {
        System.out.println("square area");
        return side * side;
    }

    @Override
    public int getPerimeter() {
        System.out.println("square perimeter");
        return side * 4;
    }
}
