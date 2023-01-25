import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTests {
    @Test
    public void prependTest(){
        LinkedList list = new LinkedList();
        list.root = new Node(3, new Node(5, new Node(8, null)));
        list.prepend(1);
        assertEquals("1 3 5 8", list.toString().trim());
    }

    @Test
    public void appendTest(){
        LinkedList list = new LinkedList();
        list.root = new Node(3, new Node(5, new Node(8, null)));
        list.append(1);
        assertEquals("3 5 8 1", list.toString().trim());
    }
}
