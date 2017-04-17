package model;
import java.util.Arrays;
/**
 * Bron gebruikt voor verggelijking: https://www.tutorialspoint.com/javaexamples/arrays_equal.htm
 * Bron: Introduction to Java Programming, Comprehensive version
 */
public class BubbleSort implements Sorter{

    @Override
    public boolean sortArray(int [] array, boolean status){
        boolean isSorted = status;
        int[] check = new int[array.length];
        if(!isSorted) {
            for(int x=0; x<=array.length-1; x++ ){
                check[x] = array[x];
            }
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if(Arrays.equals(check, array)){
                isSorted = true;
            }
        }
        return isSorted;
    }


}