package model;
import java.util.Arrays;
/**
 * Created by Gebruiker on 8-3-2017.
 * Bron gebruikt voor verggelijking: https://www.tutorialspoint.com/javaexamples/arrays_equal.htm
 */
public class BubbleSort{

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

    public boolean sortArray(int [] compareArray, boolean status){
        boolean isSorted = status;
        int[] check = new int[compareArray.length];
        if(isSorted) {
            System.out.println("array is sorted");
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
                isSorted = true;
            }
        }
        return isSorted;
    }
}