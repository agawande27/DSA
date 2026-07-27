class Solution {
    public int maxProduct(int[] nums) {
        int pre=1;
        int pos=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(pre==0){
                pre=1;
            }
            if(pos==0) pos=1;
            pre=pre*nums[i];
            pos=pos*nums[nums.length-i-1];
            ans=Math.max(ans,Math.max(pre,pos));
        }
        return ans;
    }
}