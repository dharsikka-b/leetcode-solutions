// Last updated: 08/02/2026, 19:47:11
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
            for(int j=1;j<n;j++){
                if(nums[i]<nums[(i+j)%n]){
                    res[i]=nums[(i+j)%n];
                    break;
                }
            }
        }
        return res;
        
    }
}