// Last updated: 08/02/2026, 19:46:48
class Solution {
    public String largestOddNumber(String num) {
    for(int i=num.length()-1;i>=0;i--)
    if((num.charAt(i) -48) %2==1){
        return num.substring(0,i+1);
    }
    return "";
        
    }
}