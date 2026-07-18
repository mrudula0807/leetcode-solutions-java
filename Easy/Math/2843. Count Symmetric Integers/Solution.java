class Solution {
    public int countSymmetricIntegers(int low, int high) {
      
        int count = 0;

        for(int num = low; num <= high; num++){
            int digits = (int)Math.log10(num) + 1;

            if(digits % 2 != 0) continue;

            int half = digits / 2;
            int leftSum = 0, rightSum = 0;

            int temp = num;

            // right half
            for(int i = 0; i < half; i++){
                rightSum += temp % 10;
                temp /= 10;
            }

            // left half
            for(int i = 0; i < half; i++){
                leftSum += temp % 10;
                temp /= 10;
            }

            if(leftSum == rightSum){
                count++;
            }
        }

        return count;
    }
}
