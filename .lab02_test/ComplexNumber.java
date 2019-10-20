public class ComplexNumber {
    double re;
    double im;
    ComplexNumber(double a, double b) {
        re = a;
        im = b;
        print();
    }
    
    ComplexNumber add(ComplexNumber num) {
        ComplexNumber result = new ComplexNumber(this.re += num.re,this.im += num.im);
        return result;
    }

    ComplexNumber multiply(ComplexNumber num) {
        double real = this.re*num.re - this.im*num.im;
        double imaginary = this.re*num.im + this.im*num.re;
        ComplexNumber result = new ComplexNumber(real, imaginary);
        return result;
    }

    ComplexNumber divide(ComplexNumber num) {
        double real = this.re*num.re + this.im*num.im;
        double imaginary =  - this.re*num.im + this.im*num.re;
        double denominator = num.re*num.re + num.im*num.im;
        ComplexNumber result = new ComplexNumber(real/denominator, imaginary/denominator);
        return result;
    }

    public void print() {
        System.out.println("re = " + re + "\tim = " + im);
    }
}