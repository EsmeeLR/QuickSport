public class QuickSort {

    // Método principal de QuickSort
    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(arr, inicio, fin);
            quickSort(arr, inicio, indicePivote - 1); // ordenar parte izquierda
            quickSort(arr, indicePivote + 1, fin);   // ordenar parte derecha
        }
    }

    // Función para dividir el arreglo según el pivote
    private static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin]; // último elemento como pivote
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivote) {
                i++;
                // intercambio
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

    }
}