package homework_6;

public class Main {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        QueueImpl queue = new QueueImpl();
        // Stack
        stack.push(15);
        stack.push(27);
        stack.push(71);
        stack.push(81);
        stack.push(24);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        stack.peek();
        stack.push(71);
        stack.push(26);
        stack.peek();
        // Queue
        queue.add(8);
        queue.add(36);
        queue.add(17);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        queue.pop();
        queue.pop();
        System.out.println(queue);
        queue.add(42);
        queue.add(34);
        queue.peek();

    }
}
