public class QuickSortTesting {
    public static void main(String[] args) {
        int[] numeros = {34, 7, 23, 32, 5, 62};

        System.out.println("Lista original:");
        QuickSort.imprimirArreglo(numeros);

        QuickSort.quickSort(numeros, 0, numeros.length - 1);

        System.out.println("Lista final ordenada:");
        QuickSort.imprimirArreglo(numeros);
    }
}