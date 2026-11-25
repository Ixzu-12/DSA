
import java.util.HashMap;

class Solution {
    int MOD = 1_000_000_007;
    int base = 100001;

    public boolean check(int nums[], int size, int base) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        long hash = 0;
        long p = 1;

        for (int k = 0; k < size - 1; k++) {
            p = (p * base) % MOD;
        }

        int i = 0;
        int j = 0;

        while (j < n) {
            hash = (hash * base + nums[j]) % MOD;

            if (j - i + 1 < size) {
                j++;
            } else {
                int h = (int) hash;
                map.put(h, map.getOrDefault(h, 0) + 1);

                if (map.get(h) == 1) {
                    // Keep processing all windows:
                    // a later occurrence may invalidate uniqueness.
                }

                hash = (hash - (long) nums[i] * p % MOD + MOD) % MOD;

                i++;
                j++;
            }
        }

        for (int count : map.values()) {
            if (count == 1) {
                return true;
            }
        }

        return false;
    }

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        int l = 1;
        int r = n;
        int result = n;
        int base = 100001;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (check(nums, mid, base)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }
}
