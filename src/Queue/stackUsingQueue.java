package Queue;

import java.util.LinkedList;
import java.util.Queue;

class stackUsingQueue {
       Queue<Integer> q1;

       public stackUsingQueue(){
           q1 = new LinkedList<>();


       }
       public void push(int x){
           q1.offer(x);
           int n = q1.size()-1;
           for(int i=0 ; i<n; i++){

             int value = q1.poll();
              q1.offer(value);
           }
       }

    public int pop(){
          return q1.poll();
    }
    public int top(){
        return q1.peek();
    }
    public boolean empty(){
           return q1.isEmpty();
    }
}
