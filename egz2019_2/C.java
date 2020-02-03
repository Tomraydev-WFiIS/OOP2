class C {
    private String f() { return "f z klasy C";}
    public static void main(String argv[]){
        System.out.println(new H().f());
    }
}
class H extends C {
    protected String f() { return "f z klasy H";}
}