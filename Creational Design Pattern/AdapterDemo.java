public class AdapterDemo {
    public static void main(String[] args) {
        PaymentGateway payment = new PaymentAdapter(new LegacyPaymentProcessor());
        payment.pay(250.0);
    }
}

/*


1️⃣ Intent (Purpose)

The Adapter Pattern allows two incompatible interfaces to work together.

You have an existing class (Adaptee) with one interface.

You have a client that expects a different interface (Target).

The Adapter converts the Adaptee interface into the Target interface.

Analogy:

Think of a power plug adapter:

Your device is European (2-pin plug)

The socket is American (3-pin)

The adapter converts your plug so it fits the socket.

2️⃣ Components of Adapter Pattern
Component	Our Example	Role
Target	PaymentGateway	Interface expected by the client (pay(double amount))
Adaptee	LegacyPaymentProcessor	Existing class with an incompatible method (makePayment(double money))
Adapter	PaymentAdapter	Wraps Adaptee and converts interface to Target
Client	AdapterDemo.main()	Uses the Target interface without worrying about Adaptee
3️⃣ How It Works (Step by Step)

Client wants to pay:

PaymentGateway payment = new PaymentAdapter(new LegacyPaymentProcessor());
payment.pay(250.0);


Client calls pay() (Target interface).

Adapter receives call:

Adapter holds a reference to LegacyPaymentProcessor.

Inside pay(), it translates the call to makePayment():

legacyProcessor.makePayment(amount);


Legacy system executes:

Old code runs as usual, no modification needed.

Output:

Processing payment of $250.0 through LegacyPaymentProcessor

4️⃣ Key Points

Why use it: Integrate existing code (legacy systems, third-party APIs) without changing it.

Structural Pattern: Deals with object composition, not behavior.

Reusability: Reuse old code with a new interface.

Flexibility: Client code doesn’t need to change even if the underlying Adaptee changes.

5️⃣ Real-World Example in E-Commerce

Payment Adapters:

Integrate PayPal, Stripe, or Bank API into a single PaymentGateway interface.

Shipping Adapters:

Integrate FedEx, DHL, UPS into a single ShippingService interface.

Logger Adapters:

Convert Log4j or SLF4J into a standard logging interface for your app.

6️⃣ UML-like Diagram (Text Version)
        +-----------------+
        |     Client      |
        |----------------|
        | pay()           |
        +--------+--------+
                 |
                 v
        +-----------------+
        |     Adapter     |  ---> wraps
        |----------------|
        | pay()           | calls
        +--------+--------+
                 |
                 v
        +-----------------+
        |    Adaptee      |
        |----------------|
        | makePayment()   |
        +-----------------+


✅ Summary:

Adapter = Translator between client and existing class.

Lets you reuse old code safely.

No changes to client or legacy code required.











*/





