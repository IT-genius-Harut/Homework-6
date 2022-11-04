package homework_6;

public interface Queue {
    DynamicArray dynamicArray = new DynamicArray();

    Integer[] array = new Integer[0];

    int currentSize = 0;

    void add(Integer element);

    void pop();

    void peek();
}
