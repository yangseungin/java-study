package datastructure;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StackTest {

    @Test
    public void pushTest() {
        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertEquals(stack.size(), 5);
    }

    @Test
    public void popTest() {
        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertEquals(stack.pop(), 5);
        assertEquals(stack.pop(), 4);
    }

}