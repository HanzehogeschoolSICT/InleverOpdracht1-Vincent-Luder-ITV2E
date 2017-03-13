package controller;

import model.Compare;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class BubbleSort {
    ArrayList<ArrayList<Compare>> arrayList = new ArrayList<>();
    //ArrayList<Compare> compareArrayList = new ArrayList<>();
    //Compare[] compareArray = new Compare[10];

    public void printArrayList(){
        for(int i = 0; i< arrayList.size();i++){
            ArrayList<Compare> temp = new ArrayList<>();
            temp = arrayList.get(i);
            for(Compare comp: temp){
                System.out.println(comp.getValue());
            }
        }
    }

    public void sortArray(Compare [] compareArray){
        ArrayList<Compare> tempArray = new ArrayList<>();
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
            for(Compare inte: compareArray){
                //System.out.println(inte);
                tempArray.add(inte);

            }

            for(Compare h:compareArray){
               // System.out.println(h.getValue());
            }
            arrayList.add(tempArray);
            tempArray.clear();
        }


    }

    public void convertToArray(ArrayList<Compare> arrayList,Compare[] array){
        for(int i = 0; i < arrayList.size(); i++){
            array[i] = arrayList.get(i);
        }
    }


}
