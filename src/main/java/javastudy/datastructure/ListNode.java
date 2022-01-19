package javastudy.datastructure;

import java.util.Objects;

//LinkedList에 대해 공부하세요.
//        정수를 저장하는 ListNode 클래스를 구현하세요.
//        ListNode add(ListNode head, ListNode nodeToAdd, int position)를 구현하세요.
//        ListNode remove(ListNode head, int positionToRemove)를 구현하세요.
//        boolean contains(ListNode head, ListNode nodeTocheck)를 구현하세요.

public class ListNode {
    private ListNode next;
    private int value;
    private int size = 0;
    boolean isHead;

    public ListNode() {
        this.next = null;
        this.value = 0;
        this.isHead = true;
    }

    public ListNode(int value) {
        this.value = value;
        this.next = null;
        this.isHead = false;
    }

    public ListNode getNext() {
        return next;
    }

    public int getValue() {
        return this.value;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if (checkIdx(position)) {
            while (--position >= 0) {
                head = head.next;
            }
            nodeToAdd.next = head.next;
            head.next = nodeToAdd;
            size++;
            return nodeToAdd;
        }
        return null;
    }

    private boolean checkIdx(int position) {
        if (position < 0 || size < position)
            throw new IndexOutOfBoundsException("Index: " + position + ", Size: " + size);

        return true;
    }

    public ListNode remove(ListNode head, int positionToRemove) {
        if (checkIdx(positionToRemove)) {
            ListNode delete = head.next, ori = head;
            while (--positionToRemove >= 0) {
                ori = delete;
                delete = delete.next;
            }
            ori.next = delete.next;
            return delete;
        }
        return null;
    }

    public boolean contains(ListNode head, ListNode nodeToCheck) {
        boolean flag = false;
        if (head.isHead)
            head = head.next;

        while (head != null) {
            if (head.equals(nodeToCheck)) {
                flag = true;
                break;
            }
            head = head.next;
        }
        return flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return this.value == listNode.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, value, size);
    }

    private boolean hasNext() {
        if (next != null)
            return true;
        return false;
    }
}
