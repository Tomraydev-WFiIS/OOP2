public class C{
    static C x;
    protected C y;
    C() {x=y=this;}
    public static void main(String args[]){
        System.out.println(x.y);
    }
}