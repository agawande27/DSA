class Solution {
    public String reverseWords(String s) {
        String[] sarr=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<sarr.length;i++){
           char[] word=sarr[i].toCharArray();
            int low=0;
            int high=word.length-1;
            while(low<high){
                char temp=word[low];
                word[low]=word[high];
                word[high]=temp;
                low++;
                high--;
            }
            sb.append(new String(word));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}