class Solution {
    public class Node
    {
        public ArrayList<Node> destination = new ArrayList<>(); 
    }
    static Node[] nodes;
    static HashSet<Node> visited;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (edges.length==0) return true;
        nodes= new Node[n];
        visited = new HashSet<>();
        for (int i=0; i<n; i++) {
            nodes[i]=new Node();
        }
        
        for (int[] edge: edges) {
            nodes[edge[0]].destination.add(nodes[edge[1]]);
            nodes[edge[1]].destination.add(nodes[edge[0]]);
        }
        return recurse(nodes[source], nodes[destination]);
    }
    public boolean recurse(Node s, Node d) {
        visited.add(s);
        if (s.destination.contains(d)) return true;
        for (Node n : s.destination) {
            if (!visited.contains(n))
            if (recurse(n,d)) return true;
        }
        return false;
    }
}