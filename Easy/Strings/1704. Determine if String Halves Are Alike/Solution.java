class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        
        int left = 0;
        int right = s.length() / 2;

        while(right < s.length()){

            if(isVowel(s.charAt(left))){
                count++;
            }

            if(isVowel(s.charAt(right))){
                count--;
            }

            left++;
            right++;
        }

        return count == 0;
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || 
            c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' ||
            c == 'O' || c == 'U';
    }
}
