class Solution {    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    public int numDecodings(String S) {
        map.put(S.length(), 1);
        return helper(S, 0);    
    }
    
    private int helper(String S, int start){
        if(S == null) return 0;
        if(map.containsKey(start)) return map.get(start);
        
        if(S.charAt(start) == '0') return 0;
        
        int ways = 0;
        
        ways += helper(S, start + 1);
        
        if(start + 1 < S.length()){
            int firstDigit = S.charAt(start) - '0';
            int secondDigit = S.charAt(start + 1) - '0';
            int number = firstDigit * 10 + secondDigit;

            if(number <= 26)
                ways += helper(S, start + 2);
        }

        map.put(start, ways);
        return ways;
    }
}