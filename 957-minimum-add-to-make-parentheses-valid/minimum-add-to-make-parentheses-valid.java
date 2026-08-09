class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'){
                if(count>0){
                    count--;
                }
                else{
                    count2++;
                }
            }
        }
        return count+count2;
    }
}