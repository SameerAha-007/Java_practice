public class Fibonacci {
    static void fib(int n) {
        int p1 = 1;
        int p2 = 0;
        System.out.print(p2 + " ");
        System.out.print(p1 + " ");
        for (int i = 3; i <= n; i++) {
            int curr = p2 + p1;
            p2 = p1;
            p1 = curr;
            System.out.print(curr + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        fib(8);
        fib(9);
    }

}
