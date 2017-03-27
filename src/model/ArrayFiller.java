package model;

import java.util.ArrayList;
import java.util.Random;


public class ArrayFiller {
    public void fillArray(int limit,int[] compareArray){
        for(int i = 0; i < limit; i++ ){
            compareArray[i] = (new Random().nextInt(20 - 1) +1);
        }
    }



}
