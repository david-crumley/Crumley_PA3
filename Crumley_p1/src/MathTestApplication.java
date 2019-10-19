import java.util.Scanner;
public class MathTestApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean keepGoing = true;
        int difficulty, type, i;
        double correctAnswer, userAnswer;
        int[] results = new int[2];
        while (keepGoing == true) {
            difficulty = 0;
            while (difficulty < 1 || difficulty > 4) {
                System.out.println("Enter difficulty: 1 = easiest, 4 = Hardest");
                difficulty = in.nextInt();
            }

            System.out.println("Enter 1 - 4 for operation type");
            System.out.println("Enter 5 for random operation questions");
            type = in.nextInt();
            Test next = new Test(difficulty);
            Response randResponse = new Response();
            for (i = 0; i < 10; i++)    {
                switch(type)    {
                    case 1:
                        correctAnswer = next.poseAdditionQuestion();
                        break;
                    case 2:
                        correctAnswer = next.poseMultiplicationQuestion();
                        break;
                    case 3:
                        correctAnswer = next.poseSubtractionQuestion();
                        break;
                    case 4:
                        correctAnswer = next.poseDivisionQuestion();
                        break;
                    case 5:
                        correctAnswer = next.poseRandomQuestion();
                        break;
                    default:
                        System.out.println("Not a valid answer");
                        continue;
                }
                userAnswer = in.nextInt();
                randResponse.checkAnswer(userAnswer, correctAnswer, results);
            }
            System.out.printf("Results:");
            System.out.printf("%22s%-4d\n", "Total right answers:", results[0]);
            System.out.printf("%22s%-4d\n\n", "Total wring answers:", results[1]);

            randResponse.Suggestion(results[0]);
            System.out.println("Would you like to continue? (1 for yes, 0 for no)");
            keepGoing = in.nextBoolean();
        }
    }
}