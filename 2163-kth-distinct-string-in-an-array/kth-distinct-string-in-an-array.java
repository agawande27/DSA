class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(hp.get(arr[i])==1){
                k--;
                if(k==0){
                    return arr[i];
                }
            }
        }
        return "";
    }
}