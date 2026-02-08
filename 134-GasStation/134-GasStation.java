// Last updated: 08/02/2026, 19:47:39
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totaltank=0;
        int currtank=0;
        int startstation=0;
        for(int i=0;i<gas.length;i++){
            int gain=gas[i]-cost[i];
            totaltank+=gain;
            currtank+=gain;
            if(currtank<0){
                startstation=i+1;
                currtank=0;

            }
        }
        return totaltank>=0?startstation:-1;
        
    }
}