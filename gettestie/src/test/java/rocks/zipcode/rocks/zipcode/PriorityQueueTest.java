package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;
//public class CustomBaeldungQueue<T> extends AbstractQueue<T> {
//
//    private LinkedList<T> elements;
//
//    public CustomBaeldungQueue() {
//        this.elements = new LinkedList<T>();
//    }


public class PriorityQueueTest {


//    @Test
//    public void customQAddTest() {
//        customQueue.add(7);
//        customQueue.add(5);
//
//        int first = customQueue.poll();
//        int second = customQueue.poll();
//
//        assertEquals(7, first);
//        assertEquals(5, second);
//    }

    @Test
public void addTest() {

//        When new elements are inserted into the PriorityQueue, they are ordered based on their natural ordering, or by a defined Comparator
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>();

        integerQueue.add(9);
        integerQueue.add(2);
        integerQueue.add(4);

        int first = integerQueue.poll();
        int second = integerQueue.poll();
        int third = integerQueue.poll();

        assertEquals(2, first);

        assertEquals(4, second);

        assertEquals(9, third);
    }
    @Test
        public void addTest2(){
        //the retrieval order is changed according to the natural order of the Strings.
        //
            PriorityQueue<String> stringQueue = new PriorityQueue<>();

            stringQueue.add("blueberry");
            stringQueue.add("apple");
            stringQueue.add("cherry");

            String first = stringQueue.poll();
            String second = stringQueue.poll();
            String third = stringQueue.poll();

            assertEquals("apple", first);
            assertEquals("blueberry", second);
            assertEquals("cherry", third);
        }
    //offer() – Inserts a new element onto the Queue
//    poll() – Removes an element from the front of the Queue
    //peek() – Inspects the element at the front of the Queue, without removing it
}
