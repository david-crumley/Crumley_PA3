public class Test   {

    private int bound;
    private int a;
    private int b;
    private SecureRandom rand = new SecureRandom();

    public Test(int difficulty) {
        bound = createBound(difficulty);
    }

    private int createBound(int difficulty)    {
        int i;
        int bound = 1;
        for (i = 0; i < difficulty; i++)    {
            bound *= 10;
        }
        return bound;
    }

    private int getNum()   {
        return rand.getRandNum(bound);
    }

    public int poseAdditionQuestion()    {
        a = getNum();
        b = getNum();
        System.out.println("How much is " + a + " plus " + b + "?");
        return a + b;
    }

    public int poseSubtractionQuestion()    {
        a = getNum();
        b = getNum();
        System.out.println("How much is " + a + " minus " + b + "?");
        return a - b;
    }

    public int poseMultiplicationQuestion() {
        a = getNum();
        b = getNum();
        System.out.println("How much is " + a + " times " + b + "?");
        return a * b;
    }

    public int poseDivisionQuestion()   {
        a = getNum();
        b = getNum();
        System.out.println("How much is " + a + " divided by " + b + "?");
        return a / b;
    }

    public int poseRandomQuestion() {
        int opSelector = rand.getRandNum(4);
        switch(opSelector)  {
            case 0:
                return poseAdditionQuestion();
            case 1:
                return poseSubtractionQuestion();
            case 2:
                return poseMultiplicationQuestion();
            case 3:
                return poseDivisionQuestion();
            default:
                System.out.println("Something went wrong!");
                return 0;
        }
    }

}
