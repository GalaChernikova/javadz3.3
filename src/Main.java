public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1_000_000;
        double timePeriod = 12;
        double percent = 9.99 / 100 / timePeriod;

        double monthlyPayment = service.calculate(amount, timePeriod, percent);

        System.out.println(monthlyPayment);
    }
}
