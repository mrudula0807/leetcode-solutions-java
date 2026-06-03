class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiou";

        for(int i = left; i <= right; i++){
            String word = words[i];

            char start = word.charAt(0);
            char end = word.charAt(word.length() - 1);

            if(vowels.indexOf(start) >= 0 && 
                vowels.indexOf(end) >= 0) {
                count++;
            }
        }

        return count;
    }
}
