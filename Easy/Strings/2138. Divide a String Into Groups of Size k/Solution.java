class Solution {
    public String[] divideString(String s, int k, char fill) {
        int groups = (s.length() + k - 1) / k;

        String[] res = new String[groups];

        int index = 0;

        for(int i = 0; i < s.length(); i+=k){

            if(i + k <= s.length()){
                res[index++] = s.substring(i, i + k);
            } else {
                String last = s.substring(i);

                last += String.valueOf(fill).repeat(k - last.length());

                res[index] = last;
            }
        }

        return res;
    }
}
