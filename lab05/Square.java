public class Square extends Point {
    protected double side;
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