public class CreditPaymentService {
    public int calculate(double amount, double timePeriod, double percent) {
        double monthlyPayment = amount * (percent + (percent / ((Math.pow(1 + percent, timePeriod)- 1))));

        return (int) monthlyPayment;
    }
}
