class Solution {
    static HashMap<Character,String> map;
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\s");
        map = new HashMap<>();

        if (pattern.length()!=words.length) return false;
        for (int i=0; i< pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else if (map.containsValue(words[i])) {
                for (Character c: map.keySet()) {
                    if (!c.equals(pattern.charAt(i)) && map.get(c).equals(words[i])) {
                        return false;
                    }
                }
            }
             else map.put(pattern.charAt(i), words[i]);
        }
        return true;
    }
}