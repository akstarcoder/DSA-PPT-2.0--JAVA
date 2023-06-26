//Q.1 Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2),..., 
// (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.


class Solution {
public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int result = 0;
    for(int itr = 0; itr < nums.length; itr += 2){
        result += nums[itr];
    }
    return result;
}
}



