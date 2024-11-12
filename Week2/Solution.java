/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution {
        public int firstBadVersion(int n) {
            int s=1,e=n;
             int mid=0;
            while(s<e){
                  mid=s+(e-s)/2;
                if(isBadVersion(mid)){  
                    e=mid;
                }
                else {
                    s=mid+1;
                }
            }
            return s;
            
        }
    }