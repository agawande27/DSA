class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
        int n=s.length();
        while(true){
            if(sb.toString().equals(goal)){
                return true;
            }
            char c=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            n--;
            if(n==0 ){
                break;
            }
        }
        return false;
    }
}