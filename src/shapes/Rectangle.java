package shapes;

public class Rectangle {

//    //constructor
//    public Rectangle(double length, double width){
//        super(length, width);
//    }
//
//    public double getPerimeter(){
//        return 0;
//    }
//
//    public double getArea(){
//        return 0;
//    }



    //create protected PROPERTIES for length and width
    protected int length;
    protected int width;

    //CONSTRUCTOR. accepts two numbers, one for length and one for width and sets those properties
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //METHODS
    public int getArea (){
        int area = length * width;
        return area;
    }

    public int getPerimeter (){
        return 2 * length + 2 * width;
    };








}
