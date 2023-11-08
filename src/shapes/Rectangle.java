package shapes;

public class Rectangle {

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
