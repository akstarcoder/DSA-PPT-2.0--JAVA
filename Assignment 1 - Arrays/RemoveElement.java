//Q2. Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 


class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, temp = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}
