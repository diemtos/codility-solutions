import java.util.*;

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        char[] cA = S.toCharArray();
        int[] pSumA = getPSum('A', cA);
        int[] pSumC = getPSum('C', cA);
        int[] pSumG = getPSum('G', cA);
        
        int start, end;
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            start = P[i];
            end = Q[i] + 1;
            
            if (pSumA[end] - pSumA[start] > 0) result[i] = 1;
            else if (pSumC[end] - pSumC[start] > 0) result[i] = 2;
            else if (pSumG[end] - pSumG[start] > 0) result[i] = 3;
            else result[i] = 4;
        } 
        
        return result;
    }
    
    private int[] getPSum(char c, char[] cA) {
        int[] pSum = new int[cA.length + 1];
        
        if (cA[0] == c) {
            pSum[0] = 1;
        } else {
            pSum[0] = 0;
        }
        
        for (int i = 0; i < cA.length; i++) {
            if (cA[i] == c) {
                pSum[i + 1] = pSum[i] + 1;
            } else {
                pSum[i + 1] = pSum[i];
            }
        }
        
        return pSum;
    }
}
