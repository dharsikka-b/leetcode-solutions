// Last updated: 08/02/2026, 19:47:14
class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        while(n>=row){
            n-=row;
            row++;
        }
        return row-1;
            
        }
        
    }
