import java.util.Random;

public class Dice {

    public int numOfDice;


    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }
    public Integer tossAndSum() {
        int sum = 0;
        for(int i=0; i<this.numOfDice; i++) {
            sum += getRoll();
        }
        return sum;
    }

    public int getRoll() {
        Random random = new Random();
        return (random.nextInt(6)+1);
    }


}
