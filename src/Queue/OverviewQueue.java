package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class OverviewQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
         // check size
        System.out.println("Size of queue" + queue.size());
        queue.offer(20);
         // front -> 10
        //rear ->20
        System.out.println("front me element konsa hai " +queue.peek());

        queue.offer(30);

        System.out.println("Removed element = " +queue.poll());
        System.out.println("size" +queue.size());
    }

}
