package model;


/**
 * Created by Niek on 17-3-2017.
 */
public class Model {
    private int arrayLimit = 50;
    private int[] array = new int[arrayLimit];
    private boolean isSorted = false;
    private ArrayFiller filler = new ArrayFiller();

    private BubbleSort bubbleSorter = new BubbleSort();
    private InsertionSort insertionSorter = new InsertionSort();


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

    public void insertionSortStep(boolean isAuto){
        if(isAuto){
            setSorted(insertionSorter.autoSort(array, isSorted));
        }
        else{
            setSorted(insertionSorter.sortArray(array, isSorted));
        }
    }
}
