/** Cube attached to a 2d surface */
public class Cube extends Square {
    /**
    * @param side length of a side
    * @param x x coordinate of a corner
    * @param y y coordinate of a corner
    */
    Cube(double side, double x, double y){
        super(side, x, y);
    }
    public String getName(){
        return "Cube";
    }
    public String toString(){
        return super.toString() + "; depth = " + side;
    }

    public double area(){
        return 6*super.area();
    }
    public double volume(){
        return side*super.area();
    }
}