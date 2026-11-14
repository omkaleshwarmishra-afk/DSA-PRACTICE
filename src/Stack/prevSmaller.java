package Stack;

public static ArrayList<Integer> prevSmaller(int[] arr) {
    // code here
    ArrayList <Integer> result = new ArrayList<>();

    for(int i =0; i<arr.length; i++){
        result.add(-1);
    }
    Deque<Integer> st = new ArrayDeque<>();

    int n = arr.length;
    for(int i =0 ; i<n ; i++){
        int curr = arr[i];
        while( !st.isEmpty() && st.peek() >= curr){
            //useless
            st.pop();
        }
        if(!st.isEmpty()){
            result.set(i, st.peek());
        }
        st.push(curr);
    }
    return result;
}