class Solution {
    public String concatHex36(int n) {
        
        return convert(n * n, 16) + convert(n * n * n, 36);
    }

    private String convert(int num, int base){
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder sb = new StringBuilder();

        while(num > 0){

            sb.append(digits.charAt(num % base));
            num /= base;
        }

        return sb.reverse().toString();
    }
}
