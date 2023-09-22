public class Somatorio {
    public static int somatorio(int[] arr) {
        int soma = 0;

        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }

        return soma;
    }

    public static void main(String[] args) {
        int[] conjuntoDeNumeros = {1, 2, 3, 4, 5};
        int resultadoSoma = somatorio(conjuntoDeNumeros);
        System.out.println("O somatório do conjunto é: " + resultadoSoma);
    }
}
