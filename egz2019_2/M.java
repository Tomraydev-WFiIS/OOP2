class K extends Exception {}
class M {
    public static int f(){
        try {int n = 2/0;}
        catch(ArithmeticException e) { throw e;}
        return 1;
    }
    public static void main(String argv[]){
        System.out.println(f());
    }
}