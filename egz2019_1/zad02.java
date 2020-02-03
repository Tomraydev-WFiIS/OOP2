class F extends Exception {}
class G extends F {}

public class E {
    void f() {
        try {
            F x = new G();
            throw x;
        } catch (RuntimeException e){
        } catch (G e){
        } catch (F e){
        } catch (Exception e){
        }
    }
    public static void main(String[] args){
        return;
    }
}
