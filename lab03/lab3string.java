public class lab3string {
    public static int dlugosc(String s){
        return s.length();
    }

    public static int ile_razy_literka_wystepuje(String s,char c){
        int len = s.length();
        char[] ca = s.toCharArray();
        int count = 0;
        for(int i = 0; i < len; i++){
            if(ca[i] == c){count++;}
        }
        return count;
    }

    public static boolean czy_takie_same(String s1,String s2){
        if (s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }

    public static String wspak(String s){
        int len = s.length();
        char[] ca = s.toCharArray();
        char[] ca2 = new char[len];
        for(int i = 0; i < len; i++){
            ca2[i] = ca[len-i-1];
        }
        String s2 = new String(ca2);
        return s2;
    }

    public static boolean czy_plaindrom(String s){
        if(s.equals(lab3string.wspak(s))){
            return true;
        }else{
            return false;
        }
    }

    public static boolean czy_abecadlowe(String s){
        int len = s.length();
        char[] ca = s.toCharArray();
        char highest = ca[0];
        for(int i = 1; i < len; i++){
            if (ca[i] < highest){
                return false;
            }else {
                highest = ca[i];
            }
        }
        return true;
    }

    public static String rot13(String s){
        int len = s.length();
        char[] ca = s.toCharArray();
        char[] ca2 = new char[len];
        for(int i = 0; i < len; i++){ 
            if(ca[i] > 'A' && ca[i] < 'Z'){ // UPPERCASE
                ca2[i] = (char)(((ca[i] - 'A' + 13) % 26 ) + 'A');
            }else if (ca[i] > 'a' && ca[i] < 'z'){ // lowercase
                ca2[i] = (char)(((ca[i] - 'a' + 13) % 26 ) + 'a');
            }else{
                ca2[i] = ca[i];
            }
        }
        String s2 = new String(ca2);
        return s2;
    }
}