// Problem Link --> https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int ans=0;
        int diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1,k=nums.length-1;
            sum=target-nums[i];
            while(j<k)
            {
                int val=nums[j] + nums[k];
                if(Math.abs(sum-val)<diff) // updating the difference value
                {
                    diff=Math.abs(sum-val);
                    ans = nums[i]+ val;
                    if(diff==0) return target;
                    
                }
                
                // for moving the left and right pointers 
                if(val<sum) j++; 
                else k--;
            }
        }
        
        return ans;
    }
}
