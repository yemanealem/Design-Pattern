public class ECommerceApp {
    public static void main(String[] args) {

        Order order = new Order.Builder(1001)
                .withShippingAddress("Stockholm, Sweden")
                .withDiscountCode("NEWYEAR")
                .withGiftWrap(true)
                .build();

        order.display();
        System.out.println();

        DatabaseConnection db = DatabaseConnection.getInstance();
        db.query("INSERT INTO orders (id, address) VALUES (1001, 'Stockholm')");

        System.out.println();

        NotificationFactory factory = new NotificationFactory();
        Notification email = factory.createNotification("email");
        email.send("Your order #1001 has been placed successfully!");

        Notification sms = factory.createNotification("sms");
        sms.send("Order #1001 confirmed. Thank you!");
    }
}

/*







*/
