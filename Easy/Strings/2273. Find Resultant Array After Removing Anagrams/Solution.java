class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        String prev = words[0];

        List<String> list = new ArrayList<>();
        list.add(prev);

        for(int i = 1; i < words.length; i++){

            String current = words[i];

            if(!isAnagram(prev, current)){
                list.add(current);
                prev = current;
            }
        }

        return list;
    }

    private boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        int[] freq = new int[26];

        for(char c : a.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c : b.toCharArray()){
            freq[c - 'a']--;
        }

        for(int f : freq){
            if(f != 0)
                return false;
        }

        return true;
    }
}
