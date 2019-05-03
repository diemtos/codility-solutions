import java.util.*;

class Solution {
    public int solution(int[] A) {
        double minAvg = (A[0] + A[1]) / 2;
        int minInd = 0;
        double curAvg;
        
        for (int i = 0; i < A.length - 2; i++) {
            
            curAvg = (A[i]+A[i+1])/2.0;
            if (minAvg > curAvg) {
                minAvg = curAvg;
                minInd = i;
            }
            
            curAvg = (A[i]+A[i+1]+A[i+2])/3.0;
            if (minAvg > curAvg) {
                minAvg = curAvg;
                minInd = i;
            }
        }
        
        curAvg = ( A[A.length - 1] + A[A.length -2] ) / 2.0;
        if (minAvg > curAvg) {
            minAvg = curAvg;
            minInd = A.length - 2;
        }
        
        return minInd;
    }
}
