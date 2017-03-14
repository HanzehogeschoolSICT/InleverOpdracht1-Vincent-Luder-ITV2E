package view;

import controller.BubbleSort;
import model.ArrayFiller;
import model.Compare;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Gebruiker on 9-3-2017.
 */
public class TestMain {
    ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();



    public  void bubbleSort(int[] numArray) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        int n = numArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;

                }

            }
            for(int inte: numArray){
                //System.out.println(inte);
                tempArray.add(inte);

            }

            for(int h:tempArray){
                System.out.println(h);
            }
            arrayList.add(tempArray);
            tempArray.clear();
        }
    }



    public static void main(String[] args) {
        ArrayList<Compare[]> arrayList = new ArrayList<>();


        ArrayFiller filler = new ArrayFiller();
        BubbleSort sorter = new BubbleSort();
        Compare[] array = new Compare[10];

        filler.fillArray(10,array);
        //sorter.sortArray(array,arrayList);

        //sorter.printArrayList(arrayList);

        TestMain henk = new TestMain();





    }
}
