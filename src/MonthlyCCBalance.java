public class MonthlyCCBalance {
    public static void main(String[] args)
    {
        double balance = 5000.0;
        double  interestRate = 0.17;

        double firstMonthPayment = 0.0;
        double secondMonthPayment = 0.0;
        double totalBalance = 0.0;

        firstMonthPayment = balance * interestRate;
        System.out.println("The payment for fist month is $ " + firstMonthPayment);
        totalBalance = balance - firstMonthPayment;
        System.out.println( "The Total balance is " + totalBalance);


        secondMonthPayment= totalBalance * interestRate;
        totalBalance = totalBalance - secondMonthPayment;

        System.out.println( "The payment for second month is $ " + secondMonthPayment);
        System.out.println("The total balance is " +totalBalance);





    }
}