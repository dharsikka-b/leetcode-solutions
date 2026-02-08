// Last updated: 08/02/2026, 19:46:36
class Solution {
    public int pivotInteger(int n) {
       
            int total =(n*(n+1))/2;
            int s=(int)Math.sqrt(total);
            if((s*s)==total) return s;
            else return -1;
        }
}
