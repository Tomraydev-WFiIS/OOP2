/** Square on a 2d surface */
public class Square extends Point {
    protected double side;
    /**
    * @param side length of a side
    * @param x x coordinate of a corner
    * @param y y coordinate of a corner
    */
    Square(double side, double x, double y){
        super(x, y);
        this.side = side;
    }

    public String getName(){
        return "Square";
    }
    public String toString(){
        return "Corner = " + super.toString() + "; side = " + side;
    }
    public double area(){
        return side*side;
    }
}