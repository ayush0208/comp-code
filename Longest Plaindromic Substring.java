// Problem Link --> https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    public String longestPalindrome(String s) {
        
        // TC, SC - O(n square)
        if(s.length()<2) return s;
        int len=1;
        int start=0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i=0;i<s.length();i++)
        {
            dp[i][i]=true;
            start=i;
            len=1;
        }
        for (int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==s.charAt(i)) 
            {
                dp[i-1][i]=true;
                start=i-1;
                len=2; 
            }
                
        }
               
       for(int l=3;l<=s.length();l++)
       {
            for(int i=0;i<s.length()-l+1;i++)
            {
                int j=i+l-1;
                if(dp[i+1][j-1]==true && s.charAt(i)==s.charAt(j)) 
                {
                    dp[i][j]=true;
                    if(l>len) 
                    {
                        start=i;
                        len=l;
                    }

                }
            }             
        }
        
               String ans = new String("");
               for(int i=start;i<start+len;i++)
               ans+=s.charAt(i);
               
               return ans;
               
        
    }
}
