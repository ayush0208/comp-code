// Problem Link --> https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return 1;
        int len=nums.length;
        int val=nums[0];
        int i=1;
        while(i<len)
        {
            while(i<len && nums[i]==nums[i-1])i++;
            if(i<len) nums[++ans]=nums[i];
            i++;
        }
        
        return ans+1;
    }
}
