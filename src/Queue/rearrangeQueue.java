package Queue;

import java.util.*;

 class Main {

    public static void rearrangeQueue(Queue<Integer> q) {

        Queue<Integer> q2 = new LinkedList<>();

        // Step 1: Separate two halves
        int halfLength = q.size() / 2;

        for (int i = 1; i <= halfLength; i++) {
            int element = q.poll();
            q2.offer(element);
        }

        // Step 2: Interleave both halves
        for (int i = 1; i <= halfLength; i++) {

            // Insert first half element
            q.offer(q2.poll());

            // Insert second half element
            q.offer(q.poll());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);

        rearrangeQueue(q);

        System.out.println("Rearranged Queue: " + q);
    }
}
