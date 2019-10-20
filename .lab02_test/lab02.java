public class lab02 {
    public static void main(String[] args){
        ComplexNumber a = new ComplexNumber(3, 5);
        ComplexNumber b = new ComplexNumber(-2, 8);

        ComplexNumber res = a.divide(b).multiply(a).add(b);
        res.print();
    }
}