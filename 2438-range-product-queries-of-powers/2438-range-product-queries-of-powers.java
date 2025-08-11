class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int[] powers = getPowers(n);
        long[] result = new long[queries.length];

        for (int i=0; i<queries.length; i++) {
            result[i] = 1;
            for (int j=queries[i][0]; j<=queries[i][1]; j++) {
                result[i]*= (int) Math.pow(2,powers[j]);
                result[i] %= 1000000007;
            }
        }
        return Arrays.stream(result).mapToInt(i -> (int) i).toArray();
    }

    public int[] getPowers(int n) {
        ArrayList<Integer> powers = new ArrayList<>();
        int currentPower = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                powers.add(currentPower);
            }
            currentPower++;
            n=n>>>1;
        }
        return powers.stream().mapToInt(i -> i).toArray();
    }
}