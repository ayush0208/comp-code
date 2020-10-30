// Problem Link --> https://leetcode.com/problems/implement-strstr/

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) 
        {
            for (int j = 0; ; j++) 
            {
              if (j == needle.length()) return i; // index is found in haystack
              if (i + j == haystack.length()) return -1; // needle is not found in the haystack
              if (needle.charAt(j) != haystack.charAt(i + j)) break; // break out of current loop
            }
        }
    }
}
