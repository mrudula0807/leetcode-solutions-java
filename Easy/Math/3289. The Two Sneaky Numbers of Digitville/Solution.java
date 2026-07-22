class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int[] res = new int[2];

        Set<Integer> set = new HashSet<Integer>();

        int i = 0;

        for(int n: nums){

            if(set.contains(n)){
                res[i++] = n;
            }
            
            set.add(n);
        }

        return res;
    }
}
