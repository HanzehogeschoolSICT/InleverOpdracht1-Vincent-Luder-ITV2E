import java.util.Random;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class Compare implements Comparable<Compare>{


    private int value;
    Random random = new Random();

    public Compare(){
        value = random.nextInt(10) ;
    }

    public int getValue(){
        return value;
    }

    @Override
    public int compareTo(Compare o) {
        if(this.getValue() < o.getValue()){
            return 1;
        }
        else if(this.getValue() > o.getValue()){
            return -1;
        }
        else{
            return 0;
        }

    }
}
