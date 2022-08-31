class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        
        traverse(s, start, end);
    }
    
    private void traverse(char[] s, int start, int end){
        if(start >= end || start < 0 || end <= 0) return;
        
        traverse(s, start+1, end-1);
        
        char tmp = s[start];
        s[start] = s[end];
        s[end] = tmp;
    }
}