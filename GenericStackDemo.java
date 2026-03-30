import java.util.ArrayList;

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    // Push operation
    public void push(T element) {
        stack.add(element);
        System.out.println(element + " pushed to stack");
    }

    // Pop operation
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Display stack
    public void display() {
        System.out.println("Stack: " + stack);
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>();

        // Push elements
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        intStack.display();

        // Pop elements
        System.out.println("Popped: " + intStack.pop());
        intStack.display();

        System.out.println("Popped: " + intStack.pop());
        intStack.display();
    }
}