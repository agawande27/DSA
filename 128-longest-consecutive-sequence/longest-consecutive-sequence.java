class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int n:hs){
            if(!hs.contains(n-1)){
                int curr=n;
                int count=1;

                while(hs.contains(curr+1)){
                    curr++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
       return longest;
    }
}