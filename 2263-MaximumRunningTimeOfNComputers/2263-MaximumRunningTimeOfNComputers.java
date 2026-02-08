// Last updated: 08/02/2026, 19:46:43
class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int b : batteries) {
            sum += b;  // total energy available
        }

        long low = 0, high = sum / n;  // maximum possible time is average energy per computer
        long ans = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (canRun(n, batteries, mid)) {
                ans = mid;      // feasible, try longer
                low = mid + 1;
            } else {
                high = mid - 1; // not feasible, try shorter
            }
        }
        return ans;
    }

    private boolean canRun(int n, int[] batteries, long T) {
        long total = 0;
        for (int b : batteries) {
            total += Math.min(b, T);  // each battery contributes at most T
        }
        return total >= (long) n * T; // enough energy to run n computers for T minutes
    }
}