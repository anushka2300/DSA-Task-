class Solution {
    public int maxArea(int[] height) {
        int h=height.length-1;
        int l=0;
        int maxA=Integer.MIN_VALUE;
        int area=0;
        while(l<=h){
            area=Math.min(height[l],height[h])*(h-l);
            maxA=Math.max(maxA,area);

            if(height[l]<height[h]){
                l++;
            }
            else{
                h--;
            }
        }
    
        return maxA;
    }
}


// 1 8 8 8 8 8 8 8 8
// 7 7 8 8 8 8 8 8 8 
// 1 7 8 8 8 8 8 8 8 
// 0 