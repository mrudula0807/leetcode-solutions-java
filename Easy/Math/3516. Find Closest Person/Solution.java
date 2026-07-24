class Solution {
    public int findClosest(int x, int y, int z) {
        
        int distance1 = Math.abs(x - z);
        int distance2 = Math.abs(y - z);

        return distance1 == distance2 ? 0 : (distance1 < distance2 ? 1 : 2);
    }
}
