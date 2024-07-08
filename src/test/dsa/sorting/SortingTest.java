package test.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertTrue;
import main.Recursion.QuickSort;
import main.Sorting.Sortable;
import main.Sorting.Util;
import org.junit.jupiter.api.Test;
public class SortingTest {
    @Test
    public void quickSortTestWithRandom() {
        int arr[] = Util.getRandomArray(15,100);
        Util.print("Arr ", arr);
        Sortable algo = new QuickSort();
        algo.sort(arr);
        Util.print("Sorted Array", arr);
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
