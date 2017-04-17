package helper;

import java.util.ArrayList;
import java.util.Random;


public  class ArrayFiller {
    public static void fillArray(int[] compareArray){
        for(int i = 0; i < compareArray.length; i++ ){
            compareArray[i] = (new Random().nextInt(20 - 1) +1);
        }
    }



}
