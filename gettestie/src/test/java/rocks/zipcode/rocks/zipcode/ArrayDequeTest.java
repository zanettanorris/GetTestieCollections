package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.assertEquals;

public class ArrayDequeTest {

    @Test
    public void whenPush_addsAtFirst() {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("first");
        stack.push("second");

        assertEquals("second", stack.getFirst());
    }

    @Test
    public void whenPop_removesLast() {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("first");
        stack.push("second");

        assertEquals("second", stack.pop());
    }

    @Test
    public void whenOffer_addsAtLast() {
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("first");
        queue.offer("second");

        assertEquals("second", queue.getLast());
    }

    @Test
    public void whenPoll_removesFirst() {
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("first");
        queue.offer("second");

        assertEquals("first", queue.poll());
    }
//    https://www.baeldung.com/java-array-deque
}
