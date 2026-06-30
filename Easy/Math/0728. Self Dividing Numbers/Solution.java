class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();

        while(left <= right){

            int n = left;
            boolean isSelf = true;

            while(n > 0){

                int digit = n % 10;

                if(digit == 0 || left % digit != 0){
                    isSelf = false;
                    break;
                }

                n /= 10;
            }

            if(isSelf){
                list.add(left);
            }
            
            left++;
        }

        return list;
    }
}
