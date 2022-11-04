package homework_6;

public class DynamicArray {
    private Integer[] array = new Integer[6];
    private int currentSize = 0;


    public void add(int element) {
        if (currentSize == array.length) {
            scaleArray();
        }
        array[currentSize] = element;
        currentSize++;
    }

    private void scaleArray() {
        Integer[] tmp = new Integer[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public int remove() {
        if (currentSize < 0){
            throw new EmptyQueueException("the queue is empty");
        }
        array[currentSize] = null;
        currentSize--;

        return array[currentSize];
    }

    public void peek(){
        System.out.println(array[currentSize]);
    }

    public int removeAt(int index) {
        if (index > currentSize) {
            throw new ArrayIndexOutOfBoundsException("Hajox Valodik");
        }
        for (int i = index; i < currentSize; i++) {
            array[i] = array[i + 1];
        }
        array[currentSize - 1] = null;
        currentSize--;
        return array[index];
    }


    private void remove(int value) {
        Integer[] tmpArray = new Integer[array.length];
        int index = 0;
        for (int i = 0; i < currentSize; i++) {
            if (array[i] != value) {
                tmpArray[index] = array[i];
                index++;
            }
        }
        currentSize = index;
        array = tmpArray;
    }


    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < currentSize; i++) {
            string += array[i] + " ";
        }
        return string;
    }
}
