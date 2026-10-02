import java.util.List;
class Solution {
    List<String> result = new ArrayList<>();

    public boolean isValid(List<Character> curr) {
        int count = 0;

        for (char ch : curr) {
            if (ch == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }

    public void solve(List<Character> curr, int n) {
        if (curr.size() == 2 * n) {
            if (isValid(curr)) {
                StringBuilder sb = new StringBuilder();
                for (char ch : curr) {
                    sb.append(ch);
                }
                result.add(sb.toString());
            }
            return;
        }

        curr.add('(');
        solve(curr, n);
        curr.remove(curr.size() - 1);

        curr.add(')');
        solve(curr, n);              
        curr.remove(curr.size() - 1);
    }

    public List<String> generateParenthesis(int n) {
        solve(new ArrayList<>(), n);
        return result;
    }
}