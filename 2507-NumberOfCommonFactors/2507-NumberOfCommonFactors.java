// Last updated: 08/02/2026, 19:46:40
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int limit;
        if(a<b){
            limit=a;
        }
        else{
            limit=b;
        }
        for(int i=1;i<=limit;i++){
            if(a%i==0&&b%i==0){
                count ++;
            }
        }
        return count;
    }
}