package model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Gebruiker on 9-3-2017.
 */
public class ArrayFiller {
    ArrayList<Compare> array = new ArrayList<>();

    public void fillArray(int limit,int[] compareArray){
        for(int i = 0; i < limit; i++ ){
            compareArray[i] = (new Random().nextInt(20 - 1) +1);
        }
    }



}
