public class B{
    static B x;
    protected B y;
    B() { x = y = this;}
    public static void main(String args[]){
        System.out.println(x);
    }
}