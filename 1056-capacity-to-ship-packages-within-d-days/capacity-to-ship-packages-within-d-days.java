class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=maxi(weights);
        int high=sum(weights);
        while(low<=high){
            int mid=(low+high)/2;
            int cofdays=getDay(weights,mid);
            if(cofdays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int sum(int[] w){
        int s=0;
        for(int i=0;i<w.length;i++){
            s+=w[i];
        }
        return s;
    }
    public int maxi(int[] w){
        int max=w[0];
        for(int i=0;i<w.length;i++){
            if(w[i]>max){
                max=w[i];
            }
        }
        return max;
    }
    public int getDay(int[] w,int mid){
        int days=1;
        int load=0;
        for(int i=0;i<w.length;i++){
            if(load+w[i]>mid){
                load=w[i];
                days++;
            }
            else{
                load+=w[i];
            }
        }
        return days;
    }
}