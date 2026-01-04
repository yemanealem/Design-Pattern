public class AdapterDemo {
    public static void main(String[] args) {
        PaymentGateway payment = new PaymentAdapter(new LegacyPaymentProcessor());
        payment.pay(250.0);
    }
}
