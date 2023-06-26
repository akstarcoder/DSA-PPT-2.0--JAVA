// Q.3 We define a harmonious array as an array where the difference between its maximum value
// and its minimum value is exactly 1.
// Given an integer array nums, return the length of its longest harmonious subsequence
// among all its possible subsequences.
// A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

class Solution {
    public int findLHS(int[] nums) {
       if(nums.length == 0){
           return 0;
       }
        Arrays.sort(nums);
        int left = 0, right = 1;
        int ArrayLen = 0;
        while(right < nums.length){
            int diff = nums[right]-nums[left];
            if(diff==1){
                ArrayLen = Math.max(ArrayLen, right-left+1);
            }
            if(diff <= 1){
                right++;
            }else{
                left++;
            }
        }
        return ArrayLen;
    }
}
