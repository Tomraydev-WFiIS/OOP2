import java.util.*;
import java.util.ArrayList;


public class Lista_Studentow {
    private List<Student> list;

    Lista_Studentow(){
        list = new ArrayList<Student>();
    }

    public void add(String fname, String lname, int age){
        Student s = new Student(fname, lname, age);
        list.add(s);
    }

    public void add(Student s){
        list.add(s);
    }

    public void wypisz_wszystkich(){
        for (Student s : list) {
			System.out.println(s);
		}
    }

    public void sort_imie_rosnaca(){
        Collections.sort(list, new ImieSort() );
    }

    public void sort_imie_malejaca(){
        Collections.sort(list, new ImieSort() );
        Collections.reverse(list);
    }

    public void sort_nazwisko_rosnaca(){
        Collections.sort(list, new NazwiskoSort() );
    }

    public void sort_nazwisko_malejaca(){
        Collections.sort(list, new NazwiskoSort() );
        Collections.reverse(list);
    }

    public void sort_wiek_rosnaca(){
        Collections.sort(list, new WiekSort() );
    }

    public void sort_wiek_malejaca(){
        Collections.sort(list, new WiekSort() );
        Collections.reverse(list);
    }
}
