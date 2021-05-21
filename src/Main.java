public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int paymentYear1 = (int) service.calculate(1_000_000, 9.99, 1);
        System.out.println(paymentYear1);
        int paymentYear2 = (int) service.calculate(1_000_000, 9.99, 2);
        System.out.println(paymentYear2);
        int paymentYear3 = (int) service.calculate(1_000_000, 9.99, 3);
        System.out.println(paymentYear3);
    }
}
