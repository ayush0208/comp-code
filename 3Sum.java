// Problem Link --> https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=len-1;i>=2;i--){
            int j=0,k=i-1;
            int target = 0-nums[i];
            while(j<k){
                if(nums[j]+nums[k] > target)
                {
                    k--;
                }
                else if (nums[j]+nums[k] < target)
                {
                    j++;
                }
                else 
                {
                    List<Integer> lt = new ArrayList<Integer>();
                    lt.add(nums[i]);
                    lt.add(nums[j]);
                    lt.add(nums[k]);
                    Collections.sort(lt);
                    st.add(lt);
                    j++;
                    k--;
                }
            }
        }
        ans.addAll(st);
        return ans;
    }
}
