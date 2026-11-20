package Queue;

import java.util.*;

public class reverseFirstK {

    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {

        if (k > q.size() || k < 0) {
            return q;
        }

        Deque<Integer> st = new ArrayDeque<>();
        int n = q.size();

        // Step 1: Push first K elements into stack
        for (int i = 1; i <= k; i++) {
            int element = q.poll();
            st.push(element);
        }

        // Step 2: Add stack elements back to queue
        while (!st.isEmpty()) {
            int element = st.peek();
            st.pop();
            q.offer(element);
        }

        // Step 3: Move remaining N-K elements to the back
        for (int i = 1; i <= (n - k); i++) {
            int element = q.poll();
            q.offer(element);
        }

        return q;
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        int k = 3;

        reverseFirstK(q, k);

        System.out.println(q);
    }
}