class Solution {
    public String makeSmallestPalindrome(String s) {
        
        char[] arr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            char min = (char) Math.min(arr[left], arr[right]);

            arr[left] = min;
            arr[right] = min;

            left++;
            right--;
        }

        return new String(arr);
    }
}
