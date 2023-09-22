public class MDC {
    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int numero1 = 36;
        int numero2 = 48;
        int resultadoMDC = mdc(numero1, numero2);
        System.out.println("O MDC de " + numero1 + " e " + numero2 + " é " + resultadoMDC);
    }
}