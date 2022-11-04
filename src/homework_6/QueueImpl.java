package homework_6;

public class QueueImpl implements Queue{
    @Override
    public void add(Integer element) {
        dynamicArray.add(element);
    }

    @Override
    public void pop() {
        dynamicArray.remove();
    }

    @Override
    public void peek() {

    }
}
