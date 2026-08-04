class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        String res="";
        for(int i=1;i<s.length();i++){
            int low=i;
            int high=i;
            while(low >= 0 && high < s.length() && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            }
           
            String palin=s.substring(low+1,high);
            if(palin.length()>res.length()){
                res=palin;
            }
            low=i-1;
            high=i;
            while(low >= 0 && high < s.length() && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            }
            
            palin=s.substring(low+1,high);
            if(palin.length()>res.length()){
                res=palin;
            }

        }
        return res;
    }

}