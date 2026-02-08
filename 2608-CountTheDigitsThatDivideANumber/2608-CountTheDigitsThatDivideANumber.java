// Last updated: 08/02/2026, 19:46:33
class Solution {
    public int countDigits(int num) {
        int copy=num;
        int dig;
        int count=0;
        while(copy!=0){
            dig=copy%10;
            if(num%dig==0){
                count ++;
            }
            copy/=10;

        }
        return count;
        
    }
}