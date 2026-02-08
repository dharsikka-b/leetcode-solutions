// Last updated: 08/02/2026, 19:46:02
class Solution {
    public int minLength(int[] nums, int k) {
        Map<Integer,Integer>freq=new HashMap<>();
        int left=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            if(freq.getOrDefault(nums[right],0)==0){
                sum+=nums[right];
                
            }
            freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);
            while(sum>=k){
                ans=Math.min(ans,right-left+1);
                freq.put(nums[left],freq.get(nums[left])-1);
                if(freq.get(nums[left])==0){
                    sum-=nums[left];
                    freq.remove(nums[left]);
                    
                }
                left++;
                
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
        
    }
}