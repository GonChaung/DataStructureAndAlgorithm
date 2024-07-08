package test.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertTrue;
import main.Recursion.QuickSort;
import main.Sorting.Sortable;
import main.Sorting.Util;
import org.junit.jupiter.api.Test;
public class SortingTest {
    @Test
    public void quickSortTestWithRandom() {
        int arr[] = Util.getRandomArray(15,1000);
        Util.print("Arr ", arr);
        Sortable algo = new QuickSort();
        algo.sort(arr);
        Util.print("Sorted Array", arr);
        assertTrue(Util.isArraySorted(arr));
    }
    @Test
    public void quickSortTimeComplexityTest() {
        int n = 10000;
        int arr[] = Util.getRandomArray(n, n * 10); // Generating a large array with random numbers
        Sortable algo = new QuickSort();

        long startTime = System.nanoTime();
        algo.sort(arr);
        long endTime = System.nanoTime();

        long durationNano = endTime - startTime;
        double durationMillis = durationNano / 1_000_000.0;
        double durationSeconds = durationNano / 1_000_000_000.0;

        System.out.println("QuickSort Time Complexity Test");
        System.out.println("Array Size: " + n);
        System.out.println("Time Taken: " + durationNano + " nanoseconds");
        System.out.println("Time Taken: " + durationMillis + " milliseconds");
        System.out.println("Time Taken: " + durationSeconds + " seconds");
        assertTrue(Util.isArraySorted(arr));
    }
   @Test
   public void quicSortTest()
   {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{8,3,5,7,1};
       Util.print("Arr ",arr);
       Sortable algo = new QuickSort();
       algo.sort(arr);

       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
   }
    @Test
    public void quicSortBaseCaseTest()
   {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{8,3};
       Util.print("Arr ",arr);
       Sortable algo = new QuickSort();
       algo.sort(arr);

       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
   }
   @Test
    public void quicSortManyCaseTest()
   {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{8,3,9,-1};
       Util.print("Arr ",arr);
       Sortable algo = new QuickSort();
       algo.sort(arr);
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
   }
}
