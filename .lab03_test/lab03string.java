public class lab03string {
	/**
	*	Oblicza dlugosc wprowadzonego stringa
	*	@param s Wprowadzany string
	*	@return Dlugosc wprowadzonego stringa
	*/
	public static int dlugosc(String s) {
		return s.length();
	}

	/**
	*	Zlicza ilosc wystapien literki w stringu
	*	@param s Przeszukiwany string
	*	@param szukanaLitera Litera wyszukiwana w stringu
	*	@return Ilosc wystapien literki w stringu
	*/
	public static int ile_razy_literka_wystepuje(String s, char szukanaLitera) {
		int ileLiter = dlugosc(s);
		int licznikWystapien = 0;
		for (int i=0; i < ileLiter; i++)
			if (s.charAt(i) == szukanaLitera)
				licznikWystapien++;
		return licznikWystapien;
	}

	/**
	*	Porownuje dwa stringi
	*	@param pierwszy Pierwszy string
	*	@param drugi Drugi string
	*	@return Prawda, jesli stringi sa takie same
	*/
	public static boolean czy_takie_same(String pierwszy, String drugi) {
		return pierwszy.equals(drugi);
	}

	/**
	*	Odwracanie wprowadzonego stringa
	*	@param przetwarzanyString String do odwrocenia
	*	@return Odwrocony string
	*/
	public static String wspak(String przetwarzanyString) {
		StringBuilder odwrocony = new StringBuilder(przetwarzanyString);
		odwrocony = odwrocony.reverse();
		String zwracany = new String(odwrocony);
		return zwracany;
	}

	/**
	*	Sprawdza czy wprowadzony string (zdanie) jest palindromem
	*	@param sprawdzany Sprawdzane zdanie
	*	@return Prawda, jesli string jest palindromem
	*/
	public static boolean czy_plaindrom(String sprawdzany) {
		StringBuilder odwrocony = new StringBuilder(sprawdzany);
		odwrocony = odwrocony.reverse();
		String poOdwroceniu = new String(odwrocony);
		return poOdwroceniu.equals(sprawdzany);
	}

	/**
	*	Sprawdza czy litery pojawiajace sie w stringu wystepuja w kolejnosci alfabetycznej
	*	@param s Sprawdzany string
	*	@return Prawda, jesli string jest "abecadlowy"
	*/
	public static boolean czy_abecadlowe(String s) {
		int dlugoscStringa = dlugosc(s);
		for (int i=0; i < dlugoscStringa-1; i++)
			if (java.lang.Character.compare(s.charAt(i), s.charAt(i+1)) > 0)
				return false;
		return true;
	}

	/**
	*	Stosuje na zdaniu szyfr Cezara, dotyczy tylko duzych i malych liter
	*	@param rotowanyString Przetwarzany string
	*	@return Zaszyfrowany string
	*/
	public static String rot13(String rotowanyString) {
		int dlugoscStringa = dlugosc(rotowanyString);
		int literkaAmala = (int)'a';
		int literkaAduza = (int)'A';
		int literkaZmala = (int)'z';
		int literkaZduza = (int)'Z';
		StringBuilder przerotowany = new StringBuilder(rotowanyString);

		for (int i = 0; i < dlugoscStringa; i++) {
			int obecnaLiterka = (int)rotowanyString.charAt(i);
			int odejmowane;
			if (obecnaLiterka < literkaAmala || obecnaLiterka > literkaZmala)
				if (obecnaLiterka < literkaAduza || obecnaLiterka > literkaZduza)
					continue;

			if (obecnaLiterka >= literkaAmala && obecnaLiterka <= literkaZmala)
				odejmowane = literkaAmala;
			else
				odejmowane = literkaAduza;

			obecnaLiterka = obecnaLiterka - odejmowane;
			obecnaLiterka = obecnaLiterka + 13;
			obecnaLiterka = obecnaLiterka % 26;
			obecnaLiterka = obecnaLiterka + odejmowane;
			char podmieniana = (char)obecnaLiterka;
			przerotowany.setCharAt(i, podmieniana);
		}
		return new String(przerotowany);
	}

}