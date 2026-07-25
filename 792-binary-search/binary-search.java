class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
        
    }
    int bs(int [] arr,int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target>arr[mid]){
            return bs(arr,mid+1,high,target);
        }
        return bs(arr,low,high-1,target);
    }
}