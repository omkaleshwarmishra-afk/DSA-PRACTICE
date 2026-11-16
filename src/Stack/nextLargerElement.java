package Stack;

import java.util.*;
class NextLargerElement {

    public static ArrayList<Integer> nextLargerElement(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            result.add(-1);
        }

        Deque<Integer> st = new ArrayDeque<>();

        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {

            int curr = arr[i];

            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            if (!st.isEmpty()) {
                result.set(i, st.peek());
            }

            st.push(curr);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {6, 8, 0, 1, 3};

        ArrayList<Integer> result = nextLargerElement(arr);

        System.out.println("Next Greater Elements: " + result);
    }
}