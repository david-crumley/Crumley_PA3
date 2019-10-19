public class Application {

    public static void main (String[] args) {
        int i;

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        saver1.modifyInterestRate(.04);
        System.out.println("Interest rate:  4%");

        for (i = 0; i < 12; i++)    {
            System.out.printf("%.2f\n", saver1.calculateMonthlyInterest());
            System.out.printf("%.2f\n", saver2.calculateMonthlyInterest());
            System.out.println();
        }
        System.out.println();

        saver2.modifyInterestRate(.05);
        System.out.println("Interest rate:  5%");


        System.out.printf("%.2f\n", saver1.calculateMonthlyInterest());
        System.out.printf("%.2f\n", saver2.calculateMonthlyInterest());

    }
}
