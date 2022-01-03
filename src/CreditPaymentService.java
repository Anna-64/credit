public class CreditPaymentService {
    public double calculate(double amount, double numberMonth) {
        double rate = 9.99;
        double creditRate = (rate / 12 / 100);
        double creditRateMonth = Math.pow(1 + creditRate, numberMonth);
        double ratio = creditRate * creditRateMonth / (creditRateMonth - 1);
        double creditPayment = (amount * ratio);
        return creditPayment;
    }
}
