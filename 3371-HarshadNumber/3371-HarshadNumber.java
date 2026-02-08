// Last updated: 08/02/2026, 19:46:11
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int copy=x;
        int n;
        int sum=0;
        while(copy!=0){
            n=copy%10;
            sum=n+sum;
            copy/=10;


        }
        if(x%sum==0){
            return sum;
        }else return -1;
    }
}