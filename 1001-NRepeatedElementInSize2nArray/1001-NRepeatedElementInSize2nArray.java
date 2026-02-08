// Last updated: 08/02/2026, 19:47:07
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer>a=new HashSet<>();
        for(int n:nums){
            if(a.contains(n)){
                return n;
            }
            else{
                a.add(n);
            }
        }
        return -1;


        
    }
}