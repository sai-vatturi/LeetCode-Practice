class Solution {
    /*
        Two Pointer Approach:
        ====================
        1. Have two points i, j as first and second position in the array
        2. while i and j are same, move j pointer to the front
        3. When they are different, replace nums[i + 1] = j and move i to j and j++

    */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return n;
        }
        
        int i = 0;
        int j = i + 1;

        while (i < n && j < n) {
            while (j < n && nums[i] == nums[j]) {
                j++;
            }

            if (j == n) {
                return i + 1;
            }
            
            nums[i + 1] = nums[j];
            i++;
        }

        return i;
    }
}