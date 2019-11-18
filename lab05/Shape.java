/**
 * Abstract class for all shapes 
*/
public abstract class Shape {
    /** @return Content of a shape object */
    public abstract String toString();

    /** @return Name of the object */
    public abstract String getName();

    /** @return  Area of the object if applicable */
    public double area(){
        return 0;
    }
    /** @return  Volume of the object if applicable */
    public double volume(){
        return 0;
    }
}