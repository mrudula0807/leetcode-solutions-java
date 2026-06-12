class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        return getNumericValue(firstWord) 
            +   getNumericValue(secondWord) 
            == getNumericValue(targetWord);
    }

    private int getNumericValue(String word) {
        int num = 0;

        for(char c : word.toCharArray()){
            num = num * 10 + (c - 'a');
        }

        return num;
    }
}
