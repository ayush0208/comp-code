// Problem Link --> https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo=0,hi=nums.length-1;
        if(nums[hi]<target) return hi+1;
        int ans=0;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target) return mid;
            else if (nums[mid]<target)
            {
                
                lo=mid+1;
            }
            else 
            {
                ans = mid;
                hi=mid-1;
            }
                
        }
        return ans;
    }
}
