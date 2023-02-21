public class MMUSTLinkedIn {
    
    private Node head;
    private int size;
    
    // Inner class for linked list operations
    private class Node {
        private Object data;
        private Node next;
        
        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Add a new node to the beginning of the list
    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    // Add a new node to the end of the list
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
    
    // Remove the first node from the list and return its data
    public Object removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Object data = head.data;
        head = head.next;
        size--;
        return data;
    }
    
    // Remove the last node from the list and return its data
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
    
    // Get the size of the list
    public int size() {
        return size;
    }
    
    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }
}
Here is an example code for a Stack class using linked list in Java:
java
Copy code
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
    
    // Push a new item onto the stack
    public void push(Object data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    // Pop the top item from the stack and return its data
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }
    
    // Peek at the top item on the stack without removing it
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }
    
    // Get the size of the stack
    public int size() {
        return size;
    }
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }
}
Here is an example code for a Queue class using linked list in Java:
java
Copy code
public class Queue {
    
    private Node head;
    private Node tail;
    private int size;
    
    private class Node {
        private Object data;



amolowashington659@gmail.com

2)Using the linked list concept write a java  program for manipulating a stack.(5Marks)
3)Using a linked list concept write a java program for manipulating a queue.(3Marks)
4) Calculate the time complexity of questions 2 and 3 for each operation.(7Marks)

Here is an example code for a Stack class using linked list in Java:
java
Copy code
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
    
    // Push a new item onto the stack
    public void push(Object data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    // Pop the top item from the stack and return its data
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }
    
    // Peek at the top item on the stack without removing it
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }
    
    // Get the size of the stack
    public int size() {
        return size;
    }
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }
}
Here is an example code for a Queue class using linked list in Java:
java
Copy code
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
    
    // Enqueue a new item to the back of the queue
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
    
    // Dequeue the item at the front of the queue and return its data
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
    
    // Peek at the item at the front of the queue without removing it
    public Object peek() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }
    
    // Get the size of the queue
    public int size() {
        return size;
    }
    
    // Check if the queue is empty
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
