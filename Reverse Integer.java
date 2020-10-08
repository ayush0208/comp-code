// Problem Link --> https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
        int sign=0;
        if(x<0) sign=1;
        
        long reverse=0;
        if(sign==1) x=-1*x;
        
        while(x>0)
        {
            if(reverse*10>Integer.MAX_VALUE) return 0;
            reverse=reverse*10 + x%10;
            if(reverse>Integer.MAX_VALUE) return 0;
            x=x/10;
        }
        if(sign==1) reverse=-1*reverse;
        return (int)reverse;
    }
}
