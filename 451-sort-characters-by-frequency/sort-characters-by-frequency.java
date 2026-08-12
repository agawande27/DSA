class Solution {
    public String frequencySort(String s) {
        int[] fre=new int[128];
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)]++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int max=0;
            int ind=0;
            for(int j=0;j<128;j++){
                if(fre[j]>max){
                    max=fre[j];
                    ind=j;
                }
            }
            for(int k=0;k<max;k++){
                sb.append((char)ind);
            }
            fre[ind]=0;
        }
        return sb.toString();
    }
}