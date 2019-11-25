package Armia;
import java.util.List;
import java.util.ArrayList;
import Armia.Czolg;

public class CentrumDowodzenia{
    private List<Czolg> tanks;
    public CentrumDowodzenia(){
        tanks = new ArrayList<Czolg>();
    }

    public void zarejestrujCzolg(Czolg tank){
        tanks.add(tank);
    }

    public void wydajRozkaz(String index, Rozkaz order){
        int i = Integer.parseInt(index);
        tanks.get(i-1).giveOrder(order);
        return;
    }

    public String toString(){
        String output = "";
        output += "Do tej pory centrum dowodzenia wyslalo nastepujace rozkazy:\n";
        for(int i = 0; i < tanks.size(); i++){
            output += "Czolg nr " + (i+1) + " otrzymal rozkazy:\n";
            output += tanks.get(i).getOrders();
            output += "\n";
        }
        return output;
    }
}