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

    public void printArrayList(){
        for(int i = 0; i < arrayList.size();i++) {
            for (int j = 0; j < 5; j++) {
                ArrayList<Integer> array = new ArrayList<>();
                array = arrayList.get(i);
                System.out.println(array.get(j));
            }
        }
    }

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
        ArrayFiller filler = new ArrayFiller();
        BubbleSort sorter = new BubbleSort();
        Compare[] array = new Compare[10];

        filler.fillArray(10,array);
        //sorter.sortArray(array);

        //sorter.printArrayList();
        int[] array1 = new int[5];
        array1[0] = 10;
        array1[1] = 5;
        array1[2] = 7;
        array1[3] = 4;
        array1[4] = 1;

        TestMain henk = new TestMain();
        henk.bubbleSort(array1);
        //for(int i =0; i< array1.length;i++){
          //  System.out.println(array1[i]);
        //}

        henk.printArrayList();


    }
}
