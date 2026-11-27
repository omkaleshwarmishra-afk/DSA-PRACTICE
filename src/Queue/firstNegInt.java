package Queue;


import java.util.*;
  class Main2 {

    static List<Integer> firstNegInt(int arr[], int k) {

        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            // Add negative element index
            if (arr[i] < 0) {
                dq.addLast(i);
            }

            // Remove index outside window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Check first negative in window
            if (i >= k - 1) {

                if (dq.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(arr[dq.peekFirst()]);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        List<Integer> result = firstNegInt(arr, k);

        System.out.println(result);
    }
}
