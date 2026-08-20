class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
        for(int j=n;j<nums.length;j++){
            arr.add(nums[i]);
            arr.add(nums[j]);
            i++;
            if(i==n){
                break;
            }
        }
        int[] result = new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            result[k] = arr.get(k);
        }
        return result;
    }
}