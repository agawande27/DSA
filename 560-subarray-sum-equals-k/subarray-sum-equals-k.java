class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int pref=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            pref+=nums[i];
            int remove=pref-k;
            cnt+=mp.getOrDefault(remove,0);
            mp.put(pref,mp.getOrDefault(pref,0)+1);
        }
        return cnt;
    }
}