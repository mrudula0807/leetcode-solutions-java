class Solution {
    public int maximumValue(String[] strs) {

        int max = 0;

        for(String s : strs){

            boolean isNumeric = true;

            for(char c : s.toCharArray()){
                if(!Character.isDigit(c)){
                    isNumeric = false;
                    break;
                }
            }

            int value = isNumeric ? Integer.parseInt(s) : s.length();

            max = Math.max(max, value);
        }

        return max;
    }
}
