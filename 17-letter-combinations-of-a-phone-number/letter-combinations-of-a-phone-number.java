import java.util.ArrayList;
import java.util.List;

class Solution {

    String[] keypad = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        key(digits, 0, "", result);
        return result;
    }

    public void key(String digits, int idx, String current, List<String> result) {
        if (idx == digits.length()) {
            result.add(current);
            return;
        }

        String mapping = keypad[digits.charAt(idx) - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            key(digits, idx + 1, current + mapping.charAt(i), result);
        }
    }
}
       

        
    
