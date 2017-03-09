package view;

import controller.BubbleSort;
import model.ArrayFiller;
import model.Compare;

/**
 * Created by Gebruiker on 9-3-2017.
 */
public class TestMain {

    public static void main(String[] args) {
        ArrayFiller filler = new ArrayFiller();
        BubbleSort sorter = new BubbleSort();
        Compare[] array = new Compare[10];

        filler.fillArray(10,array);
        sorter.sortArray(array);

        for(Compare value: array){
            System.out.println(value.getValue());
        }
    }
}
