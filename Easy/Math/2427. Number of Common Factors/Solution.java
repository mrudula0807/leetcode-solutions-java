class Solution {
    public int commonFactors(int a, int b) {
        
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int count = 0;

        for(int i = 1; i <= gcd; i++){
            if(a % i == 0 && b % i == 0){
                count++;
            }
        }

        return count;
    }
}
