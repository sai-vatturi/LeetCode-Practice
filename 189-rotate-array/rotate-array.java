class Solution {
    /*

    Bruteforce Solution:
    ===================
        1. Create a rotation loop
        2. Run that loop k times

    Optimized Solution:
    =================
        1. Create a new array of size k
        2. copy last k elements to array
        3. move n - k element to front by k positions
        4. reply first k elements from new array
    */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] copy = new int[k];

        // copy last k elements to array
        for (int i = 0; i < k; i++) {
            copy[i] = nums[n - k + i];
        }
     
        // move elements by k positions
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // copy elements from new array to original array
        for (int i = 0; i < k; i++) {
            nums[i] = copy[i];
        }
    }
}

/*
Bruteforce Soltion:
=================
 public void rotate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            rotateArray(nums);
        }
    }

    public void rotateArray(int[] nums) {
        int n = nums.length;
        int last = nums[n - 1];

        for (int j = n - 1; j > 0; j--) {
            nums[j] = nums[j - 1];
        }

        nums[0] = last;
    }
*/