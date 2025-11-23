
public class QuickSortTesting {
    public static void main(String[] args) {
        int[] numeros = {99, 2, 28, 31, 8, 74};

        System.out.println("Lista original:");
        QuickSort.imprimirArreglo(numeros);

        QuickSort.quickSort(numeros, 0, numeros.length - 1);

        System.out.println("Lista ordenada:");
        QuickSort.imprimirArreglo(numeros);
    }
}