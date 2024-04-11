public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(3);

        stack.peek();
        stack.isEmpty();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.peek();
        stack.isFull();
        stack.push(4);
        stack.isEmpty();
            

    }
}
