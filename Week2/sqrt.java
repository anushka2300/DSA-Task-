class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int ans=0;
        int s=1,e=x;
        while(s<=e){
            int mid=s+(e-s)/2;
            if((long)mid*mid<=x){
                ans=mid;
                s=mid+1;
            }
             
            else{
                e=mid-1;
            }
        }
            return ans;
             
            
        
        
         
    }
}
