class Solution {
    public int numberOfMatches(int n) {
        
        //each match eliminates one team. 
        //to go from n teams to 1, total eliminations would be n - 1
        //number of eliminations = number of matches required
        
        return n - 1;
    }
}
