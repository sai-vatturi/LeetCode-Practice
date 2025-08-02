class Solution {
    /*
        BruteForce:
        ===========
        1. Have a pointer K and traverse through the array using modulo to go back to front
        2. The above checks if array is rotated.
        3. If it is rotated more than 1 time, then it is not sorted
    */
    public boolean check(int[] nums) {
        int n = nums.length;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                k++;
            }

            if (k > 1) {
                return false;
            }
        }

        return true;
    }
}