class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ma=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++){
                ma=Math.max(ma,piles[i]);
        }
        int s=0,e=ma,sp=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ispossible(piles,h,mid)){
                sp=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return sp;
    }
    private static boolean ispossible(int[] piles, int h,int sp){
        int time=0;
        for(int j:piles){
            time+=(double)Math.ceil(j*1.0/(double)sp);
        }
        return time<=h;
    }
}