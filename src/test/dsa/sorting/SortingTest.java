package test.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import main.Recursion.MergeSort;
import main.Sorting.Sortable;
import main.Sorting.Util;
import org.junit.jupiter.api.Test;
public class SortingTest {
    @Test
    public void mergeSortTestWithRandom() {
        int arr[] = Util.getRandomArray(15,100);
        Util.print("Arr ", arr);
        Sortable algo = new MergeSort();
        algo.sort(arr);
        Util.print("Sorted Array", arr);
        assertTrue(Util.isArraySorted(arr));
    }
   @Test
   public void mergeSortTest()
   {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{8,3,5,7,1};
       Util.print("Arr ",arr);
       Sortable algo = new MergeSort();
       algo.sort(arr);

       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
   }
    @Test
    public void mergeSortBaseCaseTest()
   {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{8,3};
       Util.print("Arr ",arr);
       Sortable algo = new MergeSort();
       algo.sort(arr);

       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
   }
   @Test
    public void mergeSortManyCaseTest()
   {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{8,3,9,-1};
       Util.print("Arr ",arr);
       Sortable algo = new MergeSort();
       algo.sort(arr);
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
   }
}
