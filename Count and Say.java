// Problem Link --> https://leetcode.com/problems/count-and-say/

class Solution {
    public String countAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");
        int count=1;
        StringBuilder prev;
        char say;
        for(int i=1;i<n;i++){
            prev=curr;
            count=1;
            curr = new StringBuilder("");
            say=prev.charAt(0);
            for(int j=1;j<prev.length();j++){
                if(say!=(prev.charAt(j))){
                    curr.append(count).append(say);
                    say=prev.charAt(j);
                    count=1;
                } 
                else count++;
                
            }
            curr.append(count).append(say);
        }
        
        return curr.toString();
    }
}
