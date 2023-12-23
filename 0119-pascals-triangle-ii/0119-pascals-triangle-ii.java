class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i=1; i<=numRows+1; i++) {
            Integer[] a= new Integer[i];
            a[0]=1;
            if (i>1) {
                a[i-1]=1;
                for (int j=1; j<i-1; j++) {
                    List<Integer> last = res.get(res.size()-1);
                    a[j]=last.get(j-1)+last.get(j);
                }
            }
            res.add(Arrays.asList(a));
        }
        return res.getLast();
    }
}