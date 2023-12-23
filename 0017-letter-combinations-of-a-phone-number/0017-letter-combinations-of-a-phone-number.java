class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<String>();
        HashMap<Character, List<Character>> m = new HashMap<>();
        m.put('2', new ArrayList<>(Arrays.asList('b', 'a', 'c')));
        m.put('3', new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        m.put('4', new ArrayList<>(Arrays.asList('i', 'h', 'g')));
        m.put('5', new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        m.put('6', new ArrayList<>(Arrays.asList('o', 'n', 'm')));
        m.put('7', new ArrayList<>(Arrays.asList('p', 'q', 'r','s')));
        m.put('8', new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        m.put('9', new ArrayList<>(Arrays.asList('w', 'x', 'y','z')));
        Queue<String> q= new LinkedList();
        q.offer("");
        List<String> res=new ArrayList<>();
        for (int i=0; i<digits.length(); i++) {
            if (q.peek().length()==i) {
                String sb= q.poll();
                for (Character nc : m.get(digits.charAt(i))) {
                    q.offer(sb+nc);
                }
                --i;
            }
        }
        while (!q.isEmpty()) res.add(q.poll());
        return res;
    }
}