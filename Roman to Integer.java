// Problem Link --> https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        char[] ch = s.toCharArray();
        int val=0;
        if(ch.length==0) return 0;
        if(ch.length==1) return hm.get(ch[0]);
        
        int last=hm.get(ch[0]);
        val+=last;
        for(int i=1;i<ch.length;i++){
            // adding only if the current value is greater than previous value,
            // otherwise subtract previous value two times from total sum
            int curr = hm.get(ch[i]);
            if(last<curr) val=val-last+curr-last;
            else val+=curr;
            last=curr;     
        }
        
        return val;
        
        
    }
}
