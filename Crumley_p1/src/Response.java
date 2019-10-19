public class Response {

    SecureRandom randResponse = new SecureRandom();

    public void checkAnswer(double userAnswer,double  correctAnswer, int[] results)  {
        if (Math.abs(userAnswer - correctAnswer) < .00001)    {
            talk(true);
            results[0]++;
        }
        else {
            talk(false);
            results[1]++;
        }
    }

    public void Suggestion(int numRight)    {
        int score = (numRight * 100) / 10;
        if (score < 76) {
            System.out.println("Please ask you're teacher for help.");
        }
        else if (score > 75){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
    }

    private void talk(boolean correct)  {
        int response = randResponse.getRandNum(4);;
        if (correct) {
            switch (response) {
                case 0:
                    System.out.println("Very good!");
                    break;
                case 1:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Nice work!");
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }
        else {
            switch (response) {
                case 0:
                    System.out.println("No. Please try again.");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don't give up!");
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    break;
            }
        }
    }
}
