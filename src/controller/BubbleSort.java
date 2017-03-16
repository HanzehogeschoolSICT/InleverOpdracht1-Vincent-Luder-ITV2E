package controller;


import model.ArrayFiller;

import java.util.Arrays;

/**
 * Created by Gebruiker on 8-3-2017.
 * Bron gebruikt voor verggelijking: https://www.tutorialspoint.com/javaexamples/arrays_equal.htm
 */
public class BubbleSort{
    boolean isSorted = false;

    public void resetCount(boolean reset){
        isSorted = reset;
    }

    public void autoSort(int[] compareArray){

        while(!isSorted){
            try {
                sortArray(compareArray);

                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void sortArray(int [] compareArray){
        int[] check = new int[compareArray.length];
        if(isSorted) {
            System.out.println("kut");
        } else {
            for(int x=0; x<=compareArray.length-1; x++ ){
                check[x] = compareArray[x];
            }
            for (int j = 0; j < compareArray.length - 1; j++) {
                if (compareArray[j] > compareArray[j + 1]) {
                    int temp = compareArray[j];
                    compareArray[j] = compareArray[j + 1];
                    compareArray[j + 1] = temp;

                }
            }
            if(Arrays.equals(check, compareArray)){
                isSorted=true;
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        ArrayFiller filler = new ArrayFiller();
        int[] array = new int[]{5,2,6,1,3};


        sorter.sortArray(array);
        for(int i =0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
