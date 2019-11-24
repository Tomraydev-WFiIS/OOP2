package Armia;
import java.util.ArrayList;

public class Czolg{
    private ArrayList<Rozkaz> orders;

    public Czolg(){
        orders = new ArrayList<Rozkaz>();
    }

    public String ostatniRozkaz(){
        return "Ostatni rozkaz do mnie: " + orders.get(orders.size()-1).getOrder();
    }

    public void setOrder(Rozkaz order){
        this.orders.add(order);
    }

    public String getAllOrders(){
        String toRet = "";
        for(int i = 0; i < orders.size(); i++)
            toRet +=orders.get(i).getOrder() + "\n";
        return toRet;
    }
}
