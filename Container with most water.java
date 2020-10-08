// Problem Link --> https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int area =0;
        int len=height.length;
        int i=0,j=len-1;
        while(i<j)
        {
            int length=Math.min(height[i],height[j]);
            int breadth=j-i;
            int areaNow=length*breadth;
            if(areaNow>area) area=areaNow;
            else if (height[i]<=height[j]) i++;
            else j--;
        }
        return area;
    }
}
