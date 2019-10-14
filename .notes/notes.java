public class notes {
    public static void main(String args[]){
		hello();
    }
    public static void hello(){
        String s = new String("Hello World!");
        System.out.println(s);
    }
}
// DATA TYPES
int – 32-bitowa liczba całkowita (zakres −2^31 ÷ 2^31 − 1)
byte – 8-bitowa liczba całkowita (−128 ÷ 127)
short – 16-bitowa liczba całkowita (−32768 ÷ 32767)
long – 64-bitowa liczba całkowita (−2^63 ÷ 2^63 − 1)
float – 32-bitowa liczba zmiennoprzecinkowa (precyzja ok. 7 cyfr)
double – 64-bitowa liczba zmiennoprzecinkowa (precyzja ok. 15 cyfr)
char – 16-bitowy znak kodowany jako Unicode (inaczej niż w C++! – łatwo operować na znakach narodowychitp.)
boolean – typ logiczny (odpowiednik bool z C++), może przechowywać wartości true lub false
void

// LIBRARIES
Math.sqrt();
Math.sin()
Math.cos()
Math.PI

// CLASSES
BigInteger – liczby całkowitej dowolnego rozmiaru
BigDecimal – liczby ułamkowe z dowolną precyzją

// METHODS
Object.toString();
Object.equals(Object);