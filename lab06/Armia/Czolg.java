package Armia;
import java.util.List;
import java.util.ArrayList;

public class Czolg{
    private List<Rozkaz> orders;
    public Czolg(){
        orders = new ArrayList<Rozkaz>();
    }

    public void giveOrder(Rozkaz order){
        orders.add(order);
        return;
    }
    
    public String ostatniRozkaz(){
        String output = "Ostatni rozkaz do mnie: ";
        output += orders.get(orders.size() - 1).getContent();
        output += "\n";
        return output;
    }

    public String getOrders(){
        String output = "";
        for(int i = 0; i < orders.size(); i++){
            output += orders.get(i).getContent();
            output += "\n";
        }
        return output;
    }
}