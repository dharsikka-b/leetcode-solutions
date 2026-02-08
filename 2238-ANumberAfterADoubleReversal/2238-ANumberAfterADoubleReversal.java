// Last updated: 08/02/2026, 19:46:44
class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0)
            return true;
        return num % 10 != 0;
    }
}