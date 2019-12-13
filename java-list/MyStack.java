
class LinkedStack implements Stack {

    private int size;
    private Node head;

    public LinkedStack() {
        head = null;
        size = 0;
    }

    private class Node {
        private int value;
        private Node next;
    }

    public void push(int value) {
        Node oldHead = head;
        head = new Node();
        head.value = 1;
        head.next = oldHead;
        size++;
    }

    public int pop() {
        return head.value;
    }
}