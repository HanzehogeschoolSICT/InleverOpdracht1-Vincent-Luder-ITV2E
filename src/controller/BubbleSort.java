package controller;

import model.ArrayFiller;
import model.Compare;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class BubbleSort {

    public void sortArray(Compare [] compareArray){


            for (int j = 0; j < compareArray.length -1; j++) {

                if (compareArray[j].compareTo(compareArray[j + 1]) == -1) {
                    Compare temp = compareArray[j];
                    compareArray[j] = compareArray[j + 1];
                    compareArray[j + 1] = temp;

                    for(Compare compare : compareArray){
                        System.out.println(compare.getValue());
                    }
                }
            }
        }
    }
