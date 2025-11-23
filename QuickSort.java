public class QuickSort {

    // Método principal de QuickSort
    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(arr, inicio, fin);

            // Mostrar el estado del arreglo después de cada partición
            System.out.print("Partición con pivote en posición " + indicePivote + ": ");
            imprimirArreglo(arr);

            quickSort(arr, inicio, indicePivote - 1); // ordenar parte izquierda
            quickSort(arr, indicePivote + 1, fin);   // ordenar parte derecha
        }
    }

    // Método para dividir el arreglo según el pivote
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

        // colocar el pivote en su posición correcta
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1;
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}