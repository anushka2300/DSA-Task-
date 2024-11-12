class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int s=0;
        int e=n*m-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int r=mid/n;
            int c=mid%n;
            if(target==matrix[r][c]){
                return true;
            }
            else if(target>matrix[r][c]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
        
    }
}