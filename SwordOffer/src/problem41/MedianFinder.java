package problem41;

import java.util.PriorityQueue;
import java.util.Queue;

class MedianFinder {

    Queue<Integer> big;
    Queue<Integer> small;

    /** initialize your data structure here. */
    public MedianFinder() {
        big = new PriorityQueue<>((x, y) -> y - x);
        small = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (big.size() != small.size()) {
            big.offer(num);
            small.offer(big.poll());
        } else {
            small.offer(num);
            big.offer(small.poll());
        }
    }

    public double findMedian() {
        if (big.size() != small.size()) {
            return big.peek();
        } else {
            return (big.peek() + small.peek()) / 2.0;
        }
    }
}
