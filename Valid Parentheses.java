// Problem Link --> https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(') st.push(')');
            else if(s.charAt(i)=='[') st.push(']');
            else if(s.charAt(i)=='{') st.push('}');
            else
            {
                if(st.isEmpty()) return false;
                char c = st.pop();
                if(c!=s.charAt(i)) return false;
            }            
        }
        
        return st.isEmpty();
    }
}
