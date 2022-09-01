class Solution {    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    public int numDecodings(String s) {
        map.put(s.length(), 1);
        return helper(s, 0);    
    }
    
    private int helper(String s, int start){
        if(s == null) return 0;
        
        // Cached or end of the string
        if(map.containsKey(start)) return map.get(start);
        
        // Base case
        if(s.charAt(start) == '0') return 0;
        
        int ways = 0;
        
        // 1 digit case
        ways += helper(s, start + 1);
        
        // 2 digit case
        if(start + 1 < s.length()){
            // It return the number casted to int
            int firstDigit = s.charAt(start) - '0';
            int secondDigit = s.charAt(start + 1) - '0';

            // first digit is more singificant so we have to multiply
            // "12" -> firstDigit = 1, firstDigit = 2
            
            // number = 1*10 + 2 = 10 + 2 = 12
            int number = firstDigit * 10 + secondDigit;

            if(number <= 26)
                ways += helper(s, start + 2);
        }

        map.put(start, ways);
        return ways;
    }
}