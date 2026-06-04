class Solution {
    public int getLucky(String s, int k) {

        int sum = 0;
        
        for(char c : s.toCharArray()){
            int num = c - 'a' + 1;

            sum += num / 10;
            sum += num % 10;
        }

        k--;

        while(k > 0){

            int tempSum = 0;

            while(sum > 0){
                tempSum += sum % 10;
                sum /= 10;
            }

            sum = tempSum;

            k--;
        }

        return sum;
    }
}
