package main.Recursion;

import main.Sorting.Sortable;

public class QuickSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p -1;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;
        return i+1;
    }

    void quickSort(int[] arr, int p, int r){
        if (p < r) {
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }
}
