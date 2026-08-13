class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int totalsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int ri=cardPoints.length-1;
        totalsum=lsum;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[ri];
            ri--;
        totalsum=Math.max(totalsum,lsum+rsum);
        }
        return totalsum;
    }
    
}