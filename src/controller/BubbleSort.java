package controller;

import model.ArrayFiller;
import model.Compare;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class BubbleSort {

    public void sortArray(int [] compareArray){
        int[] check = new int[compareArray.length];
            for (int j = 0; j < compareArray.length - 1; j++) {
                if (compareArray[j] > compareArray[j + 1]) {
                    int temp = compareArray[j];
                    compareArray[j] = compareArray[j + 1];
                    compareArray[j + 1] = temp;
                    check = compareArray;
                    for (int compare : compareArray) {
                        System.out.println(compare);
                    }
                }
            }
    }
}
