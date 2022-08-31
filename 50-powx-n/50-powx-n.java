class Solution {
    public double myPow(double x, int n) {
        // Handle integer overflow
        long n_long = n;
        return pow(x, n_long);
    }
    
    public double pow(double x, long n_long) {
        // Negative case
        if(n_long < 0){
            x = 1/x;
            n_long = Math.abs(n_long);
        }
        
        // Base cases
        if(n_long == 0) return 1;
        
        // calculate half of n_log
        double result = pow(x, n_long/2);
        
        // moltiply n_log * n_log to have the final result
        // x^10 = x^5 * x^5
        result *= result;
        
        // odd exponent: x^5 -> x^2 * x^2 * x = x^4 * x = x^5
        // even exponent: x^4 -> x^2 * x^2 = x^4
        return n_long % 2 == 0 ? result : result * x;
    }
}