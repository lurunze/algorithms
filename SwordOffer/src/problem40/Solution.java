package problem40;

import java.util.PriorityQueue;

/**
 * 大顶堆
 */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int i = 0; i < k; i++) {
            priorityQueue.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (priorityQueue.peek() > arr[i]) {
                priorityQueue.poll();
                priorityQueue.offer(arr[i]);
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = priorityQueue.poll();
        }
        return res;
    }
}
