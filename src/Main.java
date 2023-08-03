public class Main {

    public static void main(String[] args) {
        Checkout checkoutSystem = new Checkout();

        // Green tea price is £3.11 by default
        checkoutSystem.scan("GR1");
        // Strawberries price is £5.00 and we bought 2, so the total price is £10.00
        checkoutSystem.scan("SR1");
        checkoutSystem.scan("SR1");
        checkoutSystem.scan("SR1");
        // Coffee price is £11.23 and we bought 3, so the total price is £33.69 (2/3 discount applies)
        checkoutSystem.scan("CF1");
        checkoutSystem.scan("CF1");

        System.out.println("Total price expected: £" + checkoutSystem.getTotalPrice()); // Output: Total price expected: £46.80
    }
}

