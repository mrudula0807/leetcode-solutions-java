class Solution {
    public int findGCD(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int n: nums){
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        
        while(min != 0){
            int temp = min;
            min = max % min;
            max = temp;
        }

        return max;
    }
}
