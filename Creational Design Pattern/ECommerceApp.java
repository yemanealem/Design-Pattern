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


1️⃣ Builder Pattern vs Factory Method Pattern
A. Builder Pattern (Creational)

Definition:

Separates the construction of a complex object from its representation.

Allows step-by-step creation of an object with multiple optional parameters.

Key Characteristics:

Focuses on how to construct a complex object.

Often uses a fluent interface for method chaining.

Usually returns the same type of object but with different configurations.

Scenario in E-Commerce:

An Order object with many optional fields:

shippingAddress

discountCode

giftWrap

priorityShipping

Usage Example:

Order order = new Order.Builder(1001)
                .withShippingAddress("Stockholm")
                .withDiscountCode("NEWYEAR")
                .withGiftWrap(true)
                .build();


Explanation:

You are constructing a complex order step by step.

Client doesn’t need to know about the inner details of order creation.

Focus is on configuring object properties flexibly.

B. Factory Method Pattern (Creational)

Definition:

Defines an interface for creating objects, but lets subclasses or a factory decide which concrete class to instantiate.

Key Characteristics:

Focuses on what object to create, not how to construct it.

Returns objects from a hierarchy of types.

Client only deals with the interface, not the concrete implementation.

Scenario in E-Commerce:

Notifications: Email, SMS, Push notifications.

Usage Example:

NotificationFactory factory = new NotificationFactory();
Notification email = factory.createNotification("email");
Notification sms = factory.createNotification("sms");


Explanation:

Client asks for a type of notification.

Factory decides which concrete class to create (EmailNotification, SMSNotification).

Focus is on choosing the correct object type, not building it step by step.

C. Key Differences
Feature	Builder Pattern	Factory Method Pattern
Purpose	Construct complex objects step by step	Create objects from a family of types
Focus	How to build an object	Which object to create
Return Type	Usually same class with different configs	Usually different subclasses of a type
Method	Step-by-step fluent API	Single method that returns the object
Use Case	Object with many optional fields	Object from multiple concrete types
Example in E-Commerce	Order creation with optional gift wrap, discount	Notification system (Email, SMS)
D. Analogy

Builder Pattern: Think of building a custom pizza — choose dough, sauce, toppings, cheese. Step by step, you get a unique pizza.

Factory Method Pattern: Think of ordering a type of pizza from a menu — you ask for Margherita or Pepperoni, and the kitchen gives you the pizza. You don’t care about how it’s built.

✅ E. Quick Rule of Thumb

Use Builder → when you need flexible, step-by-step construction of one complex object.

Use Factory Method → when you need to select one object from many types and hide the instantiation logic.




*/
