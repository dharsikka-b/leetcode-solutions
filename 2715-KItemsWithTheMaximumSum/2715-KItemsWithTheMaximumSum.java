// Last updated: 08/02/2026, 19:46:30
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) { 
        if(k<=numOnes){
            return k;
        }
        if(k<=numOnes+numZeros){
            return numOnes;
        }
        int negneeded=k-(numOnes+numZeros);
        return numOnes - negneeded;

    }
}