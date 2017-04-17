package model;


import helper.ArrayFiller;

public class Model {
    private int[] array = new int[50];
    private boolean isSorted = false;


    private BubbleSort bubbleSorter = new BubbleSort();
    private InsertionSort insertionSorter = new InsertionSort();
    private QuickSort quickSorter = new QuickSort();
    private MergeSort mergeSorter = new MergeSort();


    public int[] getArray() {
        return array;
    }

    public boolean getStatus() {
        return isSorted;
    }

    public void setSorted(boolean bool) {
        isSorted = bool;
    }

    public void resetCount(boolean reset) {
        isSorted = reset;
    }

    public void generate() {
        ArrayFiller.fillArray(array);
    }

    public void bubbleSortStep() {


        setSorted(bubbleSorter.sortArray(array, isSorted));
    }

    public void quickSortStep() {

        setSorted(quickSorter.sortArray(array, isSorted));

    }

    public void mergeSortStep() {
        setSorted(mergeSorter.sortArray(array, isSorted));

    }

    public void insertionSortStep() {
        setSorted(insertionSorter.sortArray(array, isSorted));

    }
}
