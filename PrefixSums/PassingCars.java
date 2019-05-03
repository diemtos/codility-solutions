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
            passCount++;
        }
        
        return sum;
        
        
        /*
        Map<Integer, Integer> map = new HashMap<>();
        Iterator it;
        Map.Entry<Integer,Integer> curPair;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                // add to map
                map.put(i,0);
            } else {
                // increment map
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    curPair = (Map.Entry) it.next();
                     
                    if (curPair.getKey() < i) {
                        map.put(curPair.getKey(), curPair.getValue() + 1);
                    }
                }
            }
        }
        
        it = map.entrySet().iterator();
        int sum = 0;
        while (it.hasNext()) {
            curPair = (Map.Entry) it.next();
            sum += curPair.getValue();
        }
        
        return sum;
        */
    }
}
