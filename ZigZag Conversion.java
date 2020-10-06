// Problem Link --> https://leetcode.com/problems/zigzag-conversion/

class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        List<StringBuilder> lt = new LinkedList<>();
        
        for(int i=0;i<Math.min(numRows,s.length());i++)
            lt.add(new StringBuilder());
        
        int curRow=0;
        boolean down=false;
        
        for(char c : s.toCharArray()){
            lt.get(curRow).append(c);
            if(curRow==0 || curRow==numRows-1) down=!down;
            curRow+=down?1:-1;
        }
        
        StringBuilder ans = new StringBuilder();
        for(StringBuilder t:lt)
            ans.append(t);
        
        
        return ans.toString();
    }
}
