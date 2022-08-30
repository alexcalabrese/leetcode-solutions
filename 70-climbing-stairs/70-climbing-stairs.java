class Solution {
    // Tabulation
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
    
    // Recursive + Memoization (Top Down Approach)
//     public int climbStairs(int n) {
//         HashMap<Integer, Integer> memo = new HashMap<>();
        
//         memo.put(0,1);
//         memo.put(1,1);
        
//         return climbStairs(n, memo);
//     }
    
//     private int climbStairs(int n, HashMap<Integer, Integer> memo) {
//         if(memo.containsKey(n)) 
//             return memo.get(n);
//         else
//             memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        
//         return memo.get(n);
//     }
}