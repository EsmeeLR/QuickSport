public class QuickSort {

    // Método principal de QuickSort
    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(arr, inicio, fin);
            quickSort(arr, inicio, indicePivote - 1); // ordenar la parte izquierda
            quickSort(arr, indicePivote + 1, fin);   // ordena la  parte derecha
        }
    }


}