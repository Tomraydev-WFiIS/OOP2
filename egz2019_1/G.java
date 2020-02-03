class F extends Exception {}
class E extends RuntimeException {}

class G {
    void ge(){
        throw new E();
    }
    void gf() throws Exception{
        throw new F();
    }
    public static void main(String[] args){}
}