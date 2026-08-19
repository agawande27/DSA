class Solution {
    public int largestInteger(int[] nums, int k) {  
         int[] freq = new int[51];
        for (int i = 0; i <= nums.length - k; i++) {
            for (int j = i; j < i + k; j++) {
                boolean already = false;

                for (int x = i; x < j; x++) {
                    if (nums[x] == nums[j]) {
                        already = true;
                        break;
                    }
                }

                if (!already) {
                    freq[nums[j]]++;
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                ans = i;
            }
        }

        return ans;
    }
}