// Last updated: 08/02/2026, 19:46:05
class Solution {
    public boolean canAliceWin(int[] nums) {
            int single=0;
            int doubl=0;
        
        for(int i=0;i<nums.length;i++){
        
        if(nums[i]<10)
        {
            single+=nums[i];
            
        }else{
            doubl+=nums[i];
        }

        }
        if(single!=doubl)
        {
            return true;
            
        }else{
            return false;
        }
    }
}