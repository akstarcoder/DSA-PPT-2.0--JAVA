/*

**Question 7**
-------------------------
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

**Example 1:**

**Input:** s = "3[a]2[bc]"

**Output:** "aaabcbc"
/*



class Solution {
    
    int i = 0;
    public String decodeString(String s) {
    StringBuilder sb = new StringBuilder();
    int count = 0;
    String tmp_string = "";
    
    while (i < s.length()) {
        char c = s.charAt(i);
        i++;
        
        if (c == '[') {
            tmp_string = decodeString(s); // do subproblem
            for (int j = 0; j < count; j++) {
                sb.append(tmp_string);
            }
            count = 0; // reset counter
        } else if (c == ']') { // subproblem complete
            break;
        } else if (Character.isAlphabetic(c)) {
            sb.append(c);
        } else {
            count = count * 10 + c - '0';
        }
    }
    
    return sb.toString();
}
    }
