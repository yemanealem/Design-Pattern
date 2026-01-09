public class FacadeMain {
    public static void main(String[] args) {

        OrderSubsystems.InventoryService inventory =
                new OrderSubsystems.InventoryService();

        OrderSubsystems.PaymentService payment =
                new OrderSubsystems.PaymentService();

        OrderSubsystems.ShippingService shipping =
                new OrderSubsystems.ShippingService();

        OrderSubsystems.NotificationService notification =
                new OrderSubsystems.NotificationService();

        inventory.checkStock("P123");
        payment.makePayment(500);
        shipping.ship("P123");
        notification.sendConfirmation();
    }
}
