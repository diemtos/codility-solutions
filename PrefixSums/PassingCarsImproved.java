import java.util.*;

class Solution {
    public int solution(int[] A) {
        // Max heap
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                pQueue.add(i);
            }
        }
        
        int sum = 0;
        Iterator itr = pQueue.iterator();
        int lastInd = A.length - 1;
        int passCount = 0;
        while (itr.hasNext()) {
            sum += lastInd - (int) itr.next() - passCount;
            
            if (sum > 1000000000) {
                return -1;
            }
            
            passCount++;
        }
        
        return sum;
    }
}
