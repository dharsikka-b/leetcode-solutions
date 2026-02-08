// Last updated: 08/02/2026, 19:46:31
class Solution {
    public int passThePillow(int n, int time) {
        int cycle=time/(n-1);
        int rem=time%(n-1);
        if (cycle%2==1){
            return n-rem;
        }else{
            return rem+1;
        }
        
    }
}