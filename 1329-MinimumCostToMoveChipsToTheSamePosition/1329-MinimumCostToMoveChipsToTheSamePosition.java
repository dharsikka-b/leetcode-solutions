// Last updated: 08/02/2026, 19:46:58
class Solution {
    public int minCostToMoveChips(int[] p) {
        int oddcount=0;
        int evencount=0;
        for(int i:p){
            if(i%2==0){
                evencount++;

            }else{
                oddcount++;
            }
        }return Math.min(oddcount,evencount);
        
    }
}