package Armia;

public class Rozkaz{
    private String order;
    public Rozkaz(String o){
        order = o;
    }

    public String getContent(){
        return order;
    }
}