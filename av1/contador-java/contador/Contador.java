public class Contador {
    public static int Contador(Object[] arr) {
        int contador = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Object[] array = {1, 2, 3, 4, 5, 1.5, "texto", true, -3};
        int numerosInteiros = Contador(array);
        System.out.println("O array contém " + numerosInteiros + " números inteiros.");
    }
}
