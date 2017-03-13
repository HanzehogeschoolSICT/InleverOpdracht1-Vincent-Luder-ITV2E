package model;

import java.util.Random;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class Compare implements Comparable<Compare>{


    private int value;
    Random random = new Random();

    public Compare(){
        value = random.nextInt(20) ;
    }

    public int getValue(){
        return value;
    }

    public void changeValue(int newValue){
        value = newValue;
    }

    @Override
    public int compareTo(Compare compareObject) {
        if(this.getValue() < compareObject.getValue()){
            return 1;
        }
        else if(this.getValue() > compareObject.getValue()){
            return -1;
        }
        else{
            return 0;
        }

    }
}
