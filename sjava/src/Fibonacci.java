public class Fibonacci {
    // using dynamic programming bottom up approch
    public static int fib(int x) {
        int[] f = new int[x+1];
        f[0] = 0;
        f[1] = 1;
        for(int i=2; i < x+1; i++) {
            f[i] = f[i-2] + f[i-1];
        }
        return f[x];
    }
}
