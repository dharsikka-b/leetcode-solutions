// Last updated: 08/02/2026, 19:46:10
class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        int rem;
        for (int num : nums) {
            rem = num % 3;
            if (rem != 0) {
                operations += 1;
            }
        }
        return operations;
    }
}