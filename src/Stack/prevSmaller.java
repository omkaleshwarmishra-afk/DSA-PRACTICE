package Stack;
import java.util.*;

class PrevSmallerElement {

    public static ArrayList<Integer> prevSmaller(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            result.add(-1);
        }

        Deque<Integer> st = new ArrayDeque<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int curr = arr[i];

            while (!st.isEmpty() && st.peek() >= curr) {
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


        int[] arr = {4, 5, 2, 10, 8};

        ArrayList<Integer> result = prevSmaller(arr);

        System.out.println("Previous Smaller Elements: " + result);
    }
}