package Queue;


import java.util.*;
class Main4 {

    public static int[] maxSlidingWindow(int[] arr, int k) {

        Deque<Integer> dq = new ArrayDeque<>();

        int n = arr.length;
        int[] ans = new int[n - k + 1];
        int ansIndex = 0;

        // First window
        for (int i = 0; i < k; i++) {

            int element = arr[i];

            while (!dq.isEmpty() && arr[dq.peekLast()] < element) {
                dq.pollLast();
            }

            dq.offerLast(i);
        }

        ans[ansIndex] = arr[dq.peekFirst()];
        ansIndex++;

        // Remaining windows
        for (int i = k; i < n; i++) {

            // Remove elements outside current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Store maximum
            ans[ansIndex] = arr[dq.peekFirst()];
            ansIndex++;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = maxSlidingWindow(arr, k);

        System.out.println(Arrays.toString(result));
    }
}
