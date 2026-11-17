package Queue;
import java.util.*;

public class CircularQueue {

    static class main1{
         int[] arr;
         int front;
         int rear;
         int size;

         int capacity;

     // constructor
        public main1(int n){
            arr = new int[n];
            capacity = n;
            size = 0;
            rear = -1;
            front = 0;

        }
        public boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }
            public boolean isFull() {
                if (size == capacity) {
                    return true;
                } else {
                    return false;
                }
            }
                public int getSize(){
                    return this.size;
                }

                public  boolean enqueue(int x){
                    if(isFull()){
                        return false;
                    }
                    else{
                        rear = (rear +1)%capacity;
                        arr[rear] = x;
                        size++;
                        return true;
                    }
        }
        public int dequeue(){
            if(isEmpty()){
                return -1;
            }
            else{
                int removedElement = arr[front];
                front = (front +1)%capacity;
size--;
return  removedElement;
            }
        }

        public int getFront(){
            if(isEmpty()){
                return -1;
            }
            else{
                return arr[front];
            }
        }


    }

    public static void main(String[] args){

        main1 q = new main1(3);

        System.out.println(q.enqueue(10));
        System.out.println(q.enqueue(20));
        System.out.println(q.enqueue(30));

        System.out.println("Front : " +q.getFront());
        System.out.println("Rear : " +q.getSize());
    }
}
