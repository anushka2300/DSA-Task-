import java.util.*;
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        int ans[][]=new int[n/3][3];
        int empty[][]=new int[0][0];
        int part=n/3;
        Arrays.sort(nums);
        int c=n-1,r=0;
        for(int i=n-1;i>=0;i=i-3){
            
            if(Math.abs(nums[i]-nums[i-2])>k){
                System.out.println("yes");
                return empty;
            }

            for(int j=0;j<3;j++){
                ans[r][j]=nums[c];
                c--;
            }
            r++;
        }

         
               
       return ans;
        
    }
}