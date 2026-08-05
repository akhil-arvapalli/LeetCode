class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int[] e : invocations)
            adj.get(e[0]).add(e[1]);

        List<Integer> lst = new ArrayList<>();
        boolean[] vis = new boolean[n];

        int node = k;
        dfs(node, adj, vis, lst);

        for (int[] e : invocations) {
            if (!vis[e[0]] && vis[e[1]]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++)
                    ans.add(i);
                return ans;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (!vis[i])
                ans.add(i);

        return ans;
    }

    private void dfs(int node, List<List<Integer>> adj, boolean[] vis, List<Integer> lst) {
        vis[node] = true;
        lst.add(node);

        for (int it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, adj, vis, lst);
            }
        }
    }
}