class Solution {
    /*
        Bruteforce: 
        -----------
        1. Check if value is positive or negative and make it positive
        2. Extract last digit and add it to the result. multiplty result by 10
        3. return result after making it to it's original sign
    */
    public int reverse(int x) {
        long res = 0;
        boolean neg = (x >= 0) ? false : true;
        x = Math.abs(x);
        while (x > 0) {
            int digit = x % 10;
            res = res * 10 + digit;
            if (res > 2147483647 || res < -2147483648) {
            return 0;
        }
            x = x / 10;
        }
        return (int) res * (neg ? -1 : 1);
    }
}