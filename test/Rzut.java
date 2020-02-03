enum Moneta {
    ORZEL, RESZKA;
}
public class Rzut {
    static java.util.Random r = new java.util.Random();
    static Moneta next() {
        return r.nextBoolean() ? Moneta.ORZEL : Moneta.RESZKA;
    }
}
