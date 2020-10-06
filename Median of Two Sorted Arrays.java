/*

Problem Link --> https://leetcode.com/problems/median-of-two-sorted-arrays/

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Follow up: The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Example 3:
Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000

Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106

*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      
        // O(n) solution
     /*   int m =nums1.length;
        int n = nums2.length;
        int i=0,j=0;
        double med1=-1,med2=-1;
        
        if((m+n)%2==1){
            for(int iter=0;iter<=(m+n)/2;iter++){
                
                if(i!=m && j!=n)
                    med1 = nums1[i]>nums2[j] ? nums2[j++] : nums1[i++] ;
                
                else if (i<m){
                    med1=nums1[i++];
                }
                else med1=nums2[j++];
            }
            return med1;
        }
        
        else {
            for(int iter=0;iter<=(m+n)/2;iter++){
                med2=med1;
                if(i!=m && j!=n)
                    med1 = nums1[i]>nums2[j] ? nums2[j++] : nums1[i++] ;
                
                else if (i<m){
                    med1=nums1[i++];
                }
                else med1=nums2[j++];
            }
            return (med1+med2)/2;
        }
        */
        
        
    // O(log n) solution
        int m = nums1.length;
        int n = nums2.length;
        int size = m>n ? n : m ;
        float med1=0,med2=0;
        
       /* if(n==0 && m%2==1) return nums1[m/2];
       // System.out.println("Bye");
        if(n==0 && m%2==0) return (nums1[(m/2) -1] + nums1[m/2])/2.0;
        
        if(m==0 && n%2==1) return nums2[n/2];
        if(n==0 && m%2==1) return (nums2[n/2 -1] + nums2[n/2])/2.0;
        */
        
        if(size==m)
        {
            
            int start=0,end=m,half=(m+n+1)/2;
            while(start<=end){
                int a=(start+end)/2;
                int b = half-a;
                if(a<end && nums2[b-1]>nums1[a]) {
                    start=a+1; // go to right subpart
                }
                else if (a>0 && nums1[a-1]>nums2[b]){
                    end=a-1; // go to left subpart
                }
                else {
                    if(a==0) med1=nums2[b-1];
                    else if (b==0) med1 = nums1[a-1];
                    else med1= Math.max(nums1[a-1],nums2[b-1]);
                    
                    if((m+n)%2==1) return med1;
                    
                    if(a==m) med2=nums2[b];
                    else if (b==n) med2 = nums1[a];
                    else med2 = Math.min(nums2[b],nums1[a]);
                    return (med1+med2)/2;
                }
            }
            
        }
        
         else 
        {
            
            int start=0,end=n,half=(m+n+1)/2;
            while(start<=end){
                int a=(start+end)/2;
                int b = half-a;
                if(a<end && nums1[b-1]>nums2[a]) {
                    start=a+1; // go to right subpart
                }
                else if (a>0 && nums2[a-1]>nums1[b]){
                    end=a-1; // go to left subpart
                }
                else {
                    if(a==0) med1=nums1[b-1];
                    else if (b==0) med1 = nums2[a-1];
                    else med1= Math.max(nums2[a-1],nums1[b-1]);
                    
                    if((m+n)%2==1) return med1;
                    
                    if(a==n) med2=nums1[b];
                    else if (b==m) med2 = nums2[a];
                    else med2 = Math.min(nums1[b],nums2[a]);
                    return (med1+med2)/2.0;
                }
            }
            
        }
        return -1;
    }
}
