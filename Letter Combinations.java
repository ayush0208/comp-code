// Problem Link --> https://leetcode.com/problems/letter-combinations-of-a-phone-number/

 class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> lt = new LinkedList<>();
        if(digits.length()<=0) return lt;
        lt.add("");
        if(digits==null) return lt ;
        
        String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i=0;i<digits.length();i++)
        {
            // extracting the strings equal to length of digits parsed
                 while(lt.peek().length()==i)
           {
                String s=lt.remove();
                for(char c: map[digits.charAt(i)-'0'].toCharArray())
                {
                    lt.add(s+c);
                }
            }           
         }
        return lt;
    }
}
