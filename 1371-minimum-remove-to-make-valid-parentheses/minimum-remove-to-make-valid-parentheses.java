class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                sb.append(s.charAt(i));
            }else 
            if(s.charAt(i)==')'){
                if(count>0){
                count--;
                sb.append(s.charAt(i));
                }
            }
            else{
            sb.append(s.charAt(i));
            }
        }
        for(int j=sb.length()-1;j>=0  && count>0;j--){
                if(sb.charAt(j)=='('){
                    sb.deleteCharAt(j);
                    count--;
                }
            }
        return sb.toString();
    }
}