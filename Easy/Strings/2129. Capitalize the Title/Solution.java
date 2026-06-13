class Solution {
    public String capitalizeTitle(String title) {

        StringBuilder sb = new StringBuilder();

        for(String word : title.split(" ")){

            if(sb.length() > 0){
                sb.append(" ");
            }

            word = word.toLowerCase();

            if(word.length() <= 2){
                sb.append(word);
            } else {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1));
            }
        }

        return sb.toString();
    }
}
