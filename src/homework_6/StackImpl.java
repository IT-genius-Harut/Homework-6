package homework_6;

public class StackImpl implements Stack {
    @Override
    public void pop() {
        dynamicArray.removeAt(currentSize);
    }

    @Override
    public void push(Integer element) {
        dynamicArray.add(element);
    }

    @Override
    public void peek() {
        System.out.println(array[currentSize]);
    }
}
