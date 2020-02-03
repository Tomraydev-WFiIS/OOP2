public class A1 {
    public static void main(String[] args){
        float[] t = new float[1];
        float s = 0;
        for(float x : t)
            s += 0.3;
        System.out.println("s=" + s);
    }
}

//s=0.3