class Solution {
    static Character[] a;
    static HashMap<Character, Integer> count;
    public String frequencySort(String s) {
        count= new HashMap<Character, Integer>();
        for (Character c:s.toCharArray()) {
            count.put(c,count.getOrDefault(c,0)+1);
        }
        a=count.keySet().toArray(new Character[count.size()]);
        Arrays.sort(a, (Character x, Character y) -> Integer.compare(count.get(y),count.get(x)));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            for (int j=0; j< count.get(a[i]); j++) {
                sb.append(a[i]);
            }
        }
        return sb.toString();
    }
}