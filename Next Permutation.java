// Problem Link --> https://leetcode.com/problems/next-permutation/

class Solution {
    public void nextPermutation(int[] nums) {
            int i=0;
            int len=nums.length;
        int count=0;
        for(i=len-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                i--;
                count=1;
                break;
            } 
        }
        if(i>=0)
        {
            int j=len-1;
            while(j>=i && nums[j]<=nums[i]) j--;
            if(j>=i)swap(nums,i,j);
        }
        if(count==0)i=-1;
        reverse(nums,i+1);       
        
    }
    public void swap(int[] nums, int i, int j){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
        return;
    }
    
    public void reverse(int[] nums, int i){
        int start=i,end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
        return;
    }
}
