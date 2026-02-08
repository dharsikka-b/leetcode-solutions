// Last updated: 08/02/2026, 19:46:14
class Solution {
    public int distanceTraveled(int mainTank, int addTank) { 
        int total=0;

    while(mainTank>=5){
       total=total+50;
       mainTank-=5;
       if(addTank>=1){
        mainTank ++;
        addTank--;
       }
    }
    return total+(mainTank*10);
    
    }
}
