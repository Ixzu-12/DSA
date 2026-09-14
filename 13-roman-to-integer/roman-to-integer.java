import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = mp.get(s.charAt(i));
            int next = (i + 1 < n) ? mp.get(s.charAt(i + 1)) : 0;

            if (current < next) {
                ans -= current;
            } else {
                ans += current;
            }
        }

        return ans;
    }
}