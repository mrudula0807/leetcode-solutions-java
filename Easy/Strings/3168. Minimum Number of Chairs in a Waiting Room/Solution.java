class Solution {
    public int minimumChairs(String s) {
        
        int people = 0;
        int maxPeople = Integer.MIN_VALUE;

        for(char c : s.toCharArray()){
            
            if(c == 'E'){
                people++;
            } else {
                people--;
            }

            maxPeople = Math.max(maxPeople, people);
        }

        return maxPeople;
    }
}
