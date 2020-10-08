// Problem Link --> https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    public int myAtoi(String str) {
        
        // trivial case
        if(str.length()<1 || str==null || str.equals("+") || str.equals("-")|| str.equals(" ")) return 0;
        
        char[] ch = str.toCharArray();
        int count=0;
        int digit=0;
        long num=0;
    
        String val = new String("");
        for(int i=0;i<ch.length;i++)
        {
            if(digit==0 && count==0)
            {
                while(str.charAt(i)==32) // whitespace character
                {
                    if(i<=str.length()-2) i++;
                    if(i==str.length()-1) break;
                }
            }
            
            if(digit==0 && str.charAt(i)=='-') count++;
            else if (count==0 && digit==0 && str.charAt(i)=='+')digit++;
            else if (str.charAt(i)=='-' || str.charAt(i)=='+') break;
            else if(count<=1 && Character.isDigit(str.charAt(i)) )
            {
                num=num*10 + str.charAt(i)-'0'; // evaluating the integer
                digit++;
                
                if(num>Integer.MAX_VALUE && count==0 ){
                    num=Integer.MAX_VALUE;
                    break;
                    } 
                if(num>Integer.MAX_VALUE && count==1){
                    num=Integer.MIN_VALUE;
                  break;
                    }
            }
            
            else if (!Character.isDigit(str.charAt(i))) break;
        }
                
        if(count==1 && (num!=Integer.MIN_VALUE || num!=Integer.MAX_VALUE )) num=num*(-1);
        
        return (int)num;
    }
}
