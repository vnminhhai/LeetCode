class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long ma=mass;
        Arrays.sort(asteroids);
        for (int a:asteroids) {
            if (ma<a) return false;
            else ma+=a;
        }
        return true;
    }
}