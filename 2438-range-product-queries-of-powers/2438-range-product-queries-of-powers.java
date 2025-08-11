class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> powers = new ArrayList<>();
        int currentPower = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                powers.add(currentPower);
            }
            currentPower*=2;
            n=n>>>1;
        }
        int[] result = new int[queries.length];

        for (int i=0; i<queries.length; i++) {
            long temp = 1;
            for (int j=queries[i][0]; j<=queries[i][1]; j++) {
                temp = (temp * powers.get(j)) % 1000000007;
            }
            result[i] = (int) temp;
        }
        return result;
    }
}