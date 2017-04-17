package model;

/**
 * Bron: Introduction to Java Programming, Comprehensive version
 */
public class MergeSort implements Sorter{
    /** The method for sorting the numbers */

    @Override

    public  boolean sortArray(int[] array, boolean status) {
        boolean isSorted = status;
        if (array.length > 1) {// Merge sort the first half
            int[] firstHalf = new int[array.length / 2];
            System.arraycopy(array, 0, firstHalf, 0, array.length / 2);
            sortArray(firstHalf, isSorted);
            // Merge sort the second half
            int secondHalfLength = array.length - array.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(array, array.length / 2,
                    secondHalf, 0, secondHalfLength);
            sortArray(secondHalf, isSorted);
            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, array);
        }
        return false;
    }
    /** Merge two sorted lists */
    public  void merge(int[] list1, int[] list2, int[] temp){
        int current1 = 0; // Current
        int current2 = 0; // Current
        int current3 = 0; // Current

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }
        while (current1 < list1.length)
            temp[current3++] = list1[current1++];
        while (current2 < list2.length)
            temp[current3++] = list2[current2++];

    }

}