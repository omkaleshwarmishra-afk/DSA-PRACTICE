import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    static class MyStack{
        // private data member
        private int [] arr;
        private int capacity;
        private int top ;


        public MyStack(int capacity) {

            this.capacity = capacity;
            this.arr = new int[capacity];
            this.top = -1;
        }

        public void push(int value){

            if(top == capacity-1){
                System.out.println("overflow");

            }
            else{
                top++;
                arr[top] = value;
            }

        }
        public void pop(){
            if(top == -1){
                System.out.println("underflow");
                return;
            }
            else{
                arr[top] =  -1;
                top--;

            }

        }
        public int peek(){
            if(top == -1){
                System.out.println("no element");
                return -1;
            }
            else{
                 return arr[top] ;
            }

        }
        public int getSize(){
            return this.capacity;

        }

    }

    public static void main(String[] args){

        MyStack st = new MyStack(3);

        st.push(10);
        System.out.println("Stack ka Size " +st.getSize() );

        st.push(20);
        System.out.println("Stack ka Size " +st.getSize() );

        st.push(30);
        System.out.println("Stack ka Size " +st.getSize() );




//
//        Deque<Integer> st = new ArrayDeque<>();
//
//        st.push(10);
//        st.push(20);
//        st.push(30);
//
////        System.out.println("Stack Size :" +st.size());
//
//        st.pop();
//        System.out.println("Stack ka TOP "  +st.peek());
//        System.out.println("Stack size:"  +st.size());
//
//        System.out.println(st.isEmpty());
        }
  }