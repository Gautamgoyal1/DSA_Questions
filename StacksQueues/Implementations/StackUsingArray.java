public class StackUsingArray {

    class Stack {

        int[] stack;
        int top;
        Stack(int size) {
            stack = new int[size];
            top = -1;
        }

        void push(int data) {
            stack[++top] = data;
        }

        int pop() {
            return stack[top--];
        }

        int peek() {
            return stack[top];
        }

        boolean isEmpty() {
            return top == -1;
        }

        boolean isFull() {
            return top == stack.length-1;
        }

        int size() {
            return top+1;
        }
    }

    public static void main(String[] args) {

        StackUsingArray obj = new StackUsingArray();
        Stack stack = obj.new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.push(40);

        System.out.println("Popped: " + stack.pop());

        stack.push(50);
        stack.push(60);

        System.out.println("Is stack full? " + stack.isFull());

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Current size: " + stack.size());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}