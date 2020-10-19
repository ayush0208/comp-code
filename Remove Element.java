// Problem Link --> https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        while(j<nums.length)
        {
            while(i<nums.length && nums[i]!=val)i++;
            j=i+1;
            while(j<nums.length && nums[j]==val) j++;
            if(i<nums.length && j<nums.length) swap(i,j,nums);
            i++;
        }
        int count=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==val) break;
            count++;
        }
        return count;
        
    }
    
    public void swap(int i,int j, int[] nums)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
