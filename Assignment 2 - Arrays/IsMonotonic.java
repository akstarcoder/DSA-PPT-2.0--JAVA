// Q.7 An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
// monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

class Solution {
    public boolean isMonotonic(int[] arr) {
        if (arr[arr.length-1] < arr[0])
            reverse(arr);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) 
                return false;
        }
        return true;
    }
    
    private void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
