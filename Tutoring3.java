
package tutoring3;
import java.util.ArrayList;

 class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

}

public class Tutoring3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");

        System.out.println(stack); // Output: stack: [Alice, Bob, Charlie]

        System.out.println("Top element: " + stack.peek()); // Output: Charlie
        stack.pop();
        System.out.println(stack); // Output: stack: [Alice, Bob]

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
    
}
