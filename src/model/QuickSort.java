package model;

import java.util.Arrays;

/**
 * Bron: Introduction to Java Programming, Hoofdstuk 23, blz 872
 */
public class QuickSort {

    public  boolean sortArray(int[] list, boolean status) {
        return quickSort(list, 0, list.length - 1, status);
    }

    public  boolean quickSort(int[] list, int first, int last, boolean status) {
        boolean isSorted = status;
        int[] check = new int[list.length];
        if(isSorted) {
            System.out.println("array is sorted");
        } else {
            for(int x=0; x<=list.length-1; x++ ){
                check[x] = list[x];
            }
            if (last > first) {
                int pivotIndex = partition(list, first, last);
                quickSort(list, first, pivotIndex - 1,isSorted);
                quickSort(list, pivotIndex + 1, last, isSorted);
            }
            if(Arrays.equals(check, list)){
                isSorted = true;
            }
        } return isSorted;
    }
    public  int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search
        if (high > low) {
        // Search forward from left
            while (low <= high && list[low] <= pivot)
                low++;
            // Search backward from right
            while (low <= high && list[high] > pivot)
                high--;
            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > first && list[high] >= pivot)
            high--;
        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
}
