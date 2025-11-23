import java.io.*;
import java.util.Scanner;

public class QuickSortTesting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números:");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Lista original:");
        QuickSort.imprimirArreglo(numeros);

        // Ordenar con QuickSort
        QuickSort.quickSort(numeros, 0, numeros.length - 1);

        System.out.println("Lista ordenada:");
        QuickSort.imprimirArreglo(numeros);

        // Guardar salida en archivo
        QuickSort.guardarEnArchivo(numeros, "salida.txt");
        System.out.println("La lista ordenada se guardó en salida.txt");

        sc.close(); // cerrar Scanner para evitar advertencia
    }
}