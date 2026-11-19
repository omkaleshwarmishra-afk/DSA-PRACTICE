package Queue;

import java.util.*;

public class QueueUsingStack {

    Deque<Integer> s1;
    Deque<Integer> s2;

    public QueueUsingStack() {

        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }

    public void push(int x) {

        while (!s1.isEmpty()) {
            int value = s1.peek();
            s1.pop();
            s2.push(value);
        }

        s1.push(x);

        while (!s2.isEmpty()) {
            int value = s2.peek();
            s2.pop();
            s1.push(value);
        }
    }

    public int pop() {

        if (s1.isEmpty()) {
            return -1;
        }

        return s1.pop();
    }

    public int peek() {

        if (s1.isEmpty()) {
            return -1;
        }

        return s1.peek();
    }

    public boolean isEmpty() {

        return s1.isEmpty();
    }

    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();

        q.push(5);
        q.push(10);
        q.push(20);

        System.out.println("Front: " + q.peek());

        System.out.println("Pop: " + q.pop());

        System.out.println("Front: " + q.peek());

        System.out.println("Is Empty: " + q.isEmpty());
    }
}