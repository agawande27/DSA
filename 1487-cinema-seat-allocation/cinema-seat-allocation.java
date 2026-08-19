class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int[] seat :reservedSeats){
            hm.putIfAbsent(seat[0],new ArrayList<>());
            hm.get(seat[0]).add(seat[1]);
        }
        int count=(n-hm.size())*2;

        for(int row:hm.keySet()){
            boolean left=true;
            boolean right=true;
            boolean middle=true;

            for(int seat :hm.get(row)){
                if(seat>=2 && seat<=5){
                    left=false;
                }
                if(seat>=4 && seat<=7){
                    middle=false;
                }
                if(seat>=6 && seat<=9){
                    right=false;
                }
            }
            if(left && right){
                count+=2;
            }else if(left || middle || right){
                count++;
            }
        }
        return count;
    }
}