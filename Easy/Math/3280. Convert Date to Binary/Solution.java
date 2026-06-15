class Solution {
    public String convertDateToBinary(String date) {

        String[] parts = date.split("-");
        
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        String y = toBinary(year);
        String m = toBinary(month);
        String d = toBinary(day);
        
        return y + "-" + m + "-" + d;

    }

    private String toBinary(int n){
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            sb.append(n % 2);
            n /= 2;
        }

        return sb.reverse().toString();
    }
}
