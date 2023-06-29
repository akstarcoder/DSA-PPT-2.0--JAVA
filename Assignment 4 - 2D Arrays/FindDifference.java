/*
💡 **Question 2**

Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

- answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
- answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.

**Note** that the integers in the lists may be returned in **any** order.

**Example 1:**

**Input:** nums1 = [1,2,3], nums2 = [2,4,6]

**Output:** [[1,3],[4,6]]
*/

class Solution {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();                           // create 2 hashsets
		Set<Integer> set2 = new HashSet<>();
		for(int num : nums1){ set1.add(num); }                         // add nums1 elements to set1
		for(int num : nums2){ set2.add(num); }                         // add nums2 elements to set2
		
		List<List<Integer>> resultList = new ArrayList<>();             // Initialize result list with 2 empty sublists that we will return
		resultList.add(new ArrayList<>());
		resultList.add(new ArrayList<>());

		for(int num : set1){                                            // just iterate to all elements of set1
			if(!set2.contains(num)){ resultList.get(0).add(num); }      // add those elements to first sublist of result list, which are not in set2.
		}
		for(int num : set2){                                            // just iterate to all elements of set2
			if(!set1.contains(num)){ resultList.get(1).add(num); }      // add those elements to first sublist of result list, which are not in set1
		}
		return resultList;
	}
}


