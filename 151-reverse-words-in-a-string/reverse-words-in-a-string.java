class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split(" +");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}