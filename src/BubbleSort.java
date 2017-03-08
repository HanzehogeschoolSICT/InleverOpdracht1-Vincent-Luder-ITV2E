import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class BubbleSort {

    ArrayList<Compare> compareArrayList = new ArrayList<>();
    Compare[] compareArray = new Compare[10];


    public BubbleSort(Compare [] array){
        compareArray = array;
    }

    public BubbleSort(){


    }

    public void sortArray(){


        boolean nextPass = true;

        for(int k = 1; k < compareArray.length && nextPass; k++){
            nextPass = false;

            for (int j = 0; j < compareArray.length -k; j++){
                if(compareArray[j].compareTo(compareArray[j+1]) == -1){
                    Compare temp = compareArray[j];
                    compareArray[j] = compareArray[j +1];
                    compareArray[j+1] = temp;

                    nextPass = true;
                }
            }
        }

    }

    public void fillArrayList(){
        for(Compare comp: compareArray){
            compareArrayList.add(comp);
        }
    }

    public ArrayList<Compare> shuffleArray(int amountOfShuffle) {
        Random random = new Random();
        int shuffle = random.nextInt(compareArrayList.size());
        int position = random.nextInt(compareArrayList.size());
        int i = 0;

        while(i < amountOfShuffle){
            Compare temp = compareArrayList.get(shuffle);
            compareArrayList.remove(temp);
            compareArrayList.add(position,temp);
            i++;
        }

        return compareArrayList;
    }

    public void getRandomList(){
        for(Compare value : compareArrayList){
            System.out.println(value.getValue());
        }
    }

    public void getValues(){
        for(int l = 0; l < compareArray.length; l++){
            System.out.print( + compareArray[l].getValue() + " ");
        }
    }

    public void run() {
        fillArrayList();
        shuffleArray(10);
        getRandomList();
        sortArray();
        //getValues();
    }
}
