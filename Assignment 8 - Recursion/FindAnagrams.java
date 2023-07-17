/*

 **Question 6**
-------------------------
Given two strings s and p, return *an array of all the start indices of* p*'s anagrams in* s. You may return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

**Input:** s = "cbaebabacd", p = "abc"

**Output:** [0,6]

**Explanation:**

The substring with start index = 0 is "cba", which is an anagram of "abc".

The substring with start index = 6 is "bac", which is an anagram of "abc".

/*




class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    int freq1[] = new int[26];
    int freq2[] = new int[26];
    List<Integer> list = new ArrayList<>();
    
    if(s.length()<p.length())
        return list;
    
    for(int i=0; i<p.length(); i++){
        freq1[s.charAt(i)-'a']++;
        freq2[p.charAt(i)-'a']++;
    }
 
    int start=0;
    int end=p.length();
    
    if(Arrays.equals(freq1,freq2))
        list.add(start);
    
    while(end<s.length()){
        
        freq1[s.charAt(start)-'a']--;
        freq1[s.charAt(end)-'a']++;
        
        if(Arrays.equals(freq1,freq2))
        list.add(start+1);
        
        start++;
        end++;
    }
  return list;  
}
        
}
