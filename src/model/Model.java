package model;


public class Model {
    private int arrayLimit = 50;
    private int[] array = new int[arrayLimit];
    private boolean isSorted = false;
    private ArrayFiller filler = new ArrayFiller();

    private BubbleSort bubbleSorter = new BubbleSort();
    private InsertionSort insertionSorter = new InsertionSort();
    private QuickSort quickSorter = new QuickSort();
    private MergeSort mergeSorter = new MergeSort();


    public int[] getArray(){
        return array;
    }

    public boolean getStatus(){
        return isSorted;
    }

    public void setSorted(boolean bool){
        isSorted = bool;
    }

    public void resetCount(boolean reset){
        isSorted = reset;
    }

    public void generate(){
        filler.fillArray(arrayLimit,array);
    }

    public void bubbleSortStep(boolean isAuto){
        if(isAuto){
            setSorted(bubbleSorter.autoSort(array, isSorted));
        }
        else{
            setSorted(bubbleSorter.sortArray(array, isSorted));
        }
    }

    public void quickSortStep(boolean isAuto){
        if(isAuto){
            setSorted(quickSorter.autoSort(array, isSorted));
        }
        else{
            setSorted(quickSorter.sortArray(array, isSorted));
        }
    }

    public void mergeSortStep(boolean isAuto){
        if(isAuto){
            //setSorted(mergeSorter.autoSort(array, isSorted));
        }
        else{
            setSorted(mergeSorter.sortArray(array, isSorted));
        }
    }

    public void insertionSortStep(boolean isAuto){
        if(isAuto){
            setSorted(insertionSorter.autoSort(array, isSorted));
        }
        else{
            setSorted(insertionSorter.sortArray(array, isSorted));
        }
    }
}
