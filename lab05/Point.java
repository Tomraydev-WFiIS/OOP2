/**
 * Point on a 2d surface
*/
public class Point extends Shape {
    protected double x;
    protected double y;

    /**
    * @param x x coordinate
    * @param y y coordinate
    */
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String getName(){
        return "Point";
    }
    public String toString(){
        return "[" + x + ", " + y + "]";
    }
}