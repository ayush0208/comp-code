/*

Problem Link --> https://leetcode.com/problems/longest-substring-without-repeating-characters/

Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Constraints:
0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // O (n cube)
        /*
        if(s.length()<2) return s.length();
        int ans=0,k=0;
        for(int i=0;i<s.length()-1;i++){
            HashMap<Character,Integer> hm = new HashMap<>();
            int len=0;
            for(int j=i;j<s.length();j++){
                if(hm.containsKey(s.charAt(j))){
                    break;
                }
                else {
                    hm.put(s.charAt(j),1);
                    len++;
                    if(len>ans) ans=len;
                }
            }
        }
        
        return ans;
        */
        
        // O(n square)
        
        if(s.length()<2) return s.length();
        int i=0,j=0;
        int len = s.length();
        int ans=1;
        
        Set<Character> st = new HashSet<>();
        while (i<len && j<len){
            if(st.contains(s.charAt(j)))
            {
                st.remove(s.charAt(i));
                i++;
                
            }
            else {
                
                ans = Math.max(ans,j-i+1);
                st.add(s.charAt(j));
                j++;
            }
        }
        return ans;
    }
}
