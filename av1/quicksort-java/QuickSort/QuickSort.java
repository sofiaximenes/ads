import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static List<Integer> quicksort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }

        List<Integer> sortedLeft = quicksort(left);
        List<Integer> sortedRight = quicksort(right);

        List<Integer> sortedArray = new ArrayList<>();
        sortedArray.addAll(sortedLeft);
        sortedArray.add(pivot);
        sortedArray.addAll(sortedRight);

        return sortedArray;
    }

    public static void main(String[] args) {
        List<Integer> arrayDesordenado = new ArrayList<>();
        arrayDesordenado.add(6);
        arrayDesordenado.add(1);
        arrayDesordenado.add(8);
        arrayDesordenado.add(4);
        arrayDesordenado.add(9);
        arrayDesordenado.add(2);
        arrayDesordenado.add(5);

        List<Integer> arrayOrdenado = quicksort(arrayDesordenado);
        System.out.println("Array ordenado: " + arrayOrdenado);
    }
}
