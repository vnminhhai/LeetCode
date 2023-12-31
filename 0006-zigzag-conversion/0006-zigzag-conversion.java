class Solution {
    public String convert(String inputString, int numRows) {
        if (numRows == 1) return inputString;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, inputString.length()); i++) {
            rows.add(new StringBuilder());
        }

        int direction = -1;
        int currentRow = 0;

        for (char c : inputString.toCharArray()) {
            rows.get(currentRow).append(c);
            currentRow += (direction == -1) ? 1 : -1;

            if (currentRow == 0 || currentRow == numRows - 1) {
                direction = -direction;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}