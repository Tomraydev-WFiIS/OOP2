public class A<E extends String, V extends String>{
    E x;
    V y;
    public A(E a, V b){
        this.x = a;
        this.y = b;
    }
    public static void main(String args[]){
        A o = new A("a", "b");
        System.out.println(o.x + "" + o.y);
    }
}
