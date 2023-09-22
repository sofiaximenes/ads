public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int numeroDeTermos = 10;
        for (int i = 0; i < numeroDeTermos; i++) {
            System.out.println(fibonacci(i));
        }
    }
}