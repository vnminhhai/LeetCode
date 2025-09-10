class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> traversedNodes = new HashSet<>();
        Map<Integer,Integer> countMap = new HashMap<>();

        for (int i=0; i<friendships.length; i++) {
            int currentNode = friendships[i][0]-1;
            if (!traversedNodes.contains(currentNode)) {
                for (int j=0; j<languages[currentNode].length; j++) {
                    countMap.compute(languages[currentNode][j], (key, value) -> value == null ? 1 : value + 1);
                }
                traversedNodes.add(currentNode);
            }

            currentNode = friendships[i][1]-1;
            if (!traversedNodes.contains(currentNode)) {
                for (int j=0; j<languages[currentNode].length; j++) {
                    countMap.compute(languages[currentNode][j], (key, value) -> value == null ? 1 : value + 1);
                }
                traversedNodes.add(currentNode);
            }
        }

        return traversedNodes.size() - countMap.values().stream().max((a,b)->a-b).orElse(traversedNodes.size());
    }
}