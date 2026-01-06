class Order {
    private int orderId;
    private String shippingAddress;
    private String discountCode;
    private boolean giftWrap;

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.shippingAddress = builder.shippingAddress;
        this.discountCode = builder.discountCode;
        this.giftWrap = builder.giftWrap;
    }

    public void display() {
        System.out.println("Order #" + orderId);
        System.out.println("Shipping Address: " + shippingAddress);
        System.out.println("Discount Code: " + discountCode);
        System.out.println("Gift Wrap: " + giftWrap);
    }

    // Builder
    public static class Builder {
        private int orderId;
        private String shippingAddress;
        private String discountCode;
        private boolean giftWrap;

        public Builder(int orderId) {
            this.orderId = orderId;
        }

        public Builder withShippingAddress(String address) {
            this.shippingAddress = address;
            return this;
        }

        public Builder withDiscountCode(String code) {
            this.discountCode = code;
            return this;
        }

        public Builder withGiftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
