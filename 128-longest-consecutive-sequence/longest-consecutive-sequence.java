class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        int lastSm=Integer.MIN_VALUE;
        int cnt=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSm){
                cnt++;
                lastSm=nums[i];
            }
            else if(nums[i]!=lastSm){
                cnt=1;
                lastSm=nums[i];
            }
            longest=Math.max(longest,cnt);
         
    }
       return longest;
    }
}