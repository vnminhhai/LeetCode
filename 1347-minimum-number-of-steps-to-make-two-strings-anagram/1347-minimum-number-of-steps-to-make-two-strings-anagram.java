class Solution {
    public int minSteps(String s, String t) {
        int res=0;
        HashMap<Character, Integer> m = new HashMap<>();
        for (Character c: s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        for (Character c: t.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0)-1);
        }
        for (Integer i: m.values()) {
            if (i>0) res+=i;
        }
        return res;
    }
}