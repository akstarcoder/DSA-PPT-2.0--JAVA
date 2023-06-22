// Q7. Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.


class Solution {
    public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) return;        

    int insertPos = 0;
    for (int num: nums) {
        if (num != 0) nums[insertPos++] = num;
    }        

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
        
    }
}
}
