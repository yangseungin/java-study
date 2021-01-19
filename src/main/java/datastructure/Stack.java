package datastructure;

import java.util.EmptyStackException;

//int 배열을 사용해서 정수를 저장하는 Stack을 구현하세요.
//void push(int data)를 구현하세요.
//int pop()을 구현하세요.
public class Stack {
    int[] arr;
    int stackSize;
    int count = 0;

    public Stack(int data) {
        this.stackSize = 10;
        this.arr = new int[stackSize];
        this.arr[0] = data;
        count++;
    }

    public void push(int data) {
        if (stackSize == count) {
            int[] newArr = new int[stackSize + 10];
            for (int i = 0; i < stackSize; i++)
                newArr[i] = arr[i];
            stackSize += 10;
            arr = newArr;
        }
        this.arr[this.count++] = data;
    }

    public int pop() {
        if (count == 0)
            throw new EmptyStackException();
        return arr[--count];
    }

    public int size() {
        return count;
    }

}
