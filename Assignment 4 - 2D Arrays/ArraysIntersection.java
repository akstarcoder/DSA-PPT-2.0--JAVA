/*
Question 1.
Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a sorted array of only the integers that appeared in all three arrays.

Example 1:

Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
Output: [1,5]
Explanation: Only 1 and 5 appeared in the three arrays.
 

Constraints:

1 <= arr1.length, arr2.length, arr3.length <= 1000
1 <= arr1[i], arr2[i], arr3[i] <= 2000
*/

class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        Set<Integer> set1 = toSet(arr1), set2 = toSet(arr2);
        
        List<Integer> rst = new ArrayList<>();
        for (int num : arr3) {
            if (set1.contains(num) && set2.contains(num)) {
                if (rst.size() == 0) rst.add(num);
                else if (rst.size() > 0 && rst.get(rst.size() - 1) != num) rst.add(num);
            }
        }
        return rst;
    }
    
    private Set<Integer> toSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        return set;
    }
}