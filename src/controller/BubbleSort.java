package controller;


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

                    for (int compare : compareArray) {
                        System.out.println(compare);
                    }
                }
            }
            if(Arrays.equals(check, compareArray)){
                isSorted=true;
            }
        }
    }
}
