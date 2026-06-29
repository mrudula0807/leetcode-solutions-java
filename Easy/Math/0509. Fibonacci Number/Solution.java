class Solution {
    public int fib(int n) {
      
        if(n <= 1)
            return n;

        int fn2 = 0, fn1 = 1;

        for(int i = 2; i <= n; i++){
            int fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }

        return fn1;
    }
}
