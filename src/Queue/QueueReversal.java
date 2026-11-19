package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class QueueReversal {
    public void ReverseQueue(Queue<Integer> q){

        Deque<Integer> st = new ArrayDeque<>();

        while(!q.isEmpty()){
            int  element = q.poll();
            st.push(element);
        }

        while(!st.isEmpty()){
            int  element = st.poll();
            st.pop();
            q.offer(element);
        }
    }


}
