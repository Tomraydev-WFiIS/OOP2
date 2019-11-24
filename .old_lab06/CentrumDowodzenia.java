package Armia;
import java.util.ArrayList;

import Armia.Czolg;

public class CentrumDowodzenia{

    private ArrayList<Czolg> tanks;

    public CentrumDowodzenia(){
        tanks = new ArrayList<Czolg>();
    }

    public void zarejestrujCzolg(Czolg newTank){
        tanks.add(newTank);
    }

    public void wydajRozkaz(String tankNum, Rozkaz order){
        tanks.get(Integer.parseInt(tankNum) - 1).setOrder(order);
    }

    public String toString(){
        String toRet = "Do tej pory centrum dowodzenia wyslalo nastepujace rozkazy:\n";
        for(int i = 0; i < tanks.size(); i++){
            toRet += "Czolg nr " + (i+1) + " otrzymal rozkazy: \n" + tanks.get(i).getAllOrders() + "\n";
        }
        return toRet;
    }
}