public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

   public SavingsAccount(double startingBalance)    {
       savingsBalance = startingBalance;
   }

    public double calculateMonthlyInterest  ()  {
        savingsBalance += savingsBalance * (annualInterestRate / 12.0);
        return savingsBalance;
    }

    public static void modifyInterestRate(double newValue)  {
        annualInterestRate = newValue;
    }
}
