// Last updated: 08/02/2026, 19:46:08
class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
        long[]a=new long[n];
        a[0]=0;
        for(int i=1;i<n;i++){
            a[i]=a[i-1]+diff[i-1];
            
        }
        for(int[]r:restrictions){
            int idx=r[0];
            int maxval=r[1];
            a[idx]=Math.min(a[idx],maxval);
            
        }
        for(int i=1;i<n;i++){
            a[i]=Math.min(a[i],a[i-1]+diff[i-1]);
            
        }
        for(int i=n-2;i>=0;i--){
            a[i]=Math.min(a[i],a[i+1]+diff[i]);
            
        }
        long ans=0;
        for(long x:a)ans=Math.max(ans,x);
        return(int)ans;
    }
}