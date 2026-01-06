public class Main {
    public static void main(String[] args) {
        PaymentService payment =
                new PaymentAdapter(new OldPaymentGateway());

        payment.pay(500);
    }
}
