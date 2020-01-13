import java.util.List;
import java.util.ArrayList;

public class Stos<T> {
    private List<T> stack;

    public Stos(){
        stack = new ArrayList<T>();
    }

    public void push(T o){
        stack.add(o);
    }

    public void pop(){
        stack.remove(stack.size() - 1);
    }

    public String toString(){
        String output = "";
        for(int i = stack.size()-1; i >=0; i--){
            output += "{";
            output += stack.get(i).toString();
            output += "} ";
        }
        return output;
    }
}