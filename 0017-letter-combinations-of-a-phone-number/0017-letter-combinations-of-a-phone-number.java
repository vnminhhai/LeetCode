class Solution {
    static HashMap<Character, List<Character>> m = new HashMap<>();
    static {
        m.put('2', List.of('b', 'a', 'c'));
        m.put('3', List.of('d', 'e', 'f'));
        m.put('4', List.of('i', 'h', 'g'));
        m.put('5', List.of('j', 'k', 'l'));
        m.put('6', List.of('o', 'n', 'm'));
        m.put('7', List.of('p', 'q', 'r','s'));
        m.put('8', List.of('t', 'u', 'v'));
        m.put('9', List.of('w', 'x', 'y','z'));
    }
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<String>();
        List<String> q= new LinkedList();
        q.addLast("");
        for (int i=0; i<digits.length(); i++) {
            if (q.getFirst().length()==i) {
                String sb= q.removeFirst();
                for (Character nc : m.get(digits.charAt(i))) {
                    q.addLast(sb+nc);
                }
                --i;
            }
        }
        return q;
    }
}