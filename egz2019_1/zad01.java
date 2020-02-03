class A{}
class B extends A {}
class C extends B {}

public class Main {
    public static void main(String args[]){
        class D {
            A a = new C();
            B b = new C();
        }
    }
}