package controller;

import model.ArrayFiller;
import model.Compare;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class BubbleSort {
    //ArrayList<ArrayList<Compare>> arrayList = new ArrayList<>();
    //ArrayList<Compare> compareArrayList = new ArrayList<>();
    //Compare[] compareArray = new Compare[10];
    //ArrayList<Compare[]> stepArray = new ArrayList<>();
    boolean pass = true;

    public void printArrayList(ArrayList<Compare[]> arrayList){
        for(int i = 0; i< arrayList.size();){
            Compare[] temp = new Compare[10];
            temp = arrayList.get(i);
            for(Compare comp: temp){
                System.out.println(comp.getValue());
            }
            arrayList.remove(0);
            if(arrayList.size() == 0){
                break;
            }
        }
    }



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





    public void convertToArray(ArrayList<Compare> arrayList,Compare[] array){
        for(int i = 0; i < arrayList.size(); i++){
            array[i] = arrayList.get(i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Compare[]> stepArray = new ArrayList<>();
        BubbleSort sorter = new BubbleSort();
        ArrayFiller filler = new ArrayFiller();
        Compare[] compareArray = new Compare[10];
        filler.fillArray(10,compareArray);
        filler.fillArray(10,compareArray);
        filler.fillArray(10,compareArray);
        filler.fillArray(10,compareArray);
        sorter.sortArray(compareArray);

    }



}
