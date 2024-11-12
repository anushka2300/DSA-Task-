
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int []arr=new int[2];
        arr[0]=arr[1]=-1;
        while(s<=e){
            int mid=(e+s)/2;
            if(nums[mid]==target){
             int left = mid;
            while (left > 0 && nums[left - 1] == target) {
                left--;
            }
            int right=mid;
            while(right <nums.length-1 && nums[right+1]==target){
                right++;
            }
            arr[0]=left;
            arr[1]=right;
                     break;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return arr;

    }
}