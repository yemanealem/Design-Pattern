public class Main {
    public static void main(String[] args) {
        PaymentService payment =
                new PaymentAdapter(new OldPaymentGateway());

        payment.pay(500);
    }
}

/*

1️⃣ Intent / Purpose

Adapter converts the interface of a class into another interface the client expects.

Key points:

The client doesn’t know about the adaptee’s implementation.

Works like a translator or bridge.

Common in legacy system integration and API adaptation.

2️⃣ When to Use Adapter

Use it when:

You have existing classes that don’t match the interface you need.

You cannot change the existing class.

You want your client code to remain unchanged.

You need to integrate 3rd-party libraries or APIs with your system.

Examples:

Legacy payment system → new payment service interface

USB-C device → old USB port

Old logging library → modern logging framework

3️⃣ How It Works

Components:

Component	Role
Target (interface)	What the client expects
Adaptee (existing class)	Old / incompatible class
Adapter	Wraps the adaptee and implements the target interface
Client	Uses the target interface


*/