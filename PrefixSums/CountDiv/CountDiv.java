import java.util.*;

class Solution {
    public int solution(int A, int B, int K) {
        int count = 0;
        
        if (A % K == 0) {
            count = 1;
        }
        
        return count + (B/K - A/K);
    }
}
