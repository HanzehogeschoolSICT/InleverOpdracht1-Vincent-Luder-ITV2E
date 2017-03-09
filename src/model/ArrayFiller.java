package model;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 9-3-2017.
 */
public class ArrayFiller {
    ArrayList<Compare> array = new ArrayList<>();




    public ArrayFiller(){

    }

    public void fillArray(int limit,ArrayList<Compare> compareArray){
        for(int i = 0; i < limit; i++ ){
            compareArray.add(new Compare());
        }
    }

    public void getSize(){
        System.out.println( array.size());

    }

}
