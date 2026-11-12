package Stack;
import java.util.*;

class Solution1 {
    public ArrayList<Integer> nextSmallerElement(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(-1);
        }

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                result.set(i, st.peek());
            }

            st.push(arr[i]);
        }

        return result;
    }
}