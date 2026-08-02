import java.util.*;

class Solution {
    public int solve(List<Integer> arr) {
        int n = arr.size();
        
        if (n == 1) return arr.get(0);

        int prev = arr.get(0);

        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int pick = arr.get(i);
            if (i > 1) pick += prev2;

            int nonPick = prev;
            int cur_i = Math.max(pick, nonPick);
            prev2 = prev;
            prev = cur_i;
        }
        return prev;
    }

    public int rob( int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0];

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (i != 0) arr1.add(arr[i]);
            if (i != n - 1) arr2.add(arr[i]);
        }

        return Math.max(solve(arr1), solve(arr2));
    }
}