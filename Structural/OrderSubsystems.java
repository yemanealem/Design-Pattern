public class OrderSubsystems {

    // Inventory Service
    static class InventoryService {
        void checkStock(String productId) {
            System.out.println("Stock checked for product: " + productId);
        }
    }

    // Payment Service
    static class PaymentService {
        void makePayment(double amount) {
            System.out.println("Payment successful: " + amount);
        }
    }

    // Shipping Service
    static class ShippingService {
        void ship(String productId) {
            System.out.println("Order shipped for product: " + productId);
        }
    }

    // Notification Service
    static class NotificationService {
        void sendConfirmation() {
            System.out.println("Confirmation sent to customer");
        }
    }
}
