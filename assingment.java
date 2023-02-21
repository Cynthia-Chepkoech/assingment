public class MMUSTLinkedIn {
    
    private Node head;
    private int size;
    
    
    private class Node {
        private Object data;
        private Node next;
        
        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    
    
    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    
    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    
    
    public Object removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Object data = head.data;
        head = head.next;
        size--;
        return data;
    }
    
    
    public Object removeLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        if (head.next == null) {
            Object data = head.data;
            head = null;
            size--;
            return data;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Object data = current.next.data;
        current.next = null;
        size--;
        return data;
    }
    

    public int size() {
        return size;
    }
    
    
    public boolean isEmpty() {
        return size == 0;
    }
}

public class Stack {
    
    private Node top;
    private int size;
    
    private class Node {
        private Object data;
        private Node next;
        
        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    
    
    public void push(Object data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }
    
    
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }
    
    
    public int size() {
        return size;
    }
    
    
    public boolean isEmpty() {
        return size == 0;
    }
}

public class Queue {
    
    private Node head;
    private Node tail;
    private int size;
    
    private class Node {
        private Object data;




public class Stack {
    
    private Node top;
    private int size;
    
    private class Node {
        private Object data;
        private Node next;
        
        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    
    
    public void push(Object data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }
    
    
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }
    
    
    public int size() {
        return size;
    }
    
    
    public boolean isEmpty() {
        return size == 0;
    }
}

public class Queue {
    
    private Node head;
    private Node tail;
    private int size;
    
    private class Node {
        private Object data;
        private Node next;
        
        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    
    
    public void enqueue(Object data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
    
    
    public Object dequeue() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Object data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }
    
    
    public Object peek() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
Time complexities for each operation in the Stack class:
push(): O(1)
pop(): O(1)
peek(): O(1)
size(): O(1)
isEmpty(): O(1)
Time complexities for each operation in the Queue class:

enqueue(): O(1)
dequeue(): O(1)
peek(): O(1)
size(): O(1)
isEmpty(): O(1)
