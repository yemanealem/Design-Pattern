class PaymentAdapter implements PaymentService {

    private OldPaymentGateway oldGateway;

    public PaymentAdapter(OldPaymentGateway oldGateway) {
        this.oldGateway = oldGateway;
    }

    @Override
    public void pay(double amount) {
        oldGateway.makePayment(amount);
    }
}
