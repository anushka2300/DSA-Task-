class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length;
        while(s<e){
            int mid=s+(e-s)/2;
            if(letters[mid]<=target  ){
                   s=mid+1;
            }
             
            else{
                e=mid;
            }
        }
        if(s>=letters.length){
        return letters[0];
        }
        return letters[s];
    }
}