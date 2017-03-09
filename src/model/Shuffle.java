package model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class Shuffle {

    private ArrayList<Integer> array;


    public Shuffle(){
        this.array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(0);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
    }



    public ArrayList<Integer> shuffleArray(int amountOfShuffle) {
        Random random = new Random();
        int shuffle = random.nextInt(array.size());
        int position = random.nextInt(array.size());
        int i = 0;

        while(i < amountOfShuffle){
            Integer temp = array.get(shuffle);
            array.remove(temp);
            array.add(position,temp);
            i++;
        }



        //System.out.println(shuffle);


        return array;
    }
}
