class L {
    public void f(){
        System.out.println("L:f, ");
    }
    public static void g() {
        System.out.println("L:g, ");
    }
    public static void main(String argv[]){
        K k = new K();
        L l = k;
        k.f(); l.f(); k.g(); l.g();
    }
}

class K extends L {
    public void f() {
        System.out.println("K:f, ");
    }
    public static void g(){
        System.out.println("K:g, ");
    }
}