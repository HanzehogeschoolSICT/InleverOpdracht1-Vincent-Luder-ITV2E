package controller;

/**
 * Created by Gebruiker on 14-3-2017.
 */
public class InsertionSort {
    //int[] array = new int[5];
    int[] temp = new int[5];
    public void fillArray(int[] array){

        array[0] = 2;
        array[1] = 9;
        array[2] = 5;
        array[3] = 4;
        array[4] = 8;
    }

    public void insertionSort(int[] array){

        for (int i = 1; i < array.length; i++) {
            int sortValue = array[i];
            int j = i;
            if (j > 0 && array[j - 1] > sortValue) {
                array[j] = array[j - 1];
                j--;
                for(int compare : array){
                    System.out.println(compare);
                }
            }
            array[j] = sortValue;
        }

    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] array = new int[5];

        sorter.fillArray(array);

        sorter.insertionSort(array);
       // sorter.insertionSort(array);
        for(int i : array){
            System.out.println(i);
        }
    }

}
