package pl.edu.agh.fis.alfa; //Przykład: kod pakietu pl.edu.agh.fis.alfa umieszczamy w katalogu pl/edu/agh/fis/alfa/<nazwaKlasy>

import java.util.Date;
import java.util.*;
import static java.lang.Math.PI; // pozwala na używanie nazw statycznych składników klas bez podawania nazwy klasy

public class notes {
    public static void main(String args[]){
		  hello();
    }
    public static void hello(){
        String s = new String("Hello World!");
        System.out.println(s);
    }
}

public class Klasa extends KlasaBazowa { //przed inicjalizacją obiektu klasy pochodnej automatycznie wywoływany jest konstruktor domyślny klasy podstawowej;
  int n;
  Klasa() { // Konstruktor
    super(arg1, arg2); // uruchomienie innego konstruktora - musi byc pierwszą instrukcją konstruktora
    member = super.member; // dostep do skladnikow klasy bazowej
  }

  Klasa(int arg1) { // Konstruktor
    this(arg1, arg1); // Wywolanie innego konstruktora z tej samej klasy
  }

  Klasa(int arg1, int arg2) { // Konstruktor
  }


  Klasa(Klasa obj) { // Konstruktor kopiujący
    n = obj.n;
  }

  { // Blok inicjalizujacy - moze też byc statyczny
    n = 5;
  }

  public String toString() {// warto zaimplementować
  }

  static int metoda_statyczna(){ return 1;}

}

abstract class A {
  //• każda klasa zwierająca jedną lub więcej metod abstrakcyjnych jest klasą abstrakcyjną i musi być zdefiniowana z użyciem modyfikatora abstract
  abstract String opis(); // metoda abstrakcyjna

  // • klasa dziedzicząca po klasie abstrakcyjnej musi
  //   – albo definiować wszystkie abstrakcyjne metody z klasy podstawowej,
  //   – albo również pozostać abstrakcyjna
}

// DATA TYPES
int – 32-bitowa liczba całkowita (zakres −2^31 ÷ 2^31 − 1)
byte – 8-bitowa liczba całkowita (−128 ÷ 127)
short – 16-bitowa liczba całkowita (−32768 ÷ 32767)
long – 64-bitowa liczba całkowita (−2^63 ÷ 2^63 − 1)
float – 32-bitowa liczba zmiennoprzecinkowa (precyzja ok. 7 cyfr)
double – 64-bitowa liczba zmiennoprzecinkowa (precyzja ok. 15 cyfr)
char – 16-bitowy znak kodowany jako Unicode (inaczej niż w C++! – łatwo operować na znakach narodowych itp.)
boolean – typ logiczny (odpowiednik bool z C++), może przechowywać wartości true lub false
void

// ARRAYS
int[][] tab = new int[10][10];

// LIBRARIES
Math.sqrt();
Math.sin();
Math.cos();
Math.PI

// CLASSES
BigInteger – liczby całkowitej dowolnego rozmiaru
BigDecimal – liczby ułamkowe z dowolną precyzją

// METHODS
Object.toString();
Object.equals(Object);
Object.clone // - returns a shallow copy, ale lepiej zrobić konstruktorem kopiującym


final // - klasy, metody, pola i zmienne
/*
  - odpowiednik danych składowych/zmiennych const w C++ – zmienne, których wartość nie może być modyfikowana po inicjalizacji (“a final variable can occur at most once as a left-hand expression”)
  ! Uwaga: w przypadku referencji niezmienność dotyczy samej referencji, a nie obiektu, na który ona pokazuje.
  Zastrzeżenie to dotyczy także tablic (które są zawsze obiektami)
*/

// FILE HANDLING 
try {
  BufferedReader f = new BufferedReader(new FileReader("plik.txt") ); // buffering speeds things up
  String s;
  int i = 1;
  while( (s = f.readLine()) != null ){
    System.out.println( (i++) + " : " + s );
  }
}
catch( Throwable e ) { // !!
  System.out.println( "Blad odczytu pliku!" );
}

// INTERFACES
interface Pisze {
  void pisz(); // <-- public !
  String s = "[Pisze]"; // <-- static final !
}
class Rzecz implements Pisze {
  // void pisz() { ... } /* ZLE! */
  public void pisz() { System.out.println("..Rzecz.."); }
}
Rzecz r = new Rzecz();
System.out.print("r.pisz() : "); r.pisz();
System.out.println("r.s=" + r.s + " Pisze.s=" + Pisze.s);

interface ZwracaLiczbeInt {
  int liczbaInt();
}
// implements many interfaces
class Rzecz implements Pisze, ZwracaLiczbeInt {
  public void pisz() { System.out.println("..Rzecz.."); }
  public int liczbaInt() { return 99; }
}

// DEFAULT METHODS
interface NazwaInterfejsu {
  default nazwaMetody(...) {
    // definicja/ciało metody
  }
}

interface Dzialanie { // nowa, zmieniona wersja
  double wykonaj(double a);
  default double wykonajLogujac(double a) {
    System.out.println("[log] wykonaj("+a+")");
    return wykonaj(a);
  }
}

// NESTED CLASSES
// klasy zdefiniowane wewnątrz innych klas (nested classes):
// – “zwykłe” (niestatyczne, inner classes)
// – statyczne (static nested classes)
// – lokalne (wewnątrz metod)
// – anonimowe

public class Dane {
  class Liczba { double wartosc; }
  class Opis { String tekst = "pi"; }
  public Liczba toLiczba(double x) {
    Liczba l = new Liczba();
    l.wartosc = x;
    return l;
  }
  public void pokaz() {
    Liczba l = toLiczba(3.14159);
    Opis o = new Opis();
    System.out.println( o.tekst
    + " = " + l.wartosc );
  }
}
new Dane().pokaz();