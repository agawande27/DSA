class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ls.add(getRow(i));
        }
        return ls;
        
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls=new ArrayList<>();
        long ans=1;
        ls.add((int)ans);
        for(int i=1;i<=rowIndex;i++){
            ans=ans*(rowIndex-i+1);
            ans=ans/i;
            ls.add((int)ans);
        }
        return ls;
    }
}