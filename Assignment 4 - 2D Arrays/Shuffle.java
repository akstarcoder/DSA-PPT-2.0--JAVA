/*
💡 **Question 8**


Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

*Return the array in the form* [x1,y1,x2,y2,...,xn,yn].

**Example 1:**

**Input:** nums = [2,5,1,3,4,7], n = 3

**Output:** [2,3,5,4,1,7]

**Explanation:** Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

*/


class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int len = nums.length;
		
		// to store the pair of numbers in right half of the original array
        for(int i = n; i < len; i++) {
            nums[i] = (nums[i] * 1024) + nums[i - n];
        }
        
        int index = 0;
		// to retrive values from the pair of numbers and placing those retrieved value at their desired position
        for(int i = n; i < len; i++, index += 2) {
            nums[index] = nums[i] % 1024;
            nums[index + 1] = nums[i] / 1024;
        }
        
        return nums;
    }
}