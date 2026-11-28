package Queue;

public int sumOfMinAndMax(int [] arr , int k) {

    int totalSum = 0;
    Deque<Integer> maxDQ = new ArrayDeque<>();
    Deque<Integer> minDQ = new ArrayDeque<>();

    for (int i = 0; i < k; i++) {
        while (!maxDQ.isEmpty() && arr[maxDQ.peekLast()] < arr[i]){
               maxDQ.pollLast();
        }

        while (!minDQ.isEmpty() && arr[minDQ.peekLast()] > arr[i]){
            minDQ.pollLast();
        }
        maxDQ.offer(i);
        minDQ.offer(i);
     }
    totalSum = totalSum + arr[maxDQ.peekFirst()] + arr[minDQ.peekFirst()];

    for(int i =k; i<arr.length; i++){
        // remove
        while (!maxDQ.isEmpty() && maxDQ.peekLast() < i-k){
            maxDQ.pollFirst();
        }

        while (!minDQ.isEmpty() && minDQ.peekLast() > i-k){
            minDQ.pollFirst();
        }
        while (!maxDQ.isEmpty() && arr[maxDQ.peekLast()] < arr[i]){
            maxDQ.pollLast();
        }

        while (!minDQ.isEmpty() && arr[minDQ.peekLast()] > arr[i]){
            minDQ.pollLast();
        }
        maxDQ.offer(i);
        minDQ.offer(i);

        totalSum = totalSum + arr[maxDQ.peekFirst()] + arr[minDQ.peekFirst()];
    }
    return totalSum;
}
