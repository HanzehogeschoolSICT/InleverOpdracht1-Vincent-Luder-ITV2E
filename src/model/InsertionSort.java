package model;

import java.util.Arrays;

/**
 * Created by Gebruiker on 14-3-2017.
 */
public class InsertionSort {

    public boolean autoSort(int[] compareArray, boolean status){
        boolean isSorted = status;
        while(!isSorted){
            try {
                isSorted = sortArray(compareArray, isSorted);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return isSorted;
    }


    public boolean sortArray(int[] array, boolean status){
        boolean isSorted = status;
        int[] check = new int[array.length];
        if(isSorted) {
            System.out.println("array is sorted");
        } else {
            for(int x=0; x<=array.length-1; x++ ){
                check[x] = array[x];
            }
            for (int i = 1; i < array.length; i++) {
                int sortValue = array[i];
                int j = i;
                if (j > 0 && array[j - 1] > sortValue) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = sortValue;
            }
            if(Arrays.equals(check, array)){
                isSorted = true;
            }
        } return isSorted;
    }
}
