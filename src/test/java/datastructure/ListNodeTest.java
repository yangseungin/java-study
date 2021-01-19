package datastructure;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ListNodeTest {
    ListNode head,node1,node2,node3;

    @Before
    public void init(){
         head = new ListNode();
         node1 = new ListNode(1);
         node2 = new ListNode(2);
         node3 = new ListNode(3);
    }

    @Test
    public void addTest(){
        head.add(head,node1,0); //1
        head.add(head,node2,1); //1 2
        head.add(head,node3,1); //1 3 2

        assertEquals(head.getNext().getValue(),1);
        assertEquals(head.getNext().getNext().getValue(),3);
        assertEquals(head.getNext().getNext().getNext().getValue(),2);
    }
    @Test
    public void removeTest(){
        head.add(head,node1,0); //1
        head.add(head,node2,1); //1 2
        head.add(head,node3,2); //1 2 3
        head.remove(head,1);    //1 3

        assertEquals(head.getNext().getValue(),1);
        assertEquals(head.getNext().getNext().getValue(),3);
    }
    @Test
    public void containsTest(){
        head.add(head,node1,0); //1
        head.add(head,node2,1); //1 2
        head.add(head,node3,2); //1 2 3

        assertEquals(head.contains(head,new ListNode(3)),true);
        assertEquals(head.contains(head,new ListNode(7)),false);
    }

}