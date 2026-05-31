class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for(String word : words){

            StringBuilder current = new StringBuilder();
            
            for(char c : word.toCharArray()){
                if(c == separator){
                    if(current.length() > 0){
                        result.add(current.toString());
                        current.setLength(0);
                    }
                } else {
                    current.append(c);
                }
            }

            if(current.length() > 0)
                result.add(current.toString());
        }

        return result;
    }
}
