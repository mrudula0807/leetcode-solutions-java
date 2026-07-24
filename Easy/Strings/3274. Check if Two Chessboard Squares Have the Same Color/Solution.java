class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        return color(coordinate1) == color(coordinate2);
    }

    private boolean color(String coordinate){

        int col = coordinate.charAt(0) - 'a' + 1;
        int row = coordinate.charAt(1) - '0';

        return (row + col) % 2 == 0;
    }
}
