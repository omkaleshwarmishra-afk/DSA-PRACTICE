import java.util.Stack;

public class CheckStackSortedOrNot {

    public static boolean isSorted(Stack<Integer> st) {
//        Stack<Integer> temp = new Stack<>();
//        boolean sorted = true;
//
//        while (!st.isEmpty()) {
//            int current = st.pop();
//
//            if (!temp.isEmpty() && current > temp.peek()) {
//                sorted = false;
//            }
//
//            temp.push(current);
//        }
//
//        while (!temp.isEmpty()) {
//            st.push(temp.pop());
//        }
//
//        return sorted;

        if (st.size() <= 1) {
            return true;
        }

        int prevElement = st.peek();
        st.pop();

        int currElement = st.peek();

        boolean ekCaseKaAns = prevElement <= currElement;

        boolean recursion = isSorted(st);

        st.push(prevElement);

        boolean finalAns = ekCaseKaAns && recursion;

        return finalAns;
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Stack is sorted: " + isSorted(st));
    }
}