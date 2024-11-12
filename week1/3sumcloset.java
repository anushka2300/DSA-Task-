import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(sum-target);
                if(diff<min){
                    min=diff;
                    ans=sum;
                }
               

                if(sum<target){
                    j++;
                     while(j<k && nums[j]==nums[j-1]) j++;
                }
                else if (sum>target){
                    k--;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                else{
                    return sum;
                }
            }
        }
         return ans;
    }
}
