class Solution {
    public String digitSum(String s, int k) {
        int n = s.length();
        while (n > k) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i += k) {
                int sum = 0;
                int end = Math.min(i + k, n );

                for (int j = i; j < end; j++) {
                    sum += s.charAt(j) - '0';
                }
                result.append(sum);
            }
            s = result.toString();
            n=s.length();

        }
        return s;


    }
}