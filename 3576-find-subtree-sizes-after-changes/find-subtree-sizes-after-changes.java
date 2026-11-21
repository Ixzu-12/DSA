import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    private HashMap<Integer, List<Integer>> map = new HashMap<>();
    private int[] resultsize;
    private int[] last;

    public void dfs(int currentNode, String s, int[] parent) {
        int c = s.charAt(currentNode) - 'a';
        int nearestancestor = last[c];
        last[c] = currentNode;
        for (int child : map.getOrDefault(currentNode, Collections.emptyList())) {
            dfs(child, s, parent);
        }
        last[c] = nearestancestor;
        if (currentNode != 0) {
            int newParent = parent[currentNode];
            if (nearestancestor != -1) {
                newParent = nearestancestor;
            }
            parent[currentNode] = newParent;
            resultsize[newParent] += resultsize[currentNode];

        }
    }

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        for (int i = 0; i < n; i++) {
            int u = parent[i];
            int v = i;
            map.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        }
        resultsize = new int[n];
        Arrays.fill(resultsize, 1);
        last = new int[26];
        Arrays.fill(last, -1);
        dfs(0, s, parent);

        return resultsize;

    }
}