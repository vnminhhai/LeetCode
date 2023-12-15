class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> m = new HashMap<>();
        for (int i=0; i<paths.size(); i++) {
            m.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        String c = paths.get(0).get(0);
        while (m.get(c)!=null) {
            c=m.get(c);
        }
        return c;
    }
}