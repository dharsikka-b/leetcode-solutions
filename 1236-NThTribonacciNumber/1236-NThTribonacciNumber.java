// Last updated: 08/02/2026, 19:47:00
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1)return 1;
        if(n==2) return 1;
        int a=0,b=1,c=1;
        int tribo=0;
        for(int i=3;i<=n;i++){
            tribo=a+b+c;
            a=b;
            b=c;
            c=tribo;
        }return tribo;
        
    }
}