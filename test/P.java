class P {
    int k;
    P(int k) { this.k = k; }
    P() {
    // System.out.println(); /* ZLE */
    this(-1);
}
}