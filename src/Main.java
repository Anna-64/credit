public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = service.calculate(1000000, 12);
        double credit1 = service.calculate(1000000, 24);
        double credit2 = service.calculate(1000000, 36);
        System.out.println("Ежемесячный платеж при сроке кредита 1 год: " + credit);
        System.out.println("Ежемесячный платеж при сроке кредита 2 года: " + credit1);
        System.out.println("Ежемесячный платеж при сроке кредита 3 года: " + credit2);
    }
}
