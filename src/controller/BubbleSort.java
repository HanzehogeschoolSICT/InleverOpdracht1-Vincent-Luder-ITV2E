package controller;

import model.Compare;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class BubbleSort {

    //ArrayList<Compare> compareArrayList = new ArrayList<>();
    //Compare[] compareArray = new Compare[10];



    public void sortArray(Compare [] compareArray){


        boolean nextPass = true;

        for(int k = 1; k < compareArray.length && nextPass; k++){
            nextPass = false;

            for (int j = 0; j < compareArray.length -k; j++){
                if(compareArray[j].compareTo(compareArray[j+1]) == -1){
                    Compare temp = compareArray[j];
                    compareArray[j] = compareArray[j +1];
                    compareArray[j+1] = temp;

                    nextPass = true;
                }
            }
        }

    }

    public void convertToArray(ArrayList<Compare> arrayList,Compare[] array){
        for(int i = 0; i < arrayList.size(); i++){
            array[i] = arrayList.get(i);
        }
    }


}
