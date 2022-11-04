package homework_6;

public interface Stack {
    Integer[] array = new Integer[6];
    int currentSize = 0;

    DynamicArray dynamicArray = new DynamicArray();

    void pop();
    void push(Integer integer);
    void peek();
}
