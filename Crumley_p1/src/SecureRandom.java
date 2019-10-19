import java.util.Random;
public class SecureRandom {
    Random rand = new Random();
    private int randNum;


    public int getRandNum(int bound) {
        randNum = rand.nextInt(bound);
        return randNum;
    }
}
