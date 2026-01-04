class PaymentAdapter implements PaymentGateway {
    private LegacyPaymentProcessor legacyProcessor;

    public PaymentAdapter(LegacyPaymentProcessor legacyProcessor) {
        this.legacyProcessor = legacyProcessor;
    }

    @Override
    public void pay(double amount) {
        legacyProcessor.makePayment(amount);
    }
}
