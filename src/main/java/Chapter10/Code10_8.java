package Chapter10;

/**
 * Created by Wilbur Hsu on 2018-1-2.
 * StackOfIntegers
 */
public class Code10_8 {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public Code10_8(){
        this (DEFAULT_CAPACITY);
    }

    public Code10_8(int capacity){
        elements = new int[capacity];
    }

    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int pop(){
        return elements[--size];
    }

    public int peek(){
        return elements[size - 1];

    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

}
