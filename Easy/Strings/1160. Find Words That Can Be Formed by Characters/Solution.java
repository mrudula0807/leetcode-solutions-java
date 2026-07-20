class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int[] avl = new int[26];

        for(char c : chars.toCharArray()){
            avl[c - 'a']++;
        }

        int length = 0;

        for(String word : words){

            int[] freq = new int[26];

            for(char c : word.toCharArray()){
                freq[c - 'a']++;
            }

            boolean valid = true;

            for(int i = 0; i < 26; i++){

                if(freq[i] > avl[i]){
                    valid = false;
                    break;
                }
            }

            if(valid){
                length += word.length();
            }
        }

        return length;
    }
}
