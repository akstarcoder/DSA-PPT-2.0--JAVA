*/
💡 **Question 2**

You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

Given the integer n, return *the number of **complete rows** of the staircase you will build*.

**Example 1:**

**Input:** n = 5

**Output:** 2
*/

class Solution {
    public int arrangeCoins(int n) {
        int i = 1; // which row we are on
		while(n > 0){ // checking to see if we have used all our coins
			i++; // increasing our row
			n = n-i; // adding coins to our row
		}
		return i-1; // we return our current row minus one because the last row is our completed row
    }
}

